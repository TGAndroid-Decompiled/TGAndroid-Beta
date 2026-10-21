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
public final class xh0 extends FrameLayout {
    public final int f43219a;
    public final mi0 f43220b;

    public xh0(mi0 mi0Var, Context context, int i10) {
        super(context);
        this.f43219a = i10;
        this.f43220b = mi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f43219a) {
            case 0:
                super.dispatchDraw(canvas);
                mi0 mi0Var = this.f43220b;
                yh0 yh0Var = mi0Var.Z;
                yh0Var.e(canvas);
                ArrayList arrayList = yh0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ny nyVar = (ny) i2.e.h(1, arrayList);
                    ImageReceiver imageReceiver = nyVar.f39718r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (nyVar.f39719s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                nyVar.f39719s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                nyVar.f39719s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (nyVar.f39719s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(nyVar.f39719s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    mi0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!yh0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                mi0 mi0Var2 = this.f43220b;
                if (mi0Var2.f39287y > 0.0f && mi0Var2.h != null) {
                    mi0Var2.f39271n.reset();
                    float width = getWidth() / mi0Var2.e.getWidth();
                    mi0Var2.f39271n.postScale(width, width);
                    mi0Var2.f39263f.setLocalMatrix(mi0Var2.f39271n);
                    mi0Var2.h.setAlpha((int) (mi0Var2.f39287y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mi0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43219a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43220b.onBackPressed();
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
        zh0 zh0Var;
        int height;
        switch (this.f43219a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                mi0 mi0Var = this.f43220b;
                if (!mi0Var.f39264f0 || mi0Var.f39265g0) {
                    ArrayList arrayList = mi0Var.M;
                    fi0 fi0Var = mi0Var.J;
                    if (mi0Var.E.getWidth() > 0) {
                        mi0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.mk.D(6.0f, mi0Var.V.getWidth() - mi0Var.V.l(), iArr[0])};
                        mi0Var.W.setScaleX(mi0Var.V.getScaleX());
                        mi0Var.W.setScaleY(mi0Var.V.getScaleY());
                        int[] iArr2 = mi0Var.f39272n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = fi0Var.getMeasuredHeight() - mi0Var.W.getHeight();
                        if (mi0Var.f39261d0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + mi0Var.d.f12284b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = mi0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (mi0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - mi0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (mi0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - mi0Var.V.getHeight();
                        }
                        mi0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (zh0Var.getWidth() - mi0Var.W.l())));
                        mi0Var.W.setY(iArr[1]);
                        if (mi0Var.f39270l0) {
                            iArr[0] = iArr[0] - (mi0Var.X - mi0Var.V.l());
                        }
                        fi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - fi0Var.getMeasuredWidth());
                        if (mi0Var.f39264f0) {
                            org.telegram.messenger.mk.t(fi0Var.animate().translationY(((mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight()) - fi0Var.getTop()), li.m.V, 250L);
                        } else {
                            fi0Var.setY((mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = mi0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - mi0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = mi0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = mi0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = mi0Var.f39260c0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (mi0Var.W.l() + iArr[0]) - mi0Var.f39260c0.getMeasuredWidth(), 0));
                            RectF rectF = mi0Var.f39269k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = mi0Var.f39260c0;
                                float max = Math.max(mi0Var.d.f12284b, rectF.top - frameLayout2.getMeasuredWidth());
                                mi0Var.f39258b0 = max;
                                frameLayout2.setY(max);
                                ai0 ai0Var = mi0Var.f39261d0;
                                if (ai0Var != null) {
                                    ai0Var.setY(Math.max(mi0Var.d.f12284b, (mi0Var.f39269k0.top - AndroidUtilities.dp(24.0f)) - mi0Var.f39261d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = mi0Var.f39260c0;
                                float max2 = Math.max(mi0Var.d.f12284b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                mi0Var.f39258b0 = max2;
                                frameLayout3.setY(max2);
                                ai0 ai0Var2 = mi0Var.f39261d0;
                                if (ai0Var2 != null) {
                                    ai0Var2.setY(Math.max(0.0f, (height2 - ai0Var2.getMeasuredHeight()) - mi0Var.f39258b0));
                                }
                            }
                        }
                    }
                    mi0Var.f39264f0 = true;
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
        switch (this.f43219a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                mi0 mi0Var = this.f43220b;
                hh.d.c(mi0Var.f39267i0, mi0Var.E);
                ViewGroup viewGroup = mi0Var.Y;
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
