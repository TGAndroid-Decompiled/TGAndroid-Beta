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
    public final int f43748a;
    public final oi0 f43749b;

    public zh0(oi0 oi0Var, Context context, int i10) {
        super(context);
        this.f43748a = i10;
        this.f43749b = oi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f43748a) {
            case 0:
                super.dispatchDraw(canvas);
                oi0 oi0Var = this.f43749b;
                ai0 ai0Var = oi0Var.f39788a0;
                ai0Var.e(canvas);
                ArrayList arrayList = ai0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i0.a.h(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.f40270r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.f40271s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.f40271s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.f40271s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.f40271s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.f40271s);
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
                oi0 oi0Var2 = this.f43749b;
                pa0 pa0Var = oi0Var2.d;
                if (pa0Var != null) {
                    if (oi0Var2.E == 1.0f && oi0Var2.f39803n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pa0Var.a(z10);
                }
                if (oi0Var2.E > 0.0f && oi0Var2.f39803n != null) {
                    oi0Var2.f39808r.reset();
                    float width = getWidth() / oi0Var2.f39795f.getWidth();
                    oi0Var2.f39808r.postScale(width, width);
                    oi0Var2.h.setLocalMatrix(oi0Var2.f39808r);
                    oi0Var2.f39803n.setAlpha((int) (oi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), oi0Var2.f39803n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43748a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43749b.onBackPressed();
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
        switch (this.f43748a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                oi0 oi0Var = this.f43749b;
                if (!oi0Var.f39797g0 || oi0Var.f39798h0) {
                    ArrayList arrayList = oi0Var.N;
                    hi0 hi0Var = oi0Var.K;
                    if (oi0Var.F.getWidth() > 0) {
                        oi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.ui.Cells.t0.e(6.0f, oi0Var.W.getWidth() - oi0Var.W.l(), iArr[0])};
                        oi0Var.X.setScaleX(oi0Var.W.getScaleX());
                        oi0Var.X.setScaleY(oi0Var.W.getScaleY());
                        int[] iArr2 = oi0Var.f39805o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = hi0Var.getMeasuredHeight() - oi0Var.X.getHeight();
                        if (oi0Var.f39794e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + oi0Var.e.f12285b;
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
                        if (oi0Var.f39797g0) {
                            org.telegram.messenger.wh.t(hi0Var.animate().translationY(((oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight()) - hi0Var.getTop()), li.m.V, 250L);
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
                        FrameLayout frameLayout = oi0Var.f39793d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.q.b(6.0f, (oi0Var.X.l() + iArr[0]) - oi0Var.f39793d0.getMeasuredWidth(), 0));
                            RectF rectF = oi0Var.f39802l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = oi0Var.f39793d0;
                                float max = Math.max(oi0Var.e.f12285b, rectF.top - frameLayout2.getMeasuredWidth());
                                oi0Var.f39792c0 = max;
                                frameLayout2.setY(max);
                                ci0 ci0Var = oi0Var.f39794e0;
                                if (ci0Var != null) {
                                    ci0Var.setY(Math.max(oi0Var.e.f12285b, (oi0Var.f39802l0.top - AndroidUtilities.dp(24.0f)) - oi0Var.f39794e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = oi0Var.f39793d0;
                                float max2 = Math.max(oi0Var.e.f12285b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                oi0Var.f39792c0 = max2;
                                frameLayout3.setY(max2);
                                ci0 ci0Var2 = oi0Var.f39794e0;
                                if (ci0Var2 != null) {
                                    ci0Var2.setY(Math.max(0.0f, (height2 - ci0Var2.getMeasuredHeight()) - oi0Var.f39792c0));
                                }
                            }
                        }
                    }
                    oi0Var.f39797g0 = true;
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
        switch (this.f43748a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                oi0 oi0Var = this.f43749b;
                hh.d.c(oi0Var.f39800j0, oi0Var.F);
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
