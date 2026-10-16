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
public final class ri0 extends FrameLayout {
    public final int f39527a;
    public final gj0 f39528b;

    public ri0(gj0 gj0Var, Context context, int i10) {
        super(context);
        this.f39527a = i10;
        this.f39528b = gj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f39527a) {
            case 0:
                super.dispatchDraw(canvas);
                gj0 gj0Var = this.f39528b;
                si0 si0Var = gj0Var.f36233a0;
                si0Var.e(canvas);
                ArrayList arrayList = si0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jz jzVar = (jz) i2.d.h(1, arrayList);
                    ImageReceiver imageReceiver = jzVar.f37187r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (jzVar.f37188s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                jzVar.f37188s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                jzVar.f37188s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (jzVar.f37188s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(jzVar.f37188s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    gj0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!si0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                gj0 gj0Var2 = this.f39528b;
                mb0 mb0Var = gj0Var2.d;
                if (mb0Var != null) {
                    if (gj0Var2.E == 1.0f && gj0Var2.f36248n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mb0Var.a(z10);
                }
                if (gj0Var2.E > 0.0f && gj0Var2.f36248n != null) {
                    gj0Var2.f36253r.reset();
                    float width = getWidth() / gj0Var2.f36240f.getWidth();
                    gj0Var2.f36253r.postScale(width, width);
                    gj0Var2.h.setLocalMatrix(gj0Var2.f36253r);
                    gj0Var2.f36248n.setAlpha((int) (gj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gj0Var2.f36248n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39527a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f39528b.onBackPressed();
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
        ti0 ti0Var;
        int height;
        switch (this.f39527a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                gj0 gj0Var = this.f39528b;
                if (!gj0Var.f36242g0 || gj0Var.f36243h0) {
                    ArrayList arrayList = gj0Var.N;
                    zi0 zi0Var = gj0Var.K;
                    if (gj0Var.F.getWidth() > 0) {
                        gj0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.sk.D(6.0f, gj0Var.W.getWidth() - gj0Var.W.l(), iArr[0])};
                        gj0Var.X.setScaleX(gj0Var.W.getScaleX());
                        gj0Var.X.setScaleY(gj0Var.W.getScaleY());
                        int[] iArr2 = gj0Var.f36250o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = zi0Var.getMeasuredHeight() - gj0Var.X.getHeight();
                        if (gj0Var.f36239e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + gj0Var.e.f10893b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = gj0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (gj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - gj0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (gj0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - gj0Var.W.getHeight();
                        }
                        gj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ti0Var.getWidth() - gj0Var.X.l())));
                        gj0Var.X.setY(iArr[1]);
                        if (gj0Var.m0) {
                            iArr[0] = iArr[0] - (gj0Var.Y - gj0Var.W.l());
                        }
                        zi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - zi0Var.getMeasuredWidth());
                        if (gj0Var.f36242g0) {
                            org.telegram.messenger.sk.t(zi0Var.animate().translationY(((gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight()) - zi0Var.getTop()), ki.n.V, 250L);
                        } else {
                            zi0Var.setY((gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = gj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gj0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = gj0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = gj0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = gj0Var.f36238d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (gj0Var.X.l() + iArr[0]) - gj0Var.f36238d0.getMeasuredWidth(), 0));
                            RectF rectF = gj0Var.f36247l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = gj0Var.f36238d0;
                                float max = Math.max(gj0Var.e.f10893b, rectF.top - frameLayout2.getMeasuredWidth());
                                gj0Var.f36237c0 = max;
                                frameLayout2.setY(max);
                                ui0 ui0Var = gj0Var.f36239e0;
                                if (ui0Var != null) {
                                    ui0Var.setY(Math.max(gj0Var.e.f10893b, (gj0Var.f36247l0.top - AndroidUtilities.dp(24.0f)) - gj0Var.f36239e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = gj0Var.f36238d0;
                                float max2 = Math.max(gj0Var.e.f10893b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                gj0Var.f36237c0 = max2;
                                frameLayout3.setY(max2);
                                ui0 ui0Var2 = gj0Var.f36239e0;
                                if (ui0Var2 != null) {
                                    ui0Var2.setY(Math.max(0.0f, (height2 - ui0Var2.getMeasuredHeight()) - gj0Var.f36237c0));
                                }
                            }
                        }
                    }
                    gj0Var.f36242g0 = true;
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
        switch (this.f39527a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                gj0 gj0Var = this.f39528b;
                hh.d.c(gj0Var.f36245j0, gj0Var.F);
                ViewGroup viewGroup = gj0Var.Z;
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
