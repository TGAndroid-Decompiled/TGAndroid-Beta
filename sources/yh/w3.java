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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class w3 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final v3 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final zn f53452a;
    public org.telegram.ui.Cells.a0 f53453b;
    public int f53454c;
    public final int[] d;
    public final int[] f53455e;
    public final RectF f53456f;
    public final RectF h;
    public final Paint f53457n;
    public boolean f53458r;
    public final org.telegram.ui.Components.g6 f53459s;
    public final org.telegram.ui.Components.q6 v;
    public boolean f53460w;
    public final tg.c1 f53461x;
    public float f53462y;

    public w3(zn znVar) {
        super(znVar.getParentActivity());
        this.d = new int[2];
        this.f53455e = new int[2];
        this.f53456f = new RectF();
        this.h = new RectF();
        this.f53457n = new Paint();
        new Paint();
        this.f53459s = new org.telegram.ui.Components.g6(this, 0L, 420L, is.h);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.v = q6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f53452a = znVar;
        q6Var.setCallback(this);
        q6Var.r(false, true);
        q6Var.w(AndroidUtilities.dp(40.0f));
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.u(-1);
        q6Var.f30134b = 17;
        this.H = new v3(this, 0);
        this.f53461x = new tg.c1(27, this, znVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f53453b;
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
            zn znVar = this.f53452a;
            n5 y3 = n5.y(znVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.f53034e && y3.q(false, false, null).amount < E) {
                m5 m5Var = n5.y(znVar.getCurrentAccount(), false).B;
                if (m5Var != null) {
                    m5Var.a();
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
                new e7(znVar.getParentActivity(), znVar.getResourceProvider(), E, 5, str, new p31(this, y3, messageObject, E, 12), 0L).show();
            }
        }
    }

    public final void b(float f7, v3 v3Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53462y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 24));
        this.E.addListener(new ai.u2(this, f7, v3Var, 4));
        this.E.setInterpolator(is.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.t("", true, true);
        this.f53458r = false;
        invalidate();
        b(0.0f, new v3(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f53453b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            zg.o0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                zn znVar = this.f53452a;
                n5 y3 = n5.y(znVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((dk0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                dk0 dk0Var = new dk0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                dk0Var.R(this);
                dk0Var.J(true);
                dk0Var.K(0);
                dk0Var.start();
                arrayList.add(dk0Var);
                invalidate();
                zg.l0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    n5.y(znVar.getCurrentAccount(), false).d0(messageObject, this.f53452a, 1L, true, false, null);
                }
                org.telegram.ui.Components.q6 q6Var = this.v;
                q6Var.a();
                q6Var.t("+" + y3.E(messageObject), true, true);
                this.f53458r = true;
                v3 v3Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(v3Var);
                AndroidUtilities.runOnUIThread(v3Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f53455e;
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
        throw new UnsupportedOperationException("Method not decompiled: yh.w3.dispatchDraw(android.graphics.Canvas):void");
    }

    public zg.o0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f53453b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zg.o0 reactionsLayoutInBubble;
        if (this.f53453b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        tg.c1 c1Var = this.f53461x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f53460w = true;
                zg.l0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(c1Var);
                AndroidUtilities.runOnUIThread(c1Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.l0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f53460w = false;
            AndroidUtilities.cancelRunOnUIThread(c1Var);
        }
        return this.f53460w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f53453b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.f53453b).setInvalidateListener(null);
            this.f53453b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f53453b).setInvalidateListener(null);
            this.f53453b.invalidate();
        }
        this.f53453b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f53454c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f53453b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.f53453b).setInvalidateListener(new v3(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f53453b).setInvalidateListener(new v3(this, 1));
        }
        invalidate();
    }
}
