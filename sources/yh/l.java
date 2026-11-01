package yh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.j6;
import java.util.WeakHashMap;
import jg.a3;
import kg.f0;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.jo;
import org.telegram.messenger.o5;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.voip.j0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ed;
import org.telegram.ui.fs0;
import org.telegram.ui.pr;
import org.telegram.ui.un;
import org.telegram.ui.z01;
import org.telegram.ui.zd;
import rh.h0;
import w7.b6;
import w7.b9;
import w7.e6;
public final class l extends k2 implements a40, vs, fe.e {
    public RadialProgressView D;
    public r8 E;
    public b40 F;
    public TLRPC.FileLocation G;
    public j6 H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final x1[] K;
    public final j L;
    public hi.c f54502a;
    public final fe.b f54503b;
    public long f54504c;
    public a3 d;
    public v51 e;
    public String f54505f;
    public boolean h;
    public boolean f54506n;
    public j0 f54507r;
    public k f54508s;
    public f0 f54509w;
    public g9 f54510x;
    public AnimatorSet f54511y;

    public l(Bundle bundle) {
        super(bundle);
        this.f54503b = new fe.b(0, this, gr.h, 320L, false);
        this.K = new x1[1];
        this.L = new j(this);
    }

    public static boolean Z(l lVar, b51 b51Var, View view) {
        long j10;
        boolean t10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = b51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f19794id;
            boolean V = w3.V(chat);
            TLRPC.Chat chat2 = lVar.I;
            if (chat2 != null && (chat.creator || w3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = V;
            t10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f19943id;
                t10 = i20.t(user);
                TLRPC.Chat chat3 = lVar.I;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || w3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = false;
            }
            return false;
        }
        boolean z13 = z10;
        int b10 = e0.b(lVar.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            z60 F = z60.F(lVar.d, null, view);
            if (t10) {
                i10 = 2131751910;
            } else if (z11) {
                i10 = 2131751909;
            } else {
                i10 = 2131751908;
            }
            F.l(2131232421, dd.L0(i10, null), new f(lVar, j10, 1), z12);
            F.m(2131232086, new jo(lVar, t10, z11, j10, 2), dd.L0(2131751915, null), z13, true);
            F.W(lVar.e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(l lVar, b51 b51Var) {
        TLRPC.Chat L0;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = b51Var.d;
        if (i10 == 140) {
            if (!lVar.F.g() && (chatPhoto = (L0 = lVar.getMessagesController().L0(Long.valueOf(lVar.f54504c))).photo) != null && chatPhoto.photo_big != null) {
                jc jcVar = null;
                PhotoViewer.v1().N2(null, lVar, null);
                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = lVar.J;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        jcVar = jc.j(lVar.J.chat_photo.video_sizes.get(0), lVar.J.chat_photo);
                    }
                }
                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, jcVar, null, null, null, 0, lVar.L, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            b40 b40Var = lVar.F;
            if (lVar.G == null) {
                z10 = false;
            }
            b40Var.n(z10, new g(lVar, 0), new jg.z(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", lVar.f54504c);
            bundle.putInt("type", 1);
            pr prVar = new pr(bundle);
            prVar.C0(lVar.J);
            lVar.presentFragment(prVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", lVar.f54504c);
            bundle2.putInt("type", 0);
            pr prVar2 = new pr(bundle2);
            prVar2.C0(lVar.J);
            lVar.presentFragment(prVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", lVar.f54504c);
            lVar.presentFragment(new p(bundle3));
        } else if (i10 == 150) {
            lVar.e0(true);
        } else if (i10 == 151) {
            lVar.e0(false);
        } else if (i10 == 145) {
            s4.r(lVar, false, lVar.I, null, false, true, true, false, new i(lVar));
        } else if (i10 == 146) {
            e0.e(lVar.K, lVar, lVar.currentAccount, lVar.I);
        } else {
            Object obj = b51Var.G;
            if (obj instanceof TLRPC.Chat) {
                lVar.presentFragment(un.ma(-((TLRPC.Chat) obj).f19794id));
            } else if (obj instanceof TLRPC.User) {
                lVar.presentFragment(un.ma(((TLRPC.User) obj).f19943id));
            }
        }
    }

    public static void b0(l lVar) {
        lVar.G = null;
        wp.r1(lVar.currentAccount).B(lVar.f54504c, null, null, null, null, 0.0d, null, null, null, null);
        lVar.f0(false, true);
        lVar.f54510x.j(null, null, lVar.E, lVar.I);
    }

    public static void c0(l lVar, long j10) {
        wp.r1(lVar.currentAccount).O2(j10, lVar.f54504c, true, false, new h(lVar, 0));
    }

    @Override
    public final void I(float f7) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        i0.g3(new ed(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new c2(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 21));
        hi.c cVar = new hi.c();
        this.f54502a = cVar;
        cVar.a(getThemedColor(t6.f20930d6));
        this.actionBar.M(new tg.b(cVar, cVar, cVar), b9.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        a3 a3Var = new a3(this, context);
        this.d = a3Var;
        a7.i(t6.f20873a7, a3Var, null);
        this.E = new r8(this.I);
        k kVar = new k(context);
        this.f54508s = kVar;
        kVar.f54501a.e(this.I, this.E);
        this.f54510x = this.f54508s.f54501a;
        String m10 = o5.m(this.I);
        this.f54505f = m10;
        p6 p6Var = this.resourceProvider;
        j0 j0Var = new j0(context, 11);
        zd zdVar = new zd(context, 6);
        j0Var.f31555b = zdVar;
        a7.V(zdVar, t6.G6, p6Var);
        a7.H(zdVar, t6.Uc, p6Var);
        a7.E(zdVar, t6.H6, p6Var);
        zdVar.setTextSize(1, 16.0f);
        zdVar.setMaxLines(Integer.MAX_VALUE);
        zdVar.setBackground(null);
        zdVar.setImeOptions(zdVar.getImeOptions() | 268435456);
        zdVar.setInputType(zdVar.getInputType() | 16384);
        zdVar.setPadding(i0.L(4.0f), i0.L(10.0f), i0.L(4.0f), i0.L(11.0f));
        zdVar.setMinHeight(i0.L(50.0f));
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j0Var.addView(zdVar, b6.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f54507r = j0Var;
        zdVar.setText(m10);
        ((zd) this.f54507r.f31555b).setSelection(m10.length());
        ((zd) this.f54507r.f31555b).addTextChangedListener(new h0(this, 4));
        j6 j6Var = new j6(this, context);
        this.H = j6Var;
        a7.V(j6Var, t6.Gi, getResourceProvider());
        this.H.setText(dd.L0(2131745963, null));
        this.H.setTypeface(i0.o());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(i0.L(12.0f), 0, i0.L(12.0f), 0);
        this.H.setOnClickListener(new rh.s(this, 27));
        e6.a(this.H);
        this.actionBar.addView(this.H, b6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.f54509w = f0Var;
        this.f54508s.addView(f0Var, b6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D = radialProgressView;
        radialProgressView.setSize(i0.L(30.0f));
        this.D.setProgressColor(-1);
        this.D.setNoProgress(false);
        this.f54508s.addView(this.D, b6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        v51 v51Var = new v51(this, new h(this, 1), new i(this), new i(this));
        this.e = v51Var;
        v51Var.setClipToPadding(false);
        v51 v51Var2 = this.e;
        q51 q51Var = v51Var2.f31183f3;
        q51Var.f29638r = false;
        q51Var.f29639s = true;
        v51Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, b6.c(-1.0f, -1));
        this.d.addView(this.actionBar, b6.e(-1, -2, 48));
        a3 a3Var2 = this.d;
        i iVar = new i(this);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(a3Var2, iVar);
        a3 a3Var3 = this.d;
        this.fragmentView = a3Var3;
        return a3Var3;
    }

    public final void d0() {
        boolean z10;
        if (this.h == this.f54506n && TextUtils.equals(((zd) this.f54507r.f31555b).getText().toString(), this.f54505f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f54503b.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19795id == this.f54504c) {
                this.J = chatFull;
                this.e.f31183f3.O(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.F.f24620c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10) {
        if (this.f54506n == z10) {
            return;
        }
        l6 l6Var = (l6) this.e.B1(151);
        if (l6Var != null) {
            l6Var.a(!z10);
        }
        l6 l6Var2 = (l6) this.e.B1(150);
        if (l6Var2 != null) {
            l6Var2.a(z10);
        }
        this.f54506n = z10;
        d0();
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.D == null) {
            return;
        }
        AnimatorSet animatorSet = this.f54511y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f54511y = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f54511y = animatorSet2;
            if (z10) {
                this.D.setVisibility(0);
                this.f54509w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f54511y;
                RadialProgressView radialProgressView = this.D;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f54509w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.D;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f54509w, property2, 0.0f));
            }
            this.f54511y.setDuration(180L);
            this.f54511y.addListener(new sg.y(16, this, z10));
            this.f54511y.start();
        } else if (z10) {
            this.D.setAlpha(1.0f);
            this.D.setVisibility(0);
            this.f54509w.setAlpha(1.0f);
            this.f54509w.setVisibility(0);
        } else {
            this.D.setAlpha(0.0f);
            this.D.setVisibility(4);
            this.f54509w.setAlpha(0.0f);
            this.f54509w.setVisibility(4);
        }
    }

    @Override
    public final fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((zd) this.f54507r.f31555b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.F.h(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f54504c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f54504c));
        this.I = L0;
        if (L0 != null && ((tL_chatBannedRights = L0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f54506n = z10;
        this.J = getMessagesController().M0(this.f54504c);
        b40 b40Var = new b40(3, true, true);
        this.F = b40Var;
        b40Var.f24618a = this;
        b40Var.f24619b = this;
        getNotificationCenter().c(this, at.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, at.T);
        b40 b40Var = this.F;
        if (b40Var != null) {
            b40Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.F.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hi.c cVar = this.f54502a;
            if (cVar != null) {
                cVar.a(getThemedColor(t6.f20930d6));
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        b40 b40Var = this.F;
        if (b40Var != null) {
            b40Var.f24621f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        b40 b40Var = this.F;
        if (b40Var != null && (str = b40Var.f24621f) != null) {
            bundle.putString("path", str);
        }
        j0 j0Var = this.f54507r;
        if (j0Var != null) {
            String obj = ((zd) j0Var.f31555b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        this.H.setAlpha(f7);
        this.H.setScaleX(i0.T1(0.75f, 1.0f, f7));
        this.H.setScaleY(i0.T1(0.75f, 1.0f, f7));
        j6 j6Var = this.H;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        j6Var.setVisibility(i11);
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
