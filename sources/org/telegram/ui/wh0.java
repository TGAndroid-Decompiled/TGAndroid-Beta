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
public final class wh0 extends FrameLayout {
    public final int f42877a;
    public final li0 f42878b;

    public wh0(li0 li0Var, Context context, int i10) {
        super(context);
        this.f42877a = i10;
        this.f42878b = li0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f42877a) {
            case 0:
                super.dispatchDraw(canvas);
                li0 li0Var = this.f42878b;
                xh0 xh0Var = li0Var.f38931a0;
                xh0Var.e(canvas);
                ArrayList arrayList = xh0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ny nyVar = (ny) i2.e.h(1, arrayList);
                    ImageReceiver imageReceiver = nyVar.f39713r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (nyVar.f39714s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                nyVar.f39714s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                nyVar.f39714s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (nyVar.f39714s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(nyVar.f39714s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    li0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!xh0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                li0 li0Var2 = this.f42878b;
                na0 na0Var = li0Var2.d;
                if (na0Var != null) {
                    if (li0Var2.E == 1.0f && li0Var2.f38946n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    na0Var.a(z10);
                }
                if (li0Var2.E > 0.0f && li0Var2.f38946n != null) {
                    li0Var2.f38951r.reset();
                    float width = getWidth() / li0Var2.f38938f.getWidth();
                    li0Var2.f38951r.postScale(width, width);
                    li0Var2.h.setLocalMatrix(li0Var2.f38951r);
                    li0Var2.f38946n.setAlpha((int) (li0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), li0Var2.f38946n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f42877a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f42878b.onBackPressed();
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
        yh0 yh0Var;
        int height;
        switch (this.f42877a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                li0 li0Var = this.f42878b;
                if (!li0Var.f38940g0 || li0Var.f38941h0) {
                    ArrayList arrayList = li0Var.N;
                    ei0 ei0Var = li0Var.K;
                    if (li0Var.F.getWidth() > 0) {
                        li0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.lk.D(6.0f, li0Var.W.getWidth() - li0Var.W.l(), iArr[0])};
                        li0Var.X.setScaleX(li0Var.W.getScaleX());
                        li0Var.X.setScaleY(li0Var.W.getScaleY());
                        int[] iArr2 = li0Var.f38948o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ei0Var.getMeasuredHeight() - li0Var.X.getHeight();
                        if (li0Var.f38937e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + li0Var.e.f12286b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = li0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (li0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - li0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (li0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - li0Var.W.getHeight();
                        }
                        li0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (yh0Var.getWidth() - li0Var.X.l())));
                        li0Var.X.setY(iArr[1]);
                        if (li0Var.m0) {
                            iArr[0] = iArr[0] - (li0Var.Y - li0Var.W.l());
                        }
                        ei0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ei0Var.getMeasuredWidth());
                        if (li0Var.f38940g0) {
                            org.telegram.messenger.lk.t(ei0Var.animate().translationY(((li0Var.X.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight()) - ei0Var.getTop()), li.m.V, 250L);
                        } else {
                            ei0Var.setY((li0Var.X.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = li0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - li0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = li0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = li0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = li0Var.f38936d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (li0Var.X.l() + iArr[0]) - li0Var.f38936d0.getMeasuredWidth(), 0));
                            RectF rectF = li0Var.f38945l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = li0Var.f38936d0;
                                float max = Math.max(li0Var.e.f12286b, rectF.top - frameLayout2.getMeasuredWidth());
                                li0Var.f38935c0 = max;
                                frameLayout2.setY(max);
                                zh0 zh0Var = li0Var.f38937e0;
                                if (zh0Var != null) {
                                    zh0Var.setY(Math.max(li0Var.e.f12286b, (li0Var.f38945l0.top - AndroidUtilities.dp(24.0f)) - li0Var.f38937e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (li0Var.X.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = li0Var.f38936d0;
                                float max2 = Math.max(li0Var.e.f12286b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                li0Var.f38935c0 = max2;
                                frameLayout3.setY(max2);
                                zh0 zh0Var2 = li0Var.f38937e0;
                                if (zh0Var2 != null) {
                                    zh0Var2.setY(Math.max(0.0f, (height2 - zh0Var2.getMeasuredHeight()) - li0Var.f38935c0));
                                }
                            }
                        }
                    }
                    li0Var.f38940g0 = true;
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
        switch (this.f42877a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                li0 li0Var = this.f42878b;
                hh.d.c(li0Var.f38943j0, li0Var.F);
                ViewGroup viewGroup = li0Var.Z;
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
