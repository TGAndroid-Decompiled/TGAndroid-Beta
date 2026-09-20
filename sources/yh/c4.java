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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class c4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final b4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final zn f47295a;
    public org.telegram.ui.Cells.a0 f47296b;
    public int f47297c;
    public final int[] d;
    public final int[] e;
    public final RectF f47298f;
    public final RectF h;
    public final Paint f47299n;
    public boolean f47300r;
    public final org.telegram.ui.Components.d6 f47301s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f47302w;
    public final u2.j0 f47303x;
    public float f47304y;

    public c4(zn znVar) {
        super(znVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f47298f = new RectF();
        this.h = new RectF();
        this.f47299n = new Paint();
        new Paint();
        this.f47301s = new org.telegram.ui.Components.d6(this, 0L, 420L, qr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.v = n6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f47295a = znVar;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.f26575b = 17;
        this.H = new b4(this, 0);
        this.f47303x = new u2.j0(26, this, znVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f47296b;
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
            zn znVar = this.f47295a;
            u5 y3 = u5.y(znVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                t5 t5Var = u5.y(znVar.getCurrentAccount(), false).B;
                if (t5Var != null) {
                    t5Var.a();
                }
                long a2 = znVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new l7(znVar.getParentActivity(), znVar.getResourceProvider(), E, 5, str, new x21(this, y3, messageObject, E, 9), 0L).show();
            }
        }
    }

    public final void b(float f7, b4 b4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47304y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, b4Var, 4));
        this.E.setInterpolator(qr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f47300r = false;
        invalidate();
        b(0.0f, new b4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f47296b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            zg.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                zn znVar = this.f47295a;
                u5 y3 = u5.y(znVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((hj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                hj0 hj0Var = new hj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                hj0Var.R(this);
                hj0Var.J(true);
                hj0Var.K(0);
                hj0Var.start();
                arrayList.add(hj0Var);
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
                    u5.y(znVar.getCurrentAccount(), false).d0(messageObject, this.f47295a, 1L, true, false, null);
                }
                org.telegram.ui.Components.n6 n6Var = this.v;
                n6Var.b();
                n6Var.q("+" + y3.E(messageObject), true, true);
                this.f47300r = true;
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
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && znVar.getLayoutContainer() != null) {
                    znVar.getLayoutContainer().getLocationInWindow(iArr2);
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

    public zg.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f47296b;
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
        if (this.f47296b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        u2.j0 j0Var = this.f47303x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f47302w = true;
                zg.m0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(j0Var);
                AndroidUtilities.runOnUIThread(j0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.m0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f47302w = false;
            AndroidUtilities.cancelRunOnUIThread(j0Var);
        }
        return this.f47302w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f47296b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.f47296b).setInvalidateListener(null);
            this.f47296b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f47296b).setInvalidateListener(null);
            this.f47296b.invalidate();
        }
        this.f47296b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f47297c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f47296b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.f47296b).setInvalidateListener(new b4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f47296b).setInvalidateListener(new b4(this, 1));
        }
        invalidate();
    }
}
