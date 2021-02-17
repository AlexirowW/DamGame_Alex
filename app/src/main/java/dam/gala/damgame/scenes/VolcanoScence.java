package dam.gala.damgame.scenes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

import androidx.core.content.res.ResourcesCompat;

import com.example.damgame.R;

import dam.gala.damgame.activities.GameActivity;
import dam.gala.damgame.utils.GameUtil;

public class VolcanoScence extends Scene{
    private GameActivity gameActivity;


    /**
     * Construye la escena del juego
     *
     * @param gameActivity Actividad principal del juego
     */
    public VolcanoScence(GameActivity gameActivity){
        super(gameActivity);
        this.gameActivity = gameActivity;
        this.backgroundScenes = new int[]{this.getBouncyBitmapId()};
        this.xCurrentImg=0;
        this.xNextImg = this.getScreenWidth()-1;
    }
    @Override
    public int getQuestionViewWidth() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_quest_d, this.gameActivity.getTheme()).getMinimumWidth();
    }

    @Override
    public int getQuestionViewHeight() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_quest_d, this.gameActivity.getTheme()).getMinimumHeight();
    }

    @Override
    public Bitmap getQuestionViewBitmap(int complexity) {
        if(complexity == GameUtil.PREGUNTA_COMPLEJIDAD_ALTA)
            return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_quest_d);
        else
            return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_quest_e);
    }

    @Override
    public int getQuestionViewImgNumber() {
        return 4;
    }

    @Override
    public int getBouncyViewWidth() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_bird, this.gameActivity.getTheme()).getMinimumWidth();
    }

    @Override
    public int getBouncyViewHeight() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_bird, this.gameActivity.getTheme()).getMinimumHeight();
    }

    @Override
    public Bitmap getBouncyViewBitmap() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_bird);
    }

    @Override
    public int getBouncyViewImgNumber() {
        return 4;
    }

    @Override
    public int getBouncyBitmapId() {
        return R.drawable.volcano_bg;
    }

    @Override
    public int[] getBackgroundScenes() {
        return backgroundScenes;
    }

    @Override
    public int getxCurrentImg() {
        return xCurrentImg;
    }

    @Override
    public int getxNextImg() {
        return xNextImg;
    }

    @Override
    public void setxCurrentImg(int xCurrentImg) {
        this.xCurrentImg = xCurrentImg;
    }

    @Override
    public void setxNextImg(int xNextImg) {
        this.xNextImg = xNextImg;
    }

    @Override
    public int getCurrentImgIndex() {
        return this.currentImgIndex;
    }

    @Override
    public void setCurrentImgIndex(int currentImgIndex) {
        this.currentImgIndex = currentImgIndex;
    }

    @Override
    public int getNextImgIndex() {
        return this.nextImgIndex;
    }

    @Override
    public void setNextImgIndex(int nextImgIndex) {
        this.nextImgIndex = nextImgIndex;
    }

    @Override
    public int getExplosionViewWidth() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_explosion, this.gameActivity.getTheme()).getMinimumWidth();
    }

    @Override
    public int getExplosionViewHeight() {
        return ResourcesCompat.getDrawable(this.gameActivity.getResources(),
                R.drawable.volcano_explosion, this.gameActivity.getTheme()).getMinimumHeight();
    }

    @Override
    public int getExplosionBitmapId() {
        return R.drawable.volcano_explosion;
    }

    @Override
    public int getExplosionViewImgNumber() {
        return 4;
    }

    @Override
    public Bitmap getExplosionViewBitmap() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_explosion);
    }

    @Override
    public View getCharacterView() {
        return null;
    }


    //TODO No utilizar estos audios, sustituirlos por los míos
    @Override
    public int getAudioPlay() {
        return R.raw.my_street;
    }

    @Override
    public int getAudioExplosion() {
        return R.raw.explosion;
    }

    @Override
    public int getAudioCrash() {
        return R.raw.crash;
    }

    @Override
    public int getAudioEndGame() {
        return R.raw.forgotten_eyes;
    }

    @Override
    public int getCrashViewWidth() {
        return this.getCrashViewBitmapTop().getWidth();
    }

    @Override
    public int getCrashViewHeight() {
        return this.getCrashViewBitmapTop().getHeight();
    }

    @Override
    public Bitmap getCrashViewBitmapTop() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_column_down);
    }

    @Override
    public Bitmap getCrashViewBitmapDown() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_column_top);
    }

    @Override
    public int getQuesExplosionViewWidth() {
        return this.getQuesExplosionViewBitmap().getWidth();
    }

    @Override
    public int getQuesExplosionViewHeight() {
        return this.getQuesExplosionViewBitmap().getHeight();
    }

    @Override
    public int getQuesExplosionBitmapId() {
        return R.drawable.volcano_explosion;
    }

    @Override
    public int getQuesExplosionViewImgNumber() {
        return 4;
    }

    @Override
    public Bitmap getQuesExplosionViewBitmap() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_explosion);
    }

    @Override
    public int getAudioQuestionCatched() {
        return R.raw.shimmer;
    }

    @Override
    public Bitmap getScoreLifes() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_lives_score);
    }

    @Override
    public Bitmap getScorePoints() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.desert_points_score);
    }

    @Override
    public Bitmap getScoreAnswers() {
        return BitmapFactory.decodeResource(gameActivity.getResources(), R.drawable.volcano_answer_score);
    }

   public int getAudioQuestionExplosion() {
        return R.raw.shimmer;
    }
}
