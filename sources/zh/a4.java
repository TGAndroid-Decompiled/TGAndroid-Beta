package zh;

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
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
public final class a4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final z3 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final co f51678a;
    public org.telegram.ui.Cells.a0 f51679b;
    public int f51680c;
    public final int[] d;
    public final int[] f51681e;
    public final RectF f51682f;
    public final RectF h;
    public final Paint f51683n;
    public boolean f51684r;
    public final org.telegram.ui.Components.e6 f51685s;
    public final org.telegram.ui.Components.p6 v;
    public boolean f51686w;
    public final ug.r f51687x;
    public float f51688y;

    public a4(co coVar) {
        super(coVar.getParentActivity());
        this.d = new int[2];
        this.f51681e = new int[2];
        this.f51682f = new RectF();
        this.h = new RectF();
        this.f51683n = new Paint();
        new Paint();
        this.f51685s = new org.telegram.ui.Components.e6(this, 0L, 420L, pr.h);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
        this.v = p6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f51678a = coVar;
        p6Var.setCallback(this);
        p6Var.o(false, true, false);
        p6Var.t(AndroidUtilities.dp(40.0f));
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.r(-1);
        p6Var.f29285b = 17;
        this.H = new z3(this, 0);
        this.f51687x = new ug.r(26, this, coVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f51679b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
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
            co coVar = this.f51678a;
            s5 y3 = s5.y(coVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.f52569e && y3.q(false, false, null).amount < E) {
                r5 r5Var = s5.y(coVar.getCurrentAccount(), false).B;
                if (r5Var != null) {
                    r5Var.a();
                }
                long a2 = coVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(coVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = coVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new k7(coVar.getParentActivity(), coVar.getResourceProvider(), E, 5, str, new i21(this, y3, messageObject, E, 9), 0L).show();
            }
        }
    }

    public final void b(float f7, z3 z3Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51688y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 25));
        this.E.addListener(new bi.h2(this, f7, z3Var, 4));
        this.E.setInterpolator(pr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f51684r = false;
        invalidate();
        b(0.0f, new z3(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f51679b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            ah.k1 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                co coVar = this.f51678a;
                s5 y3 = s5.y(coVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((xi0) arrayList.remove(0)).A(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                xi0 xi0Var = new xi0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                xi0Var.f32578v0 = this;
                xi0Var.H(true);
                xi0Var.I(0);
                xi0Var.start();
                arrayList.add(xi0Var);
                invalidate();
                ah.h1 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    s5.y(coVar.getCurrentAccount(), false).d0(messageObject, this.f51678a, 1L, true, false, null);
                }
                org.telegram.ui.Components.p6 p6Var = this.v;
                p6Var.b();
                p6Var.q("+" + y3.E(messageObject), true, true);
                this.f51684r = true;
                z3 z3Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(z3Var);
                AndroidUtilities.runOnUIThread(z3Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f51681e;
                if (measuredWidth == 0 && coVar.getLayoutContainer() != null) {
                    coVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: zh.a4.dispatchDraw(android.graphics.Canvas):void");
    }

    public ah.k1 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f51679b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).C0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ah.k1 reactionsLayoutInBubble;
        if (this.f51679b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        ug.r rVar = this.f51687x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f51686w = true;
                ah.h1 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(rVar);
                AndroidUtilities.runOnUIThread(rVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ah.h1 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.f51686w = false;
            AndroidUtilities.cancelRunOnUIThread(rVar);
        }
        return this.f51686w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f51679b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f51679b).setInvalidateListener(null);
            this.f51679b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f51679b).setInvalidateListener(null);
            this.f51679b.invalidate();
        }
        this.f51679b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f51680c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f51679b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f51679b).setInvalidateListener(new z3(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f51679b).setInvalidateListener(new z3(this, 1));
        }
        invalidate();
    }
}
