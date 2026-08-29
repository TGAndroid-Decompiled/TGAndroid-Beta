package wd;

import android.view.MotionEvent;
import android.view.View;
public interface a {
    boolean forceEnableVibration();

    long getLongPressDuration();

    boolean ignoreHapticFeedbackSettings(float f9, float f10);

    boolean needCancelTouchBySlopMove();

    boolean needClickAt(View view, float f9, float f10);

    boolean needLongPress(float f9, float f10);

    void onClickAt(View view, float f9, float f10);

    void onClickTouchDown(View view, float f9, float f10);

    void onClickTouchMove(View view, float f9, float f10);

    void onClickTouchUp(View view, float f9, float f10);

    void onLongPressCancelled(View view, float f9, float f10);

    void onLongPressFinish(View view, float f9, float f10);

    void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12);

    boolean onLongPressRequestedAt(View view, float f9, float f10);
}
