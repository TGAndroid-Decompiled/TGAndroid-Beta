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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class b4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final a4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final wn f47226a;
    public org.telegram.ui.Cells.a0 f47227b;
    public int f47228c;
    public final int[] d;
    public final int[] e;
    public final RectF f47229f;
    public final RectF h;
    public final Paint f47230n;
    public boolean f47231r;
    public final org.telegram.ui.Components.e6 f47232s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f47233w;
    public final u2.p0 f47234x;
    public float f47235y;

    public b4(wn wnVar) {
        super(wnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f47229f = new RectF();
        this.h = new RectF();
        this.f47230n = new Paint();
        new Paint();
        this.f47232s = new org.telegram.ui.Components.e6(this, 0L, 420L, rr.h);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.v = o6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f47226a = wnVar;
        o6Var.setCallback(this);
        o6Var.o(false, true, false);
        o6Var.t(AndroidUtilities.dp(40.0f));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.r(-1);
        o6Var.f26929b = 17;
        this.H = new a4(this, 0);
        this.f47234x = new u2.p0(25, this, wnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f47227b;
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
            wn wnVar = this.f47226a;
            s5 y3 = s5.y(wnVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                r5 r5Var = s5.y(wnVar.getCurrentAccount(), false).B;
                if (r5Var != null) {
                    r5Var.a();
                }
                long a2 = wnVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(wnVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new l7(wnVar.getParentActivity(), wnVar.getResourceProvider(), E, 5, str, new w21(this, y3, messageObject, E, 9), 0L).show();
            }
        }
    }

    public final void b(float f7, a4 a4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47235y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, a4Var, 4));
        this.E.setInterpolator(rr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f47231r = false;
        invalidate();
        b(0.0f, new a4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f47227b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            zg.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                wn wnVar = this.f47226a;
                s5 y3 = s5.y(wnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((ij0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                ij0 ij0Var = new ij0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                ij0Var.R(this);
                ij0Var.J(true);
                ij0Var.K(0);
                ij0Var.start();
                arrayList.add(ij0Var);
                invalidate();
                zg.m0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    s5.y(wnVar.getCurrentAccount(), false).d0(messageObject, this.f47226a, 1L, true, false, null);
                }
                org.telegram.ui.Components.o6 o6Var = this.v;
                o6Var.b();
                o6Var.q("+" + y3.E(messageObject), true, true);
                this.f47231r = true;
                a4 a4Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(a4Var);
                AndroidUtilities.runOnUIThread(a4Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && wnVar.getLayoutContainer() != null) {
                    wnVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: yh.b4.dispatchDraw(android.graphics.Canvas):void");
    }

    public zg.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f47227b;
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
        zg.p0 reactionsLayoutInBubble;
        if (this.f47227b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        u2.p0 p0Var = this.f47234x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f47233w = true;
                zg.m0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(p0Var);
                AndroidUtilities.runOnUIThread(p0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.m0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f47233w = false;
            AndroidUtilities.cancelRunOnUIThread(p0Var);
        }
        return this.f47233w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f47227b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.f47227b).setInvalidateListener(null);
            this.f47227b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f47227b).setInvalidateListener(null);
            this.f47227b.invalidate();
        }
        this.f47227b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f47228c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f47227b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.f47227b).setInvalidateListener(new a4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f47227b).setInvalidateListener(new a4(this, 1));
        }
        invalidate();
    }
}
