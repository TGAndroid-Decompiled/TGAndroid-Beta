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
    public final int f43398a;
    public final ni0 f43399b;

    public yh0(ni0 ni0Var, Context context, int i10) {
        super(context);
        this.f43398a = i10;
        this.f43399b = ni0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f43398a) {
            case 0:
                super.dispatchDraw(canvas);
                ni0 ni0Var = this.f43399b;
                zh0 zh0Var = ni0Var.f39449a0;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.d.h(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.f40234r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.f40235s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.f40235s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.f40235s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.f40235s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.f40235s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    ni0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!zh0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ni0 ni0Var2 = this.f43399b;
                pa0 pa0Var = ni0Var2.d;
                if (pa0Var != null) {
                    if (ni0Var2.E == 1.0f && ni0Var2.f39464n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pa0Var.a(z10);
                }
                if (ni0Var2.E > 0.0f && ni0Var2.f39464n != null) {
                    ni0Var2.f39469r.reset();
                    float width = getWidth() / ni0Var2.f39456f.getWidth();
                    ni0Var2.f39469r.postScale(width, width);
                    ni0Var2.h.setLocalMatrix(ni0Var2.f39469r);
                    ni0Var2.f39464n.setAlpha((int) (ni0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ni0Var2.f39464n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43398a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43399b.onBackPressed();
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
        switch (this.f43398a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ni0 ni0Var = this.f43399b;
                if (!ni0Var.f39458g0 || ni0Var.f39459h0) {
                    ArrayList arrayList = ni0Var.N;
                    gi0 gi0Var = ni0Var.K;
                    if (ni0Var.F.getWidth() > 0) {
                        ni0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.lk.D(6.0f, ni0Var.W.getWidth() - ni0Var.W.l(), iArr[0])};
                        ni0Var.X.setScaleX(ni0Var.W.getScaleX());
                        ni0Var.X.setScaleY(ni0Var.W.getScaleY());
                        int[] iArr2 = ni0Var.f39466o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = gi0Var.getMeasuredHeight() - ni0Var.X.getHeight();
                        if (ni0Var.f39455e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + ni0Var.e.f12285b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = ni0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (ni0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (ni0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ni0Var.W.getHeight();
                        }
                        ni0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ai0Var.getWidth() - ni0Var.X.l())));
                        ni0Var.X.setY(iArr[1]);
                        if (ni0Var.m0) {
                            iArr[0] = iArr[0] - (ni0Var.Y - ni0Var.W.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.f39458g0) {
                            org.telegram.messenger.lk.t(gi0Var.animate().translationY(((ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), li.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = ni0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = ni0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ni0Var.f39454d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (ni0Var.X.l() + iArr[0]) - ni0Var.f39454d0.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.f39463l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.f39454d0;
                                float max = Math.max(ni0Var.e.f12285b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.f39453c0 = max;
                                frameLayout2.setY(max);
                                bi0 bi0Var = ni0Var.f39455e0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.e.f12285b, (ni0Var.f39463l0.top - AndroidUtilities.dp(24.0f)) - ni0Var.f39455e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.f39454d0;
                                float max2 = Math.max(ni0Var.e.f12285b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.f39453c0 = max2;
                                frameLayout3.setY(max2);
                                bi0 bi0Var2 = ni0Var.f39455e0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height2 - bi0Var2.getMeasuredHeight()) - ni0Var.f39453c0));
                                }
                            }
                        }
                    }
                    ni0Var.f39458g0 = true;
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
        switch (this.f43398a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ni0 ni0Var = this.f43399b;
                hh.d.c(ni0Var.f39461j0, ni0Var.F);
                ViewGroup viewGroup = ni0Var.Z;
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
