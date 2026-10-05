package yh;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class c4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final b4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final yn f51183a;
    public org.telegram.ui.Cells.a0 f51184b;
    public int f51185c;
    public final int[] d;
    public final int[] f51186e;
    public final RectF f51187f;
    public final RectF h;
    public final Paint f51188n;
    public boolean f51189r;
    public final org.telegram.ui.Components.e6 f51190s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f51191w;
    public final u2.i0 f51192x;
    public float f51193y;

    public c4(yn ynVar) {
        super(ynVar.getParentActivity());
        this.d = new int[2];
        this.f51186e = new int[2];
        this.f51187f = new RectF();
        this.h = new RectF();
        this.f51188n = new Paint();
        new Paint();
        this.f51190s = new org.telegram.ui.Components.e6(this, 0L, 420L, tr.h);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.v = o6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f51183a = ynVar;
        o6Var.setCallback(this);
        o6Var.o(false, true, false);
        o6Var.t(AndroidUtilities.dp(40.0f));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.r(-1);
        o6Var.f29354b = 17;
        this.H = new b4(this, 0);
        this.f51192x = new u2.i0(26, this, ynVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f51184b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            yn ynVar = this.f51183a;
            u5 y3 = u5.y(ynVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.f52088e && y3.q(false, false, null).amount < E) {
                t5 t5Var = u5.y(ynVar.getCurrentAccount(), false).B;
                if (t5Var != null) {
                    t5Var.a();
                }
                long a2 = ynVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(ynVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = ynVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new n7(ynVar.getParentActivity(), ynVar.getResourceProvider(), E, 5, str, new i31(this, y3, messageObject, E, 9), 0L).show();
            }
        }
    }

    public final void b(float f7, b4 b4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51193y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, b4Var, 4));
        this.E.setInterpolator(tr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f51189r = false;
        invalidate();
        b(0.0f, new b4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f51184b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            zg.n0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                yn ynVar = this.f51183a;
                u5 y3 = u5.y(ynVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((kj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                kj0 kj0Var = new kj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                kj0Var.R(this);
                kj0Var.J(true);
                kj0Var.K(0);
                kj0Var.start();
                arrayList.add(kj0Var);
                invalidate();
                zg.k0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    u5.y(ynVar.getCurrentAccount(), false).d0(messageObject, this.f51183a, 1L, true, false, null);
                }
                org.telegram.ui.Components.o6 o6Var = this.v;
                o6Var.b();
                o6Var.q("+" + y3.E(messageObject), true, true);
                this.f51189r = true;
                b4 b4Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(b4Var);
                AndroidUtilities.runOnUIThread(b4Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f51186e;
                if (measuredWidth == 0 && ynVar.getLayoutContainer() != null) {
                    ynVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f7, iArr2[1] + f10, Utilities.clamp(this.G, 0.9f, 0.3f));
                this.G = 0.0f;
                this.F = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.c4.dispatchDraw(android.graphics.Canvas):void");
    }

    public zg.n0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f51184b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).C0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zg.n0 reactionsLayoutInBubble;
        if (this.f51184b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        u2.i0 i0Var = this.f51192x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f51191w = true;
                zg.k0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(i0Var);
                AndroidUtilities.runOnUIThread(i0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.k0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f51191w = false;
            AndroidUtilities.cancelRunOnUIThread(i0Var);
        }
        return this.f51191w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f51184b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.f51184b).setInvalidateListener(null);
            this.f51184b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f51184b).setInvalidateListener(null);
            this.f51184b.invalidate();
        }
        this.f51184b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f51185c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f51184b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.f51184b).setInvalidateListener(new b4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f51184b).setInvalidateListener(new b4(this, 1));
        }
        invalidate();
    }
}
