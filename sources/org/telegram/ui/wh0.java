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
    public final int f44140a;
    public final li0 f44141b;

    public wh0(li0 li0Var, Context context, int i9) {
        super(context);
        this.f44140a = i9;
        this.f44141b = li0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f44140a) {
            case 0:
                super.dispatchDraw(canvas);
                li0 li0Var = this.f44141b;
                xh0 xh0Var = li0Var.W;
                xh0Var.e(canvas);
                ArrayList arrayList = xh0Var.B;
                boolean z11 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    oy oyVar = (oy) j3.r0.j(1, arrayList);
                    ImageReceiver imageReceiver = oyVar.f41277r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (oyVar.f41278s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                oyVar.f41278s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                oyVar.f41278s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (oyVar.f41278s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(oyVar.f41278s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    li0Var.T.h((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!xh0Var.B.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                li0 li0Var2 = this.f44141b;
                ff.t0 t0Var = li0Var2.d;
                if (t0Var != null) {
                    if (li0Var2.A == 1.0f && li0Var2.f40164n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t0Var.a(z10);
                }
                if (li0Var2.A > 0.0f && li0Var2.f40164n != null) {
                    li0Var2.f40169r.reset();
                    float width = getWidth() / li0Var2.f40156f.getWidth();
                    li0Var2.f40169r.postScale(width, width);
                    li0Var2.h.setLocalMatrix(li0Var2.f40169r);
                    li0Var2.f40164n.setAlpha((int) (li0Var2.A * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), li0Var2.f40164n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f44140a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f44141b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        float f10;
        int measuredHeight;
        yh0 yh0Var;
        int height;
        switch (this.f44140a) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                li0 li0Var = this.f44141b;
                if (!li0Var.f40152c0 || li0Var.f40153d0) {
                    ArrayList arrayList = li0Var.J;
                    ei0 ei0Var = li0Var.G;
                    if (li0Var.B.getWidth() > 0) {
                        li0Var.S.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.ll.D(6.0f, li0Var.S.getWidth() - li0Var.S.l(), iArr[0])};
                        li0Var.T.setScaleX(li0Var.S.getScaleX());
                        li0Var.T.setScaleY(li0Var.S.getScaleY());
                        int[] iArr2 = li0Var.f40162k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ei0Var.getMeasuredHeight() - li0Var.T.getHeight();
                        if (li0Var.f40148a0 != null) {
                            i13 = AndroidUtilities.dp(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int dp = AndroidUtilities.dp(8.0f) + li0Var.f40154e.f10849b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f10);
                        ViewGroup viewGroup = li0Var.V;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = dp2 + measuredHeight;
                        int measuredHeight3 = (li0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - li0Var.f40154e.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < dp) {
                            iArr[1] = dp + i14;
                        }
                        if (li0Var.S.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - li0Var.S.getHeight();
                        }
                        li0Var.T.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (yh0Var.getWidth() - li0Var.T.l())));
                        li0Var.T.setY(iArr[1]);
                        if (li0Var.f40160i0) {
                            iArr[0] = iArr[0] - (li0Var.U - li0Var.S.l());
                        }
                        ei0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ei0Var.getMeasuredWidth());
                        if (li0Var.f40152c0) {
                            org.telegram.messenger.ll.r(ei0Var.animate().translationY(((li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight()) - ei0Var.getTop()), rh.m.V, 250L);
                        } else {
                            ei0Var.setY((li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = li0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - li0Var.V.getMeasuredWidth());
                            ViewGroup viewGroup3 = li0Var.V;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = li0Var.T.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = li0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.l0.b(6.0f, (li0Var.T.l() + iArr[0]) - li0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = li0Var.f40159h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = li0Var.Z;
                                float max = Math.max(li0Var.f40154e.f10849b, rectF.top - frameLayout2.getMeasuredWidth());
                                li0Var.Y = max;
                                frameLayout2.setY(max);
                                zh0 zh0Var = li0Var.f40148a0;
                                if (zh0Var != null) {
                                    zh0Var.setY(Math.max(li0Var.f40154e.f10849b, (li0Var.f40159h0.top - AndroidUtilities.dp(24.0f)) - li0Var.f40148a0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = li0Var.Z;
                                float max2 = Math.max(li0Var.f40154e.f10849b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                li0Var.Y = max2;
                                frameLayout3.setY(max2);
                                zh0 zh0Var2 = li0Var.f40148a0;
                                if (zh0Var2 != null) {
                                    zh0Var2.setY(Math.max(0.0f, (height2 - zh0Var2.getMeasuredHeight()) - li0Var.Y));
                                }
                            }
                        }
                    }
                    li0Var.f40152c0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f44140a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                li0 li0Var = this.f44141b;
                og.d.c(li0Var.f40157f0, li0Var.B);
                ViewGroup viewGroup = li0Var.V;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }
}
