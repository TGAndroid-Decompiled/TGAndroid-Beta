package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class ui0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public final fi0 C;
    public final mi0 D;
    public final fi0 E;
    public long F;
    public org.telegram.ui.Components.j5 G;
    public final ni0 H;
    public final ei0 I;
    public final qi0 J;
    public final ArrayList K;
    public int L;
    public final a0.h M;
    public org.telegram.ui.Cells.s1 N;
    public int O;
    public org.telegram.ui.Components.ff P;
    public final Paint Q;
    public org.telegram.ui.Components.d R;
    public org.telegram.ui.Components.sd S;
    public org.telegram.ui.Components.lg T;
    public hi0 U;
    public int V;
    public ViewGroup W;
    public final gi0 X;
    public boolean Y;
    public float Z;
    public final Context f38825a;
    public FrameLayout f38826a0;
    public final org.telegram.ui.ActionBar.f6 f38827b;
    public ii0 f38828b0;
    public final int f38829c;
    public boolean f38830c0;
    public kf.t0 d;
    public boolean f38831d0;
    public i0.b e;
    public boolean f38832e0;
    public Bitmap f38833f;
    public final ih.j f38834f0;
    public final sg.b f38835g0;
    public BitmapShader h;
    public final ng.a f38836h0;
    public RectF f38837i0;
    public boolean f38838j0;
    public boolean f38839k0;
    public final int[] f38840l0;
    public boolean m0;
    public Paint f38841n;
    public boolean f38842n0;
    public org.telegram.ui.Cells.s1 f38843o0;
    public float f38844p0;
    public float f38845q0;
    public Matrix f38846r;
    public final Rect f38847r0;
    public boolean f38848s;
    public ValueAnimator f38849s0;
    public boolean f38850t0;
    public org.telegram.ui.Cells.s1 f38851u0;
    public boolean v;
    public org.telegram.ui.Components.k01 f38852v0;
    public boolean f38853w;
    public Paint f38854w0;
    public boolean f38855x;
    public boolean f38856y;

    public ui0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        kf.t0 t0Var;
        int i10 = UserConfig.selectedAccount;
        this.f38829c = i10;
        this.e = i0.b.e;
        this.K = new ArrayList();
        this.M = new a0.h();
        this.Q = new Paint(1);
        this.f38840l0 = new int[2];
        this.f38842n0 = false;
        this.f38847r0 = new Rect();
        this.f38825a = context;
        this.f38827b = f6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            t0Var = new kf.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.d = t0Var;
        fi0 fi0Var = new fi0(this, context, 1);
        this.C = fi0Var;
        this.f38834f0 = ih.j.d(1, fi0Var, fi0Var);
        fi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ui0 f33162b;

            {
                this.f33162b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33162b.onBackPressed();
                        return;
                    default:
                        this.f33162b.onBackPressed();
                        return;
                }
            }
        });
        fi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                ui0 ui0Var = ui0.this;
                if (!ui0Var.m0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(ui0Var.P);
                    AndroidUtilities.runOnUIThread(new ai0(ui0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        sg.b bVar = new sg.b();
        this.f38835g0 = bVar;
        ng.a aVar = new ng.a(bVar);
        this.f38836h0 = aVar;
        aVar.d = new ug.i(fi0Var);
        aVar.e = fi0Var;
        mi0 mi0Var = new mi0(this, context, f6Var);
        this.D = mi0Var;
        mi0Var.setClipToPadding(false);
        fi0Var.addView(mi0Var, k7.b6.e(-1, -1, 119));
        h hVar = new h(this, 26);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(fi0Var, hVar);
        ni0 ni0Var = new ni0(this, context, f6Var);
        this.H = ni0Var;
        ni0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ui0 f33162b;

            {
                this.f33162b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33162b.onBackPressed();
                        return;
                    default:
                        this.f33162b.onBackPressed();
                        return;
                }
            }
        });
        ni0Var.setOnItemClickListener(new j(this, 17));
        ni0Var.setOnScrollListener(new n3(this, 19));
        ni0Var.setItemAnimator(new wh.n(null, ni0Var, f6Var));
        qi0 qi0Var = new qi0(this);
        this.J = qi0Var;
        qi0Var.O = new ri0(this);
        ni0Var.setLayoutManager(qi0Var);
        ni0Var.i(new Object());
        ei0 ei0Var = new ei0(this, context, f6Var);
        this.I = ei0Var;
        ni0Var.setAdapter(ei0Var);
        ni0Var.setVerticalScrollBarEnabled(false);
        ni0Var.setOverScrollMode(2);
        mi0Var.addView(ni0Var, k7.b6.c(-2.0f, -1));
        fi0 fi0Var2 = new fi0(this, context, 0);
        this.E = fi0Var2;
        fi0Var.addView(fi0Var2, k7.b6.c(-1.0f, -1));
        this.X = new gi0(this, fi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f38829c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        kf.t0 t0Var = this.d;
        if (t0Var != null) {
            t0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.p2 p2Var) {
        mg.z zVar;
        if (this.f38828b0 == null && p2Var != null) {
            int i10 = this.f38829c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f38825a);
            this.f38826a0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38826a0.setClipToPadding(false);
            this.f38826a0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? pk0Var = new org.telegram.ui.Components.pk0(5, this.f38829c, getContext(), null, this.f38827b);
            this.f38828b0 = pk0Var;
            pk0Var.setClipChildren(false);
            this.f38828b0.setClipToPadding(false);
            this.f38828b0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f38828b0.setDelegate(new ki0(this, p2Var));
            this.f38828b0.setTop(false);
            this.f38828b0.setClipChildren(false);
            this.f38828b0.setClipToPadding(false);
            this.f38828b0.setVisibility(0);
            this.f38828b0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f38828b0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f38828b0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.D.addView(this.f38826a0, k7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38826a0.addView(this.f38828b0, k7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38828b0.setScaleY(0.4f);
            this.f38828b0.setScaleX(0.4f);
            this.f38828b0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ii0 ii0Var = this.f38828b0;
            if (ii0Var != null && !ii0Var.f27888c1) {
                ii0Var.f27888c1 = true;
                ii0Var.f27890d1 = true;
                mg.d0 d0Var = ii0Var.f27913u0;
                if (d0Var != null && (zVar = d0Var.f13969m) != null && !zVar.H1) {
                    zVar.H1 = true;
                    zVar.I1 = true;
                    t51 t51Var = zVar.f39862e0;
                    if (t51Var != null) {
                        t51Var.invalidate();
                    }
                    i51 i51Var = zVar.f39865f0;
                    if (i51Var != null) {
                        i51Var.invalidate();
                    }
                }
            }
            new ph.i3(this.C, false, new y3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f38829c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38842n0) {
            return;
        }
        this.f38842n0 = true;
        hi0 hi0Var = this.U;
        if (hi0Var != null) {
            hi0Var.invalidate();
        }
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.invalidate();
        }
        e(new zh0(this, 2), false);
        this.C.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z4) {
        boolean z10;
        ii0 ii0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38849s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z4 && (viewGroup = this.W) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.ActionBar.p1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.W);
        }
        float f10 = 0.0f;
        if (!z4 && (ii0Var = this.f38828b0) != null && this.f38830c0) {
            ii0Var.e();
            if (this.f38828b0.getReactionsWindow() != null && this.f38828b0.getReactionsWindow().f13960a != null) {
                this.f38828b0.getReactionsWindow().f13960a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38828b0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38853w = true;
        this.v = !z4;
        this.H.invalidate();
        this.f38855x = true;
        this.f38856y = true;
        float f11 = this.B;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f38849s0 = ofFloat;
        ofFloat.addUpdateListener(new dg.b1(10, this, z10));
        this.f38849s0.addListener(new org.telegram.ui.ActionBar.f(this, z4, z10, runnable));
        this.f38849s0.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f38849s0.setDuration(350L);
        this.f38849s0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l10 = l(messageObject);
        if (l10 != null) {
            l10.calculate();
            ArrayList<MessageObject> arrayList = l10.messages;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                g(messageObject2);
            }
            return;
        }
        g(messageObject);
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var;
        ni0 ni0Var = this.H;
        if (ni0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ni0Var.getChildCount()) {
                View childAt = ni0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                s1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (s1Var2 == null) {
            ni0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        s1Var2.X3(messageObject, s1Var2.getCurrentMessagesGroup(), s1Var2.m3(), s1Var2.n3(), s1Var2.h3(), false);
        ni0Var.getAdapter().m(i12);
    }

    public final void h(boolean z4) {
        this.f38848s = z4;
        dismiss();
    }

    public final void i() {
        if (this.f38842n0) {
            return;
        }
        this.f38842n0 = true;
        ih.j.f(false);
        ih.j jVar = this.f38834f0;
        if (jVar != null) {
            jVar.b(this.C);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f38842n0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f38852v0 != null && this.f38854w0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f38852v0.f26124c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = dp / 2.0f;
            float f17 = f14 - f16;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f17, f15 - dp2, f14 + f16, f15 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f38854w0);
            this.f38852v0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f38839k0 && this.f38828b0 != null) {
            if (this.f38837i0 != null) {
                this.f38839k0 = true;
                return this.F;
            }
            org.telegram.ui.Cells.s1 s1Var = this.N;
            if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f38839k0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.M.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void n(boolean z4) {
        qi0 qi0Var;
        int i10;
        ni0 ni0Var = this.H;
        if (ni0Var != null && ni0Var.getAdapter() != null && (qi0Var = this.J) != null) {
            int h = ni0Var.getAdapter().h();
            if (z4) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            qi0Var.i1(i10, AndroidUtilities.dp(12.0f), z4);
            this.f38850t0 = z4;
        }
    }

    public final void o(long j10) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.F = j10;
        boolean i11 = this.M.i();
        ArrayList arrayList = this.K;
        if (!i11 && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        } else {
            i10 = 0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            messageObject = (MessageObject) arrayList.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f38828b0 != null && (effect = MessagesController.getInstance(this.f38829c).getEffect(j10)) != null) {
            this.f38828b0.setSelectedReactionAnimated(mg.q0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.Y) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.Y = false;
            return;
        }
        ii0 ii0Var = this.f38828b0;
        if (ii0Var != null && ii0Var.getReactionsWindow() != null) {
            if (!this.f38828b0.getReactionsWindow().C) {
                this.f38828b0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f38839k0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fi0 fi0Var = this.C;
        setContentView(fi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        fi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(fi0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.p70 p70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38827b;
        p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        p70Var.Q(this.f38836h0, rg.b.k(f6Var), false);
        ViewGroup viewGroup = p70Var.A;
        this.W = viewGroup;
        this.D.addView(viewGroup, k7.b6.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.M;
            if (i13 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i13);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    hVar.k(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < groupedMessages.messages.size()) {
                            if (groupedMessages.messages.get(i14).getId() == messageObject.getId()) {
                                break;
                            }
                            i14++;
                        } else {
                            groupedMessages.messages.add(messageObject);
                            break;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i13++;
        }
        for (int i15 = 0; i15 < hVar.m(); i15++) {
            ((MessageObject.GroupedMessages) hVar.n(i15)).calculate();
        }
        ArrayList arrayList2 = this.K;
        arrayList2.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            int i17 = this.L;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f38851u0 == null) {
                    this.f38851u0 = new org.telegram.ui.Cells.s1(getContext(), this.f38829c, true, null, this.f38827b);
                }
                org.telegram.ui.Cells.s1 s1Var = this.f38851u0;
                s1Var.K7 = false;
                s1Var.M7 = false;
                s1Var.N7 = false;
                s1Var.O7 = false;
                s1Var.P7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                nh.y2 y2Var = s1Var.P0;
                y2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = s1Var.f22043j9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = s1Var.C9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = s1Var.f22114o9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    s1Var.te = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            s1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += s1Var.G8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    s1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    y2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    s1Var.n4();
                    i11 = s1Var.G8;
                }
            }
            this.L = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        ni0 ni0Var = this.H;
        ni0Var.getAdapter().l();
        int h = ni0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.J.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.lg r(org.telegram.ui.Components.lg lgVar, boolean z4, View.OnClickListener onClickListener) {
        this.T = lgVar;
        int[] iArr = this.f38840l0;
        lgVar.getLocationOnScreen(iArr);
        hi0 hi0Var = new hi0(this, getContext(), lgVar.f26657b, this.f38827b, lgVar, z4);
        this.U = hi0Var;
        hi0Var.setScaleX(this.T.getScaleX());
        this.U.setScaleY(this.T.getScaleY());
        org.telegram.ui.Components.lg lgVar2 = this.T;
        hi0 hi0Var2 = this.U;
        hi0Var2.B = lgVar2.B;
        hi0Var2.f26662e0 = lgVar2.f26662e0;
        hi0Var2.W.q(lgVar2.W.f25850g, false, true);
        hi0Var2.f26656a0 = lgVar2.f26656a0;
        hi0Var2.setEmoji(lgVar2.f26663f.f25836f[0]);
        hi0Var2.i(lgVar2.f26669s, lgVar2.f26668r, true);
        hi0Var2.M.d(lgVar2.M.f31253c, true);
        hi0Var2.f26671x.d(lgVar2.f26671x.f31253c, true);
        int i10 = lgVar2.F;
        int i11 = lgVar2.G;
        hi0Var2.F = i10;
        hi0Var2.G = i11;
        float f10 = lgVar2.J;
        float f11 = lgVar2.K;
        hi0Var2.J = f10;
        hi0Var2.K = f11;
        this.U.M.d(lgVar.M.f31253c, true);
        this.U.setOnClickListener(onClickListener);
        this.D.addView(this.U, new ViewGroup.LayoutParams(lgVar.getWidth(), lgVar.getHeight()));
        org.telegram.ui.Components.lg lgVar3 = this.T;
        lgVar.getHeight();
        this.V = lgVar3.m();
        int i12 = iArr[0];
        int width = this.T.getWidth();
        org.telegram.ui.Components.lg lgVar4 = this.T;
        lgVar.getHeight();
        iArr[0] = b.C(6.0f, width - lgVar4.m(), i12);
        return this.U;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z4;
        org.telegram.ui.Components.k01 k01Var = null;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            k01Var = new org.telegram.ui.Components.k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f38852v0 = k01Var;
        if (this.f38854w0 == null) {
            Paint paint = new Paint(1);
            this.f38854w0 = paint;
            paint.setColor(1073741824);
        }
        this.H.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i11 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    if (i10 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    messageMedia.spoiler = z4;
                }
                i11++;
            } else {
                this.I.l();
                return;
            }
        }
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        ih.j.f(true);
        super.show();
        final float alpha = this.T.getAlpha();
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.hm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ui0 ui0Var = ui0.this;
                sg.b bVar = ui0Var.f38835g0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.lg lgVar2 = ui0Var.T;
                if (lgVar2 != null) {
                    lgVar2.setAlpha(alpha);
                }
                ui0Var.f38833f = bitmap;
                Paint paint = new Paint(1);
                ui0Var.f38841n = paint;
                Bitmap bitmap3 = ui0Var.f38833f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                ui0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ui0Var.f38846r = new Matrix();
                bVar.a(bitmap2);
                tg.c.c(bVar, ui0Var.C);
                ViewGroup viewGroup = ui0Var.W;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        fi0 fi0Var = this.E;
        if (fi0Var != null) {
            fi0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f38830c0) {
            return;
        }
        this.f38831d0 = false;
        this.f38830c0 = true;
        this.f38828b0.p(null, null, true);
        this.f38828b0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.mr.h).start();
        this.f38828b0.r(false);
    }

    public void m(long j10) {
    }
}
