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
public final class si0 extends FrameLayout {
    public final int f40153a;
    public final hj0 f40154b;

    public si0(hj0 hj0Var, Context context, int i10) {
        super(context);
        this.f40153a = i10;
        this.f40154b = hj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f40153a) {
            case 0:
                super.dispatchDraw(canvas);
                hj0 hj0Var = this.f40154b;
                ti0 ti0Var = hj0Var.f36835a0;
                ti0Var.e(canvas);
                ArrayList arrayList = ti0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jz jzVar = (jz) i2.d.g(1, arrayList);
                    ImageReceiver imageReceiver = jzVar.f37473r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (jzVar.f37474s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                jzVar.f37474s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                jzVar.f37474s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (jzVar.f37474s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(jzVar.f37474s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    hj0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ti0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                hj0 hj0Var2 = this.f40154b;
                nb0 nb0Var = hj0Var2.d;
                if (nb0Var != null) {
                    if (hj0Var2.E == 1.0f && hj0Var2.f36850n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nb0Var.a(z10);
                }
                if (hj0Var2.E > 0.0f && hj0Var2.f36850n != null) {
                    hj0Var2.f36855r.reset();
                    float width = getWidth() / hj0Var2.f36842f.getWidth();
                    hj0Var2.f36855r.postScale(width, width);
                    hj0Var2.h.setLocalMatrix(hj0Var2.f36855r);
                    hj0Var2.f36850n.setAlpha((int) (hj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), hj0Var2.f36850n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40153a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40154b.onBackPressed();
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
        ui0 ui0Var;
        int height;
        switch (this.f40153a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                hj0 hj0Var = this.f40154b;
                if (!hj0Var.f36844g0 || hj0Var.f36845h0) {
                    ArrayList arrayList = hj0Var.N;
                    aj0 aj0Var = hj0Var.K;
                    if (hj0Var.F.getWidth() > 0) {
                        hj0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.ui.Cells.d0.b(6.0f, hj0Var.W.getWidth() - hj0Var.W.l(), iArr[0])};
                        hj0Var.X.setScaleX(hj0Var.W.getScaleX());
                        hj0Var.X.setScaleY(hj0Var.W.getScaleY());
                        int[] iArr2 = hj0Var.f36852o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = aj0Var.getMeasuredHeight() - hj0Var.X.getHeight();
                        if (hj0Var.f36841e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + hj0Var.e.f10889b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = hj0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (hj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - hj0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (hj0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - hj0Var.W.getHeight();
                        }
                        hj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ui0Var.getWidth() - hj0Var.X.l())));
                        hj0Var.X.setY(iArr[1]);
                        if (hj0Var.m0) {
                            iArr[0] = iArr[0] - (hj0Var.Y - hj0Var.W.l());
                        }
                        aj0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - aj0Var.getMeasuredWidth());
                        if (hj0Var.f36844g0) {
                            org.telegram.messenger.yh.s(aj0Var.animate().translationY(((hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight()) - aj0Var.getTop()), ki.n.V, 250L);
                        } else {
                            aj0Var.setY((hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = hj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - hj0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = hj0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = hj0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = hj0Var.f36840d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.q.c(6.0f, (hj0Var.X.l() + iArr[0]) - hj0Var.f36840d0.getMeasuredWidth(), 0));
                            RectF rectF = hj0Var.f36849l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = hj0Var.f36840d0;
                                float max = Math.max(hj0Var.e.f10889b, rectF.top - frameLayout2.getMeasuredWidth());
                                hj0Var.f36839c0 = max;
                                frameLayout2.setY(max);
                                vi0 vi0Var = hj0Var.f36841e0;
                                if (vi0Var != null) {
                                    vi0Var.setY(Math.max(hj0Var.e.f10889b, (hj0Var.f36849l0.top - AndroidUtilities.dp(24.0f)) - hj0Var.f36841e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = hj0Var.f36840d0;
                                float max2 = Math.max(hj0Var.e.f10889b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                hj0Var.f36839c0 = max2;
                                frameLayout3.setY(max2);
                                vi0 vi0Var2 = hj0Var.f36841e0;
                                if (vi0Var2 != null) {
                                    vi0Var2.setY(Math.max(0.0f, (height2 - vi0Var2.getMeasuredHeight()) - hj0Var.f36839c0));
                                }
                            }
                        }
                    }
                    hj0Var.f36844g0 = true;
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
        switch (this.f40153a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                hj0 hj0Var = this.f40154b;
                hh.d.c(hj0Var.f36847j0, hj0Var.F);
                ViewGroup viewGroup = hj0Var.Z;
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
