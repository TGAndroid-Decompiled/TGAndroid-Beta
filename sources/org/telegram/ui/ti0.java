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
public class ti0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public final ei0 C;
    public final li0 D;
    public final ei0 E;
    public long F;
    public org.telegram.ui.Components.j5 G;
    public final mi0 H;
    public final di0 I;
    public final pi0 J;
    public final ArrayList K;
    public int L;
    public final a0.h M;
    public org.telegram.ui.Cells.t1 N;
    public int O;
    public org.telegram.ui.Components.ff P;
    public final Paint Q;
    public org.telegram.ui.Components.d R;
    public org.telegram.ui.Components.sd S;
    public org.telegram.ui.Components.lg T;
    public gi0 U;
    public int V;
    public ViewGroup W;
    public final fi0 X;
    public boolean Y;
    public float Z;
    public final Context f41547a;
    public FrameLayout f41548a0;
    public final org.telegram.ui.ActionBar.g6 f41549b;
    public hi0 f41550b0;
    public final int f41551c;
    public boolean f41552c0;
    public lf.s0 d;
    public boolean f41553d0;
    public i0.b f41554e;
    public boolean f41555e0;
    public Bitmap f41556f;
    public final jh.j f41557f0;
    public final tg.b f41558g0;
    public BitmapShader h;
    public final og.a f41559h0;
    public RectF f41560i0;
    public boolean f41561j0;
    public boolean f41562k0;
    public final int[] f41563l0;
    public boolean m0;
    public Paint f41564n;
    public boolean f41565n0;
    public org.telegram.ui.Cells.t1 f41566o0;
    public float f41567p0;
    public float f41568q0;
    public Matrix f41569r;
    public final Rect f41570r0;
    public boolean f41571s;
    public ValueAnimator f41572s0;
    public boolean f41573t0;
    public org.telegram.ui.Cells.t1 f41574u0;
    public boolean v;
    public org.telegram.ui.Components.k01 f41575v0;
    public boolean f41576w;
    public Paint f41577w0;
    public boolean f41578x;
    public boolean f41579y;

    public ti0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        lf.s0 s0Var;
        int i10 = UserConfig.selectedAccount;
        this.f41551c = i10;
        this.f41554e = i0.b.f7756e;
        this.K = new ArrayList();
        this.M = new a0.h();
        this.Q = new Paint(1);
        this.f41563l0 = new int[2];
        this.f41565n0 = false;
        this.f41570r0 = new Rect();
        this.f41547a = context;
        this.f41549b = g6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            s0Var = new lf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.d = s0Var;
        ei0 ei0Var = new ei0(this, context, 1);
        this.C = ei0Var;
        this.f41557f0 = jh.j.d(1, ei0Var, ei0Var);
        ei0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ti0 f35542b;

            {
                this.f35542b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35542b.onBackPressed();
                        return;
                    default:
                        this.f35542b.onBackPressed();
                        return;
                }
            }
        });
        ei0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                ti0 ti0Var = ti0.this;
                if (!ti0Var.m0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(ti0Var.P);
                    AndroidUtilities.runOnUIThread(new zh0(ti0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        tg.b bVar = new tg.b();
        this.f41558g0 = bVar;
        og.a aVar = new og.a(bVar);
        this.f41559h0 = aVar;
        aVar.d = new vg.i(ei0Var);
        aVar.f16756e = ei0Var;
        li0 li0Var = new li0(this, context, g6Var);
        this.D = li0Var;
        li0Var.setClipToPadding(false);
        ei0Var.addView(li0Var, k7.c6.e(-1, -1, 119));
        h hVar = new h(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(ei0Var, hVar);
        mi0 mi0Var = new mi0(this, context, g6Var);
        this.H = mi0Var;
        mi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ti0 f35542b;

            {
                this.f35542b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35542b.onBackPressed();
                        return;
                    default:
                        this.f35542b.onBackPressed();
                        return;
                }
            }
        });
        mi0Var.setOnItemClickListener(new j(this, 17));
        mi0Var.setOnScrollListener(new l3(this, 19));
        mi0Var.setItemAnimator(new xh.n(null, mi0Var, g6Var));
        pi0 pi0Var = new pi0(this);
        this.J = pi0Var;
        pi0Var.O = new qi0(this);
        mi0Var.setLayoutManager(pi0Var);
        mi0Var.i(new Object());
        di0 di0Var = new di0(this, context, g6Var);
        this.I = di0Var;
        mi0Var.setAdapter(di0Var);
        mi0Var.setVerticalScrollBarEnabled(false);
        mi0Var.setOverScrollMode(2);
        li0Var.addView(mi0Var, k7.c6.c(-2.0f, -1));
        ei0 ei0Var2 = new ei0(this, context, 0);
        this.E = ei0Var2;
        ei0Var.addView(ei0Var2, k7.c6.c(-1.0f, -1));
        this.X = new fi0(this, ei0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f41551c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        lf.s0 s0Var = this.d;
        if (s0Var != null) {
            s0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.p2 p2Var) {
        ng.z zVar;
        if (this.f41550b0 == null && p2Var != null) {
            int i10 = this.f41551c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f41547a);
            this.f41548a0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f41548a0.setClipToPadding(false);
            this.f41548a0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? qk0Var = new org.telegram.ui.Components.qk0(5, this.f41551c, getContext(), null, this.f41549b);
            this.f41550b0 = qk0Var;
            qk0Var.setClipChildren(false);
            this.f41550b0.setClipToPadding(false);
            this.f41550b0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f41550b0.setDelegate(new ji0(this, p2Var));
            this.f41550b0.setTop(false);
            this.f41550b0.setClipChildren(false);
            this.f41550b0.setClipToPadding(false);
            this.f41550b0.setVisibility(0);
            this.f41550b0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f41550b0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f41550b0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.D.addView(this.f41548a0, k7.c6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f41548a0.addView(this.f41550b0, k7.c6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f41550b0.setScaleY(0.4f);
            this.f41550b0.setScaleX(0.4f);
            this.f41550b0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            hi0 hi0Var = this.f41550b0;
            if (hi0Var != null && !hi0Var.f30431c1) {
                hi0Var.f30431c1 = true;
                hi0Var.f30433d1 = true;
                ng.d0 d0Var = hi0Var.f30457u0;
                if (d0Var != null && (zVar = d0Var.f16045m) != null && !zVar.H1) {
                    zVar.H1 = true;
                    zVar.I1 = true;
                    t51 t51Var = zVar.f42314e0;
                    if (t51Var != null) {
                        t51Var.invalidate();
                    }
                    i51 i51Var = zVar.f42317f0;
                    if (i51Var != null) {
                        i51Var.invalidate();
                    }
                }
            }
            new qh.h3(this.C, false, new w3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f41551c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f41565n0) {
            return;
        }
        this.f41565n0 = true;
        gi0 gi0Var = this.U;
        if (gi0Var != null) {
            gi0Var.invalidate();
        }
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.invalidate();
        }
        e(new yh0(this, 2), false);
        this.C.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z4) {
        boolean z10;
        hi0 hi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f41572s0;
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
        if (!z4 && (hi0Var = this.f41550b0) != null && this.f41552c0) {
            hi0Var.e();
            if (this.f41550b0.getReactionsWindow() != null && this.f41550b0.getReactionsWindow().f16035a != null) {
                this.f41550b0.getReactionsWindow().f16035a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f41550b0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f41576w = true;
        this.v = !z4;
        this.H.invalidate();
        this.f41578x = true;
        this.f41579y = true;
        float f11 = this.B;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f41572s0 = ofFloat;
        ofFloat.addUpdateListener(new eg.z0(10, this, z10));
        this.f41572s0.addListener(new org.telegram.ui.ActionBar.f(this, z4, z10, runnable));
        this.f41572s0.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f41572s0.setDuration(350L);
        this.f41572s0.start();
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
        org.telegram.ui.Cells.t1 t1Var;
        mi0 mi0Var = this.H;
        if (mi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < mi0Var.getChildCount()) {
                View childAt = mi0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                t1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
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
        if (t1Var2 == null) {
            mi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        mi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z4) {
        this.f41571s = z4;
        dismiss();
    }

    public final void i() {
        if (this.f41565n0) {
            return;
        }
        this.f41565n0 = true;
        jh.j.f(false);
        jh.j jVar = this.f41557f0;
        if (jVar != null) {
            jVar.b(this.C);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f41565n0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f41575v0 != null && this.f41577w0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f41575v0.f28227c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = dp / 2.0f;
            float f17 = f14 - f16;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f17, f15 - dp2, f14 + f16, f15 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f41577w0);
            this.f41575v0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f41562k0 && this.f41550b0 != null) {
            if (this.f41560i0 != null) {
                this.f41562k0 = true;
                return this.F;
            }
            org.telegram.ui.Cells.t1 t1Var = this.N;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f41562k0 = true;
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
        pi0 pi0Var;
        int i10;
        mi0 mi0Var = this.H;
        if (mi0Var != null && mi0Var.getAdapter() != null && (pi0Var = this.J) != null) {
            int h = mi0Var.getAdapter().h();
            if (z4) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            pi0Var.i1(i10, AndroidUtilities.dp(12.0f), z4);
            this.f41573t0 = z4;
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
        if (this.f41550b0 != null && (effect = MessagesController.getInstance(this.f41551c).getEffect(j10)) != null) {
            this.f41550b0.setSelectedReactionAnimated(ng.q0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.Y) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.Y = false;
            return;
        }
        hi0 hi0Var = this.f41550b0;
        if (hi0Var != null && hi0Var.getReactionsWindow() != null) {
            if (!this.f41550b0.getReactionsWindow().C) {
                this.f41550b0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f41562k0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ei0 ei0Var = this.C;
        setContentView(ei0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ei0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ei0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void p(org.telegram.ui.Components.q70 q70Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41549b;
        q70Var.T(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
        q70Var.Q(this.f41559h0, sg.b.k(g6Var), false);
        ViewGroup viewGroup = q70Var.A;
        this.W = viewGroup;
        this.D.addView(viewGroup, k7.c6.c(-2.0f, -2));
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
                if (this.f41574u0 == null) {
                    this.f41574u0 = new org.telegram.ui.Cells.t1(getContext(), this.f41551c, true, null, this.f41549b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f41574u0;
                t1Var.K7 = false;
                t1Var.M7 = false;
                t1Var.N7 = false;
                t1Var.O7 = false;
                t1Var.P7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                oh.z2 z2Var = t1Var.P0;
                z2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f23908j9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.C9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f23979o9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.te = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += t1Var.G8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    t1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    z2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.n4();
                    i11 = t1Var.G8;
                }
            }
            this.L = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        mi0 mi0Var = this.H;
        mi0Var.getAdapter().l();
        int h = mi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.J.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.lg r(org.telegram.ui.Components.lg lgVar, boolean z4, View.OnClickListener onClickListener) {
        this.T = lgVar;
        int[] iArr = this.f41563l0;
        lgVar.getLocationOnScreen(iArr);
        gi0 gi0Var = new gi0(this, getContext(), lgVar.f28736b, this.f41549b, lgVar, z4);
        this.U = gi0Var;
        gi0Var.setScaleX(this.T.getScaleX());
        this.U.setScaleY(this.T.getScaleY());
        org.telegram.ui.Components.lg lgVar2 = this.T;
        gi0 gi0Var2 = this.U;
        gi0Var2.B = lgVar2.B;
        gi0Var2.f28742e0 = lgVar2.f28742e0;
        gi0Var2.W.q(lgVar2.W.f28003g, false, true);
        gi0Var2.f28735a0 = lgVar2.f28735a0;
        gi0Var2.setEmoji(lgVar2.f28743f.f27988f[0]);
        gi0Var2.i(lgVar2.f28749s, lgVar2.f28748r, true);
        gi0Var2.M.d(lgVar2.M.f33763c, true);
        gi0Var2.f28751x.d(lgVar2.f28751x.f33763c, true);
        int i10 = lgVar2.F;
        int i11 = lgVar2.G;
        gi0Var2.F = i10;
        gi0Var2.G = i11;
        float f10 = lgVar2.J;
        float f11 = lgVar2.K;
        gi0Var2.J = f10;
        gi0Var2.K = f11;
        this.U.M.d(lgVar.M.f33763c, true);
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
            k01Var = new org.telegram.ui.Components.k01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f41575v0 = k01Var;
        if (this.f41577w0 == null) {
            Paint paint = new Paint(1);
            this.f41577w0 = paint;
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
        jh.j.f(true);
        super.show();
        final float alpha = this.T.getAlpha();
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.im0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ti0 ti0Var = ti0.this;
                tg.b bVar = ti0Var.f41558g0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.lg lgVar2 = ti0Var.T;
                if (lgVar2 != null) {
                    lgVar2.setAlpha(alpha);
                }
                ti0Var.f41556f = bitmap;
                Paint paint = new Paint(1);
                ti0Var.f41564n = paint;
                Bitmap bitmap3 = ti0Var.f41556f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                ti0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ti0Var.f41569r = new Matrix();
                bVar.a(bitmap2);
                ug.c.c(bVar, ti0Var.C);
                ViewGroup viewGroup = ti0Var.W;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ei0 ei0Var = this.E;
        if (ei0Var != null) {
            ei0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f41552c0) {
            return;
        }
        this.f41553d0 = false;
        this.f41552c0 = true;
        this.f41550b0.p(null, null, true);
        this.f41550b0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
        this.f41550b0.r(false);
    }

    public void m(long j10) {
    }
}
