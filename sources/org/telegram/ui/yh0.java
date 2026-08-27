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

    public final int f44837a;

    public final ni0 f44838b;

    public yh0(ni0 ni0Var, Context context, int i10) {
        super(context);
        this.f44837a = i10;
        this.f44838b = ni0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f44837a) {
            case 0:
                super.dispatchDraw(canvas);
                ni0 ni0Var = this.f44838b;
                zh0 zh0Var = ni0Var.W;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.B;
                float fFloatValue = -1.0f;
                if (!arrayList.isEmpty()) {
                    ry ryVar = (ry) i0.a.i(1, arrayList);
                    ImageReceiver imageReceiver = ryVar.f42374r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (ryVar.f42375s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                ryVar.f42375s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                ryVar.f42375s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (ryVar.f42375s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(ryVar.f42375s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            fFloatValue = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (fFloatValue != -2.0f) {
                    ni0Var.T.h(fFloatValue >= 0.0f && fFloatValue < 1.0f);
                }
                if (!zh0Var.B.isEmpty()) {
                    invalidate();
                }
                break;
            default:
                ni0 ni0Var2 = this.f44838b;
                gf.t0 t0Var = ni0Var2.d;
                if (t0Var != null) {
                    t0Var.a(ni0Var2.A == 1.0f && ni0Var2.f40857n != null);
                }
                if (ni0Var2.A <= 0.0f || ni0Var2.f40857n == null) {
                    canvas2 = canvas;
                } else {
                    ni0Var2.f40862r.reset();
                    float width = getWidth() / ni0Var2.f40849f.getWidth();
                    ni0Var2.f40862r.postScale(width, width);
                    ni0Var2.h.setLocalMatrix(ni0Var2.f40862r);
                    ni0Var2.f40857n.setAlpha((int) (ni0Var2.A * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ni0Var2.f40857n);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f44837a) {
            case 1:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.f44838b.onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f44837a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ni0 ni0Var = this.f44838b;
                if (!ni0Var.f40845c0 || ni0Var.f40846d0) {
                    ArrayList arrayList = ni0Var.J;
                    gi0 gi0Var = ni0Var.G;
                    if (ni0Var.B.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.rl.C(6.0f, ni0Var.S.getWidth() - ni0Var.S.l(), i), 0};
                        ni0Var.S.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ni0Var.T.setScaleX(ni0Var.S.getScaleX());
                        ni0Var.T.setScaleY(ni0Var.S.getScaleY());
                        int[] iArr2 = ni0Var.f40855k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (gi0Var.getMeasuredHeight() - ni0Var.T.getHeight()) + (ni0Var.f40841a0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int iDp = AndroidUtilities.dp(8.0f) + ni0Var.f40847e.f10490b;
                        int iDp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ni0Var.V;
                        int measuredHeight2 = iDp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ni0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.f40847e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < iDp) {
                            iArr[1] = iDp + measuredHeight;
                        }
                        if (ni0Var.S.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ni0Var.S.getHeight();
                        }
                        ai0 ai0Var = ni0Var.T;
                        ai0Var.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ai0Var.getWidth() - ni0Var.T.l())));
                        ni0Var.T.setY(iArr[1]);
                        if (ni0Var.f40853i0) {
                            iArr[0] = iArr[0] - (ni0Var.U - ni0Var.S.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.f40845c0) {
                            org.telegram.messenger.rl.o(gi0Var.animate().translationY(((ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), sh.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.V.getMeasuredWidth());
                            ni0Var.V.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ni0Var.T.getHeight()));
                        }
                        FrameLayout frameLayout = ni0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (ni0Var.T.l() + iArr[0]) - ni0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.f40852h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.Z;
                                float fMax = Math.max(ni0Var.f40847e.f10490b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.Y = fMax;
                                frameLayout2.setY(fMax);
                                bi0 bi0Var = ni0Var.f40841a0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.f40847e.f10490b, (ni0Var.f40852h0.top - AndroidUtilities.dp(24.0f)) - ni0Var.f40841a0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.Z;
                                float fMax2 = Math.max(ni0Var.f40847e.f10490b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.Y = fMax2;
                                frameLayout3.setY(fMax2);
                                bi0 bi0Var2 = ni0Var.f40841a0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height - bi0Var2.getMeasuredHeight()) - ni0Var.Y));
                                }
                            }
                        }
                    }
                    ni0Var.f40845c0 = true;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f44837a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ni0 ni0Var = this.f44838b;
                pg.c.c(ni0Var.f40850f0, ni0Var.B);
                ViewGroup viewGroup = ni0Var.V;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
