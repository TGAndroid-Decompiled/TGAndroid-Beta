package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.nx;
public final class k extends FrameLayout {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final x5 O;
    public float P;
    public float Q;
    public lj0 R;
    public e S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f48563a;
    public final org.telegram.ui.Components.d6 f48564a0;
    public int f48565b;
    public final nx f48566b0;
    public boolean f48567c;
    public boolean d;
    public org.telegram.ui.web.a1 e;
    public TLRPC.User f48568f;
    public TLRPC.Chat h;
    public final g9 f48569n;
    public final ImageReceiver f48570r;
    public final ImageReceiver f48571s;
    public final g9 v;
    public boolean f48572w;
    public final FrameLayout f48573x;
    public org.telegram.ui.ActionBar.l5 f48574y;

    public k(nx nxVar, Context context) {
        super(context);
        boolean z10;
        this.f48566b0 = nxVar;
        this.f48569n = new g9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f48570r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f48571s = imageReceiver2;
        this.v = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f48572w = true;
        x5 x5Var = new x5(null, true);
        this.O = x5Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f48564a0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        if (nxVar.f48598b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5Var.f49059o = z10;
        x5Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f48573x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.a6.c(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.f48574y = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        this.f48574y.setGravity(17);
        this.f48574y.setTextSize(11);
        this.f48574y.setTextColor(l.a(this.f48566b0));
        NotificationCenter.listenEmojiLoading(this.f48574y);
        this.f48574y.setMaxLines(1);
        this.f48573x.addView(this.f48574y, w7.a6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f48570r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f48571s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        nx nxVar = this.f48566b0;
        int i11 = nxVar.f48598b;
        Paint paint = nxVar.G;
        i5 i5Var = nxVar.f48619s;
        Paint paint2 = nxVar.H;
        Drawable drawable = nxVar.f48600c;
        if (this.F && !i5Var.I(this.E) && Utilities.isNullOrEmpty(i5Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.f18201s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f18201s8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.M8;
            }
            int f12 = nxVar.f(i10);
            if (f12 != nxVar.e) {
                nxVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float clamp;
        int i10;
        float f12 = this.J;
        nx nxVar = this.f48566b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            nxVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(nxVar.N / nxVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.f48573x;
        frameLayout.setAlpha(f13);
        if (f13 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: zh.k.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp) / 2.0f, this.f48566b0.f48601c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f48563a && getParent() != null)) {
            ViewParent parent = getParent();
            nx nxVar = this.f48566b0;
            g gVar = nxVar.f48617r;
            if (parent == gVar) {
                gVar.invalidate();
            } else {
                nxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48570r.onAttachedToWindow();
        this.f48571s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48570r.onDetachedFromWindow();
        this.f48571s.onDetachedFromWindow();
        this.O.g();
        org.telegram.ui.web.a1 a1Var = this.e;
        if (a1Var != null) {
            a1Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f48566b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f48566b0.f48604f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f48571s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    this.f48568f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    this.h = chat;
                    this.f48568f = null;
                    user = chat;
                }
                if (user != null) {
                    g9 g9Var = this.v;
                    g9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, g9Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.k.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        x5 x5Var = this.O;
        if (z10 && x5Var.H == null) {
            x5Var.H = new xc(this, 1.5f, 5.0f);
        }
        xc xcVar = x5Var.H;
        if (xcVar != null) {
            xcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f48563a && getParent() != null)) {
            ViewParent parent = getParent();
            nx nxVar = this.f48566b0;
            g gVar = nxVar.f48617r;
            if (parent == gVar) {
                gVar.invalidate();
            }
            nxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
