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
public final class vh0 extends FrameLayout {
    public final int f43602a;
    public final ki0 f43603b;

    public vh0(ki0 ki0Var, Context context, int i10) {
        super(context);
        this.f43602a = i10;
        this.f43603b = ki0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f43602a) {
            case 0:
                super.dispatchDraw(canvas);
                ki0 ki0Var = this.f43603b;
                wh0 wh0Var = ki0Var.W;
                wh0Var.e(canvas);
                ArrayList arrayList = wh0Var.B;
                boolean z11 = true;
                float f9 = -1.0f;
                if (!arrayList.isEmpty()) {
                    qy qyVar = (qy) j7.l1.i(1, arrayList);
                    ImageReceiver imageReceiver = qyVar.f41812r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (qyVar.f41813s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                qyVar.f41813s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                qyVar.f41813s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (qyVar.f41813s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(qyVar.f41813s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f9 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f9 != -2.0f) {
                    ki0Var.T.h((f9 < 0.0f || f9 >= 1.0f) ? false : false);
                }
                if (!wh0Var.B.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ki0 ki0Var2 = this.f43603b;
                jf.s0 s0Var = ki0Var2.d;
                if (s0Var != null) {
                    if (ki0Var2.A == 1.0f && ki0Var2.f39889n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s0Var.a(z10);
                }
                if (ki0Var2.A > 0.0f && ki0Var2.f39889n != null) {
                    ki0Var2.f39894r.reset();
                    float width = getWidth() / ki0Var2.f39881f.getWidth();
                    ki0Var2.f39894r.postScale(width, width);
                    ki0Var2.h.setLocalMatrix(ki0Var2.f39894r);
                    ki0Var2.f39889n.setAlpha((int) (ki0Var2.A * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ki0Var2.f39889n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43602a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43603b.onBackPressed();
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
        float f9;
        int measuredHeight;
        xh0 xh0Var;
        int height;
        switch (this.f43602a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ki0 ki0Var = this.f43603b;
                if (!ki0Var.f39877c0 || ki0Var.f39878d0) {
                    ArrayList arrayList = ki0Var.J;
                    di0 di0Var = ki0Var.G;
                    if (ki0Var.B.getWidth() > 0) {
                        ki0Var.S.getLocationOnScreen(r13);
                        int[] iArr = {b.C(6.0f, ki0Var.S.getWidth() - ki0Var.S.l(), iArr[0])};
                        ki0Var.T.setScaleX(ki0Var.S.getScaleX());
                        ki0Var.T.setScaleY(ki0Var.S.getScaleY());
                        int[] iArr2 = ki0Var.f39887k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = di0Var.getMeasuredHeight() - ki0Var.T.getHeight();
                        if (ki0Var.f39873a0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ki0Var.f39879e.f8187b;
                        if (arrayList.isEmpty()) {
                            f9 = -6.0f;
                        } else {
                            f9 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f9);
                        ViewGroup viewGroup = ki0Var.V;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ki0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ki0Var.f39879e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ki0Var.S.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ki0Var.S.getHeight();
                        }
                        ki0Var.T.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (xh0Var.getWidth() - ki0Var.T.l())));
                        ki0Var.T.setY(iArr[1]);
                        if (ki0Var.f39885i0) {
                            iArr[0] = iArr[0] - (ki0Var.U - ki0Var.S.l());
                        }
                        di0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - di0Var.getMeasuredWidth());
                        if (ki0Var.f39877c0) {
                            b.q(di0Var.animate().translationY(((ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight()) - di0Var.getTop()), uh.m.V, 250L);
                        } else {
                            di0Var.setY((ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ki0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ki0Var.V.getMeasuredWidth());
                            ViewGroup viewGroup3 = ki0Var.V;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ki0Var.T.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ki0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(j7.l1.d(6.0f, (ki0Var.T.l() + iArr[0]) - ki0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = ki0Var.f39884h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ki0Var.Z;
                                float max = Math.max(ki0Var.f39879e.f8187b, rectF.top - frameLayout2.getMeasuredWidth());
                                ki0Var.Y = max;
                                frameLayout2.setY(max);
                                yh0 yh0Var = ki0Var.f39873a0;
                                if (yh0Var != null) {
                                    yh0Var.setY(Math.max(ki0Var.f39879e.f8187b, (ki0Var.f39884h0.top - AndroidUtilities.dp(24.0f)) - ki0Var.f39873a0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ki0Var.Z;
                                float max2 = Math.max(ki0Var.f39879e.f8187b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ki0Var.Y = max2;
                                frameLayout3.setY(max2);
                                yh0 yh0Var2 = ki0Var.f39873a0;
                                if (yh0Var2 != null) {
                                    yh0Var2.setY(Math.max(0.0f, (height2 - yh0Var2.getMeasuredHeight()) - ki0Var.Y));
                                }
                            }
                        }
                    }
                    ki0Var.f39877c0 = true;
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
        switch (this.f43602a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ki0 ki0Var = this.f43603b;
                rg.c.c(ki0Var.f39882f0, ki0Var.B);
                ViewGroup viewGroup = ki0Var.V;
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
