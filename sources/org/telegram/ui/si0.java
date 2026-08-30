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
public class si0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public final di0 C;
    public final ki0 D;
    public final di0 E;
    public long F;
    public org.telegram.ui.Components.j5 G;
    public final li0 H;
    public final ci0 I;
    public final oi0 J;
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
    public fi0 U;
    public int V;
    public ViewGroup W;
    public final ei0 X;
    public boolean Y;
    public float Z;
    public final Context f38350a;
    public FrameLayout f38351a0;
    public final org.telegram.ui.ActionBar.f6 f38352b;
    public gi0 f38353b0;
    public final int f38354c;
    public boolean f38355c0;
    public lf.s0 d;
    public boolean f38356d0;
    public i0.b e;
    public boolean f38357e0;
    public Bitmap f38358f;
    public final ih.j f38359f0;
    public final sg.b f38360g0;
    public BitmapShader h;
    public final ng.a f38361h0;
    public RectF f38362i0;
    public boolean f38363j0;
    public boolean f38364k0;
    public final int[] f38365l0;
    public boolean m0;
    public Paint f38366n;
    public boolean f38367n0;
    public org.telegram.ui.Cells.t1 f38368o0;
    public float f38369p0;
    public float f38370q0;
    public Matrix f38371r;
    public final Rect f38372r0;
    public boolean f38373s;
    public ValueAnimator f38374s0;
    public boolean f38375t0;
    public org.telegram.ui.Cells.t1 f38376u0;
    public boolean v;
    public org.telegram.ui.Components.k01 f38377v0;
    public boolean f38378w;
    public Paint f38379w0;
    public boolean f38380x;
    public boolean f38381y;

    public si0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        lf.s0 s0Var;
        int i10 = UserConfig.selectedAccount;
        this.f38354c = i10;
        this.e = i0.b.e;
        this.K = new ArrayList();
        this.M = new a0.h();
        this.Q = new Paint(1);
        this.f38365l0 = new int[2];
        this.f38367n0 = false;
        this.f38372r0 = new Rect();
        this.f38350a = context;
        this.f38352b = f6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            s0Var = new lf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.d = s0Var;
        di0 di0Var = new di0(this, context, 1);
        this.C = di0Var;
        this.f38359f0 = ih.j.d(1, di0Var, di0Var);
        di0Var.setOnClickListener(new View.OnClickListener(this) {
            public final si0 f32596b;

            {
                this.f32596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32596b.onBackPressed();
                        return;
                    default:
                        this.f32596b.onBackPressed();
                        return;
                }
            }
        });
        di0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                si0 si0Var = si0.this;
                if (!si0Var.m0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(si0Var.P);
                    AndroidUtilities.runOnUIThread(new yh0(si0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        sg.b bVar = new sg.b();
        this.f38360g0 = bVar;
        ng.a aVar = new ng.a(bVar);
        this.f38361h0 = aVar;
        aVar.d = new ug.i(di0Var);
        aVar.e = di0Var;
        ki0 ki0Var = new ki0(this, context, f6Var);
        this.D = ki0Var;
        ki0Var.setClipToPadding(false);
        di0Var.addView(ki0Var, k7.b6.e(-1, -1, 119));
        h hVar = new h(this, 26);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(di0Var, hVar);
        li0 li0Var = new li0(this, context, f6Var);
        this.H = li0Var;
        li0Var.setOnClickListener(new View.OnClickListener(this) {
            public final si0 f32596b;

            {
                this.f32596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32596b.onBackPressed();
                        return;
                    default:
                        this.f32596b.onBackPressed();
                        return;
                }
            }
        });
        li0Var.setOnItemClickListener(new j(this, 17));
        li0Var.setOnScrollListener(new l3(this, 19));
        li0Var.setItemAnimator(new wh.n(null, li0Var, f6Var));
        oi0 oi0Var = new oi0(this);
        this.J = oi0Var;
        oi0Var.O = new pi0(this);
        li0Var.setLayoutManager(oi0Var);
        li0Var.i(new Object());
        ci0 ci0Var = new ci0(this, context, f6Var);
        this.I = ci0Var;
        li0Var.setAdapter(ci0Var);
        li0Var.setVerticalScrollBarEnabled(false);
        li0Var.setOverScrollMode(2);
        ki0Var.addView(li0Var, k7.b6.c(-2.0f, -1));
        di0 di0Var2 = new di0(this, context, 0);
        this.E = di0Var2;
        di0Var.addView(di0Var2, k7.b6.c(-1.0f, -1));
        this.X = new ei0(this, di0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f38354c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        lf.s0 s0Var = this.d;
        if (s0Var != null) {
            s0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.p2 p2Var) {
        mg.z zVar;
        if (this.f38353b0 == null && p2Var != null) {
            int i10 = this.f38354c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f38350a);
            this.f38351a0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38351a0.setClipToPadding(false);
            this.f38351a0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? pk0Var = new org.telegram.ui.Components.pk0(5, this.f38354c, getContext(), null, this.f38352b);
            this.f38353b0 = pk0Var;
            pk0Var.setClipChildren(false);
            this.f38353b0.setClipToPadding(false);
            this.f38353b0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f38353b0.setDelegate(new ii0(this, p2Var));
            this.f38353b0.setTop(false);
            this.f38353b0.setClipChildren(false);
            this.f38353b0.setClipToPadding(false);
            this.f38353b0.setVisibility(0);
            this.f38353b0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f38353b0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f38353b0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.D.addView(this.f38351a0, k7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38351a0.addView(this.f38353b0, k7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38353b0.setScaleY(0.4f);
            this.f38353b0.setScaleX(0.4f);
            this.f38353b0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            gi0 gi0Var = this.f38353b0;
            if (gi0Var != null && !gi0Var.f27893c1) {
                gi0Var.f27893c1 = true;
                gi0Var.f27895d1 = true;
                mg.d0 d0Var = gi0Var.f27918u0;
                if (d0Var != null && (zVar = d0Var.f13981m) != null && !zVar.H1) {
                    zVar.H1 = true;
                    zVar.I1 = true;
                    m51 m51Var = zVar.f37605e0;
                    if (m51Var != null) {
                        m51Var.invalidate();
                    }
                    b51 b51Var = zVar.f37608f0;
                    if (b51Var != null) {
                        b51Var.invalidate();
                    }
                }
            }
            new ph.i3(this.C, false, new w3(this, 9));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f38354c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38367n0) {
            return;
        }
        this.f38367n0 = true;
        fi0 fi0Var = this.U;
        if (fi0Var != null) {
            fi0Var.invalidate();
        }
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.invalidate();
        }
        e(new xh0(this, 2), false);
        this.C.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z4) {
        boolean z10;
        gi0 gi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38374s0;
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
        if (!z4 && (gi0Var = this.f38353b0) != null && this.f38355c0) {
            gi0Var.e();
            if (this.f38353b0.getReactionsWindow() != null && this.f38353b0.getReactionsWindow().f13972a != null) {
                this.f38353b0.getReactionsWindow().f13972a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38353b0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38378w = true;
        this.v = !z4;
        this.H.invalidate();
        this.f38380x = true;
        this.f38381y = true;
        float f11 = this.B;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f38374s0 = ofFloat;
        ofFloat.addUpdateListener(new dg.b1(10, this, z10));
        this.f38374s0.addListener(new org.telegram.ui.ActionBar.f(this, z4, z10, runnable));
        this.f38374s0.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f38374s0.setDuration(350L);
        this.f38374s0.start();
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
        li0 li0Var = this.H;
        if (li0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < li0Var.getChildCount()) {
                View childAt = li0Var.getChildAt(i11);
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
            li0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        li0Var.getAdapter().m(i12);
    }

    public final void h(boolean z4) {
        this.f38373s = z4;
        dismiss();
    }

    public final void i() {
        if (this.f38367n0) {
            return;
        }
        this.f38367n0 = true;
        ih.j.f(false);
        ih.j jVar = this.f38359f0;
        if (jVar != null) {
            jVar.b(this.C);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f38367n0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f38377v0 != null && this.f38379w0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f38377v0.f26084c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = dp / 2.0f;
            float f17 = f14 - f16;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f17, f15 - dp2, f14 + f16, f15 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f38379w0);
            this.f38377v0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f38364k0 && this.f38353b0 != null) {
            if (this.f38362i0 != null) {
                this.f38364k0 = true;
                return this.F;
            }
            org.telegram.ui.Cells.t1 t1Var = this.N;
            if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f38364k0 = true;
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
        oi0 oi0Var;
        int i10;
        li0 li0Var = this.H;
        if (li0Var != null && li0Var.getAdapter() != null && (oi0Var = this.J) != null) {
            int h = li0Var.getAdapter().h();
            if (z4) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            oi0Var.i1(i10, AndroidUtilities.dp(12.0f), z4);
            this.f38375t0 = z4;
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
        if (this.f38353b0 != null && (effect = MessagesController.getInstance(this.f38354c).getEffect(j10)) != null) {
            this.f38353b0.setSelectedReactionAnimated(mg.q0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.Y) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.Y = false;
            return;
        }
        gi0 gi0Var = this.f38353b0;
        if (gi0Var != null && gi0Var.getReactionsWindow() != null) {
            if (!this.f38353b0.getReactionsWindow().C) {
                this.f38353b0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f38364k0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        di0 di0Var = this.C;
        setContentView(di0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        di0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(di0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.o70 o70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38352b;
        o70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        o70Var.Q(this.f38361h0, rg.b.j(f6Var), false);
        ViewGroup viewGroup = o70Var.A;
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
                if (this.f38376u0 == null) {
                    this.f38376u0 = new org.telegram.ui.Cells.t1(getContext(), this.f38354c, true, null, this.f38352b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.f38376u0;
                t1Var.K7 = false;
                t1Var.M7 = false;
                t1Var.N7 = false;
                t1Var.O7 = false;
                t1Var.P7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                nh.y2 y2Var = t1Var.P0;
                y2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.f22106j9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.C9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.f22177o9;
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
                    y2Var.setIgnoreImageSet(false);
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
        li0 li0Var = this.H;
        li0Var.getAdapter().l();
        int h = li0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.J.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.lg r(org.telegram.ui.Components.lg lgVar, boolean z4, View.OnClickListener onClickListener) {
        this.T = lgVar;
        int[] iArr = this.f38365l0;
        lgVar.getLocationOnScreen(iArr);
        fi0 fi0Var = new fi0(this, getContext(), lgVar.f26640b, this.f38352b, lgVar, z4);
        this.U = fi0Var;
        fi0Var.setScaleX(this.T.getScaleX());
        this.U.setScaleY(this.T.getScaleY());
        org.telegram.ui.Components.lg lgVar2 = this.T;
        fi0 fi0Var2 = this.U;
        fi0Var2.B = lgVar2.B;
        fi0Var2.f26645e0 = lgVar2.f26645e0;
        fi0Var2.W.q(lgVar2.W.f25887g, false, true);
        fi0Var2.f26639a0 = lgVar2.f26639a0;
        fi0Var2.setEmoji(lgVar2.f26646f.f25875f[0]);
        fi0Var2.i(lgVar2.f26652s, lgVar2.f26651r, true);
        fi0Var2.M.d(lgVar2.M.f31241c, true);
        fi0Var2.f26654x.d(lgVar2.f26654x.f31241c, true);
        int i10 = lgVar2.F;
        int i11 = lgVar2.G;
        fi0Var2.F = i10;
        fi0Var2.G = i11;
        float f10 = lgVar2.J;
        float f11 = lgVar2.K;
        fi0Var2.J = f10;
        fi0Var2.K = f11;
        this.U.M.d(lgVar.M.f31241c, true);
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
        this.f38377v0 = k01Var;
        if (this.f38379w0 == null) {
            Paint paint = new Paint(1);
            this.f38379w0 = paint;
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
        org.telegram.ui.Components.im0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                si0 si0Var = si0.this;
                sg.b bVar = si0Var.f38360g0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.lg lgVar2 = si0Var.T;
                if (lgVar2 != null) {
                    lgVar2.setAlpha(alpha);
                }
                si0Var.f38358f = bitmap;
                Paint paint = new Paint(1);
                si0Var.f38366n = paint;
                Bitmap bitmap3 = si0Var.f38358f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                si0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                si0Var.f38371r = new Matrix();
                bVar.a(bitmap2);
                tg.c.c(bVar, si0Var.C);
                ViewGroup viewGroup = si0Var.W;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        di0 di0Var = this.E;
        if (di0Var != null) {
            di0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f38355c0) {
            return;
        }
        this.f38356d0 = false;
        this.f38355c0 = true;
        this.f38353b0.p(null, null, true);
        this.f38353b0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
        this.f38353b0.r(false);
    }

    public void m(long j10) {
    }
}
