package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class yh0 extends FrameLayout {
    public final int f46066a;
    public final ni0 f46067b;

    public yh0(ni0 ni0Var, Context context, int i10) {
        super(context);
        this.f46066a = i10;
        this.f46067b = ni0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f46066a) {
            case 0:
                super.dispatchDraw(canvas);
                ni0 ni0Var = this.f46067b;
                zh0 zh0Var = ni0Var.Z;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ny nyVar = (ny) ic.a.g(1, arrayList);
                    ImageReceiver imageReceiver = nyVar.f42030r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (nyVar.f42031s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                nyVar.f42031s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                nyVar.f42031s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (nyVar.f42031s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(nyVar.f42031s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    ni0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!zh0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ni0 ni0Var2 = this.f46067b;
                if (ni0Var2.f41933y > 0.0f && ni0Var2.h != null) {
                    ni0Var2.f41917n.reset();
                    float width = getWidth() / ni0Var2.e.getWidth();
                    ni0Var2.f41917n.postScale(width, width);
                    ni0Var2.f41909f.setLocalMatrix(ni0Var2.f41917n);
                    ni0Var2.h.setAlpha((int) (ni0Var2.f41933y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ni0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f46066a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f46067b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int measuredHeight;
        ai0 ai0Var;
        int height;
        switch (this.f46066a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ni0 ni0Var = this.f46067b;
                if (!ni0Var.f41910f0 || ni0Var.f41911g0) {
                    ArrayList arrayList = ni0Var.M;
                    gi0 gi0Var = ni0Var.J;
                    if (ni0Var.E.getWidth() > 0) {
                        ni0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {d3.w(6.0f, ni0Var.V.getWidth() - ni0Var.V.l(), iArr[0])};
                        ni0Var.W.setScaleX(ni0Var.V.getScaleX());
                        ni0Var.W.setScaleY(ni0Var.V.getScaleY());
                        int[] iArr2 = ni0Var.f41918n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = gi0Var.getMeasuredHeight() - ni0Var.W.getHeight();
                        if (ni0Var.f41907d0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ni0Var.d.f13451b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = ni0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ni0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ni0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ni0Var.V.getHeight();
                        }
                        ni0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ai0Var.getWidth() - ni0Var.W.l())));
                        ni0Var.W.setY(iArr[1]);
                        if (ni0Var.f41916l0) {
                            iArr[0] = iArr[0] - (ni0Var.X - ni0Var.V.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.f41910f0) {
                            org.telegram.messenger.vh.q(gi0Var.animate().translationY(((ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), mi.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = ni0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ni0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ni0Var.f41906c0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.t.c(6.0f, (ni0Var.W.l() + iArr[0]) - ni0Var.f41906c0.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.f41915k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.f41906c0;
                                float max = Math.max(ni0Var.d.f13451b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.f41904b0 = max;
                                frameLayout2.setY(max);
                                bi0 bi0Var = ni0Var.f41907d0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.d.f13451b, (ni0Var.f41915k0.top - AndroidUtilities.dp(24.0f)) - ni0Var.f41907d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.f41906c0;
                                float max2 = Math.max(ni0Var.d.f13451b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.f41904b0 = max2;
                                frameLayout3.setY(max2);
                                bi0 bi0Var2 = ni0Var.f41907d0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height2 - bi0Var2.getMeasuredHeight()) - ni0Var.f41904b0));
                                }
                            }
                        }
                    }
                    ni0Var.f41910f0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f46066a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ni0 ni0Var = this.f46067b;
                ih.d.c(ni0Var.f41913i0, ni0Var.E);
                ViewGroup viewGroup = ni0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
