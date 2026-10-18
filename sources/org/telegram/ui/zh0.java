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
public final class zh0 extends FrameLayout {
    public final int f43774a;
    public final oi0 f43775b;

    public zh0(oi0 oi0Var, Context context, int i10) {
        super(context);
        this.f43774a = i10;
        this.f43775b = oi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f43774a) {
            case 0:
                super.dispatchDraw(canvas);
                oi0 oi0Var = this.f43775b;
                ai0 ai0Var = oi0Var.f39809a0;
                ai0Var.e(canvas);
                ArrayList arrayList = ai0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.d.h(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.f40276r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.f40277s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.f40277s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.f40277s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.f40277s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.f40277s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    oi0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ai0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                oi0 oi0Var2 = this.f43775b;
                pa0 pa0Var = oi0Var2.d;
                if (pa0Var != null) {
                    if (oi0Var2.E == 1.0f && oi0Var2.f39824n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pa0Var.a(z10);
                }
                if (oi0Var2.E > 0.0f && oi0Var2.f39824n != null) {
                    oi0Var2.f39829r.reset();
                    float width = getWidth() / oi0Var2.f39816f.getWidth();
                    oi0Var2.f39829r.postScale(width, width);
                    oi0Var2.h.setLocalMatrix(oi0Var2.f39829r);
                    oi0Var2.f39824n.setAlpha((int) (oi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), oi0Var2.f39824n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43774a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43775b.onBackPressed();
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
        bi0 bi0Var;
        int height;
        switch (this.f43774a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                oi0 oi0Var = this.f43775b;
                if (!oi0Var.f39818g0 || oi0Var.f39819h0) {
                    ArrayList arrayList = oi0Var.N;
                    hi0 hi0Var = oi0Var.K;
                    if (oi0Var.F.getWidth() > 0) {
                        oi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.kk.D(6.0f, oi0Var.W.getWidth() - oi0Var.W.l(), iArr[0])};
                        oi0Var.X.setScaleX(oi0Var.W.getScaleX());
                        oi0Var.X.setScaleY(oi0Var.W.getScaleY());
                        int[] iArr2 = oi0Var.f39826o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = hi0Var.getMeasuredHeight() - oi0Var.X.getHeight();
                        if (oi0Var.f39815e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + oi0Var.e.f12287b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = oi0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (oi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - oi0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (oi0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - oi0Var.W.getHeight();
                        }
                        oi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (bi0Var.getWidth() - oi0Var.X.l())));
                        oi0Var.X.setY(iArr[1]);
                        if (oi0Var.m0) {
                            iArr[0] = iArr[0] - (oi0Var.Y - oi0Var.W.l());
                        }
                        hi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - hi0Var.getMeasuredWidth());
                        if (oi0Var.f39818g0) {
                            org.telegram.messenger.kk.t(hi0Var.animate().translationY(((oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight()) - hi0Var.getTop()), li.m.V, 250L);
                        } else {
                            hi0Var.setY((oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = oi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - oi0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = oi0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = oi0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = oi0Var.f39814d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (oi0Var.X.l() + iArr[0]) - oi0Var.f39814d0.getMeasuredWidth(), 0));
                            RectF rectF = oi0Var.f39823l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = oi0Var.f39814d0;
                                float max = Math.max(oi0Var.e.f12287b, rectF.top - frameLayout2.getMeasuredWidth());
                                oi0Var.f39813c0 = max;
                                frameLayout2.setY(max);
                                ci0 ci0Var = oi0Var.f39815e0;
                                if (ci0Var != null) {
                                    ci0Var.setY(Math.max(oi0Var.e.f12287b, (oi0Var.f39823l0.top - AndroidUtilities.dp(24.0f)) - oi0Var.f39815e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = oi0Var.f39814d0;
                                float max2 = Math.max(oi0Var.e.f12287b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                oi0Var.f39813c0 = max2;
                                frameLayout3.setY(max2);
                                ci0 ci0Var2 = oi0Var.f39815e0;
                                if (ci0Var2 != null) {
                                    ci0Var2.setY(Math.max(0.0f, (height2 - ci0Var2.getMeasuredHeight()) - oi0Var.f39813c0));
                                }
                            }
                        }
                    }
                    oi0Var.f39818g0 = true;
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
        switch (this.f43774a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                oi0 oi0Var = this.f43775b;
                hh.d.c(oi0Var.f39821j0, oi0Var.F);
                ViewGroup viewGroup = oi0Var.Z;
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
