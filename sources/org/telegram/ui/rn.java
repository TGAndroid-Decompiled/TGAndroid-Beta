package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class rn extends org.telegram.ui.ActionBar.g2 implements org.telegram.ui.Components.w30, org.telegram.messenger.gs {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public org.telegram.ui.Cells.z6 H;
    public boolean H0;
    public org.telegram.ui.Cells.n8 I;
    public boolean I0;
    public org.telegram.ui.Cells.n8 J;
    public boolean J0;
    public org.telegram.ui.Cells.n8 K;
    public boolean K0;
    public org.telegram.ui.Cells.n8 L;
    public TLRPC.ChatReactions L0;
    public rl0 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public org.telegram.ui.Cells.n8 N;
    public boolean N0;
    public org.telegram.ui.Cells.n8 O;
    public boolean O0;
    public org.telegram.ui.Cells.n8 P;
    public boolean P0;
    public org.telegram.ui.Cells.a9 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.n8 R;
    public final pn R0;
    public LinearLayout S;
    public org.telegram.ui.Components.oh0 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public org.telegram.ui.Cells.n8 U;
    public org.telegram.ui.Cells.n8 V;
    public org.telegram.ui.Cells.n8 W;
    public org.telegram.ui.Cells.n8 X;
    public org.telegram.ui.Cells.n8 Y;
    public org.telegram.ui.Cells.n8 Z;
    public org.telegram.ui.ActionBar.c5 f51643a;
    public org.telegram.ui.Cells.n8 f51644a0;
    public org.telegram.ui.ActionBar.t1 f51645b;
    public org.telegram.ui.Cells.n8 f51646b0;
    public UndoView f51647c;
    public qn f51648c0;
    public LinearLayout d;
    public FrameLayout f51649d0;
    public fi.t3 f51650e;
    public org.telegram.ui.Cells.x9 f51651e0;
    public hi.l5 f51652f;
    public org.telegram.ui.Cells.n8 f51653f0;
    public org.telegram.ui.Cells.n8 f51654g0;
    public AnimatorSet h;
    public mi.b f51655h0;
    public org.telegram.ui.Cells.a9 f51656i0;
    public org.telegram.ui.Cells.n8 f51657j0;
    public org.telegram.ui.Cells.a9 f51658k0;
    public org.telegram.ui.Cells.n8 f51659l0;
    public org.telegram.ui.Cells.n8 m0;
    public RadialProgressView f51660n;
    public org.telegram.ui.Cells.n8 f51661n0;
    public org.telegram.ui.Cells.n8 f51662o0;
    public org.telegram.ui.Cells.n8 f51663p0;
    public org.telegram.ui.Cells.n8 f51664q0;
    public final org.telegram.ui.Components.b9 f51665r;
    public org.telegram.ui.Cells.n8 f51666r0;
    public final org.telegram.ui.Components.x30 f51667s;
    public org.telegram.ui.Cells.a9 f51668s0;
    public org.telegram.ui.Cells.a9 f51669t0;
    public org.telegram.ui.Cells.n8 f51670u0;
    public TLRPC.FileLocation f51671v0;
    public org.telegram.ui.Components.yt f51672w;
    public long f51673w0;
    public org.telegram.ui.Components.vm0 f51674x;
    public TLRPC.Chat f51675x0;
    public org.telegram.ui.Components.wm0 f51676y;
    public TLRPC.ChatFull f51677y0;
    public TLRPC.TL_chatAdminRights f51678z0;

    public rn(Bundle bundle) {
        super(bundle);
        int i7;
        this.Q0 = new ArrayList();
        this.R0 = new pn(this);
        this.f51665r = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f51673w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.f51673w0 != 0) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f51673w0));
            if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.f51667s = new org.telegram.ui.Components.x30(i7, true, true);
            return;
        }
        this.f51667s = new org.telegram.ui.Components.x30(0, false, false);
    }

    public static void Z(rn rnVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder W2;
        if (!rnVar.G0) {
            TLRPC.ChatFull chatFull = rnVar.f51677y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131752268, "ChannelTopicsDiscussionForbidden"));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(rnVar.getMessagesController().f25846f5, "ChannelTopicsForbidden", new Object[0]));
            }
            org.telegram.ui.Components.lc.b0(rnVar).Q(2131624295, 36, W2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
        g2Var.f51779a = -rnVar.f51673w0;
        g2Var.setResourceProvider(rnVar.resourceProvider);
        boolean z10 = rnVar.F0;
        boolean z11 = rnVar.H0;
        boolean z12 = rnVar.I0;
        fi.b0 b0Var = new fi.b0(3, rnVar, view);
        g2Var.f51781c = z10;
        g2Var.d = z11;
        g2Var.f51782e = z12;
        g2Var.h = b0Var;
        rnVar.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
    }

    public static void a0(rn rnVar) {
        rnVar.f51671v0 = null;
        long j3 = rnVar.C0;
        if (j3 == 0) {
            org.telegram.messenger.np.u1(rnVar.currentAccount).B(rnVar.f51673w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().q1(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f28568id = new TLRPC.TL_inputPhotoEmpty();
            rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new kn(rnVar, 2));
        }
        rnVar.s0(false, true);
        fi.t3 t3Var = rnVar.f51650e;
        org.telegram.ui.Components.b9 b9Var = rnVar.f51665r;
        Object obj = rnVar.D0;
        if (obj == null) {
            obj = rnVar.f51675x0;
        }
        t3Var.j(null, null, b9Var, obj);
        rnVar.S0.M(0);
        rnVar.f51648c0.f31168e.d();
    }

    public static void b0(rn rnVar, long j3, long j10) {
        org.telegram.messenger.np.u1(rnVar.currentAccount).W2(j3, j10, true, false, new a5(rnVar, 4));
    }

    public static void c0(rn rnVar) {
        int i7 = rnVar.currentAccount;
        long j3 = rnVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = rnVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle l10 = org.telegram.ui.Cells.c0.l(16, "onlySelect", "dialogsType", true);
        l10.putBoolean("resetDelegate", false);
        cx cxVar = new cx(l10);
        cxVar.setCurrentAccount(i7);
        cxVar.E2 = new ki.l1(cxVar, i7, j3, botVerifierSettings);
        T.presentFragment(cxVar);
    }

    public static void d0(rn rnVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, org.telegram.messenger.g3 g3Var) {
        t1Var.dismiss();
        if (rnVar.getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(35, rnVar.currentAccount, rnVar.getParentActivity(), rnVar, rnVar.getResourceProvider());
        k0Var.B1(g3Var);
        k0Var.A1(tL_premium_boostsStatus, true);
        k0Var.C1(j3);
        TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(-j3));
        if (O0 != null) {
            k0Var.M2 = new eh(6, rnVar, O0);
        }
        rnVar.showDialog(k0Var);
    }

    public static void e0(rn rnVar) {
        qc qcVar = new qc(-rnVar.f51675x0.f28434id);
        qcVar.m0 = rnVar;
        rnVar.presentFragment(qcVar);
        org.telegram.messenger.np.u1(rnVar.currentAccount).h7.edit().putInt("boostingappearance", org.telegram.messenger.np.u1(rnVar.currentAccount).h7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static void f0(rn rnVar) {
        rnVar.P0 = true;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(rnVar.currentAccount);
        int i7 = org.telegram.messenger.np.I8;
        f10.k(org.telegram.messenger.ls.f25371r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz(10);
        izVar.f48843a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        izVar.f48847f = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false);
        izVar.f48848n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String l0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i7);
            i7++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.f51660n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f51660n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
    }

    @Override
    public final android.view.View createView(android.content.Context r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f51667s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f51667s.f41960c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f51672w.getText().toString();
    }

    @Override
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
        return this.f51676y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qn qnVar = this.f51648c0;
        int i7 = org.telegram.ui.ActionBar.m6.f29473i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(qnVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51648c0, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29697u6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51648c0, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29716v6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.U, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Cells.n8 n8Var = this.V;
        if (n8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(n8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.J, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51672w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29510k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51672w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29528l6));
        LinearLayout linearLayout = this.E;
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51649d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51651e0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f51651e0, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29602p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.P, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Cells.n8 n8Var2 = this.L;
        if (n8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(n8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        org.telegram.ui.Cells.n8 n8Var3 = this.f51646b0;
        if (n8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(n8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        org.telegram.ui.Components.yt ytVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.yt ytVar2 = this.f51672w;
            if ((ytVar2 != null && !this.D0.first_name.equals(ytVar2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String N0 = org.telegram.messenger.hd.N0(2131743481, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.N0(2131752971, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new ln(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747386, null), new ln(this, 1));
                    showDialog(t1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.f51677y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.v3.T(this.f51675x0) && this.f51677y0.hidden_prehistory != this.K0) || (((ytVar = this.f51672w) != null && !this.f51675x0.title.equals(ytVar.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.f51675x0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N02 = org.telegram.messenger.hd.N0(2131743481, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                t1Var2.S = N02;
                if (this.J0) {
                    t1Var2.U = org.telegram.messenger.hd.N0(2131752293, "ChannelSettingsChangedAlert");
                } else {
                    t1Var2.U = org.telegram.messenger.hd.N0(2131749208, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131754213, "ApplyTheme"), new ln(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747386, "PassportDiscard"), new ln(this, 3));
                showDialog(t1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.f51653f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().R2.f(-this.f51673w0);
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
            if (!TextUtils.isEmpty(gjVar.f24271z)) {
                str = gjVar.f24271z.toString();
            } else if (!TextUtils.isEmpty(gjVar.v)) {
                str = gjVar.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.f51677y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.hd.N0(2131742626, null);
        }
        this.f51653f0.u(org.telegram.messenger.hd.N0(2131742632, null), str, false, 2131231927, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-this.f51673w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new kn(this, 0));
    }

    public final void n0() {
        boolean z10;
        if (this.f51671v0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51667s.n(z10, new mn(this, 0), new q5(this, 5), 0);
        this.S0.M(0);
        this.S0.P(43);
        this.f51648c0.f31168e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.yt ytVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        if (!this.O0 && (ytVar = this.f51672w) != null) {
            if (ytVar.f42534a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.D3(this.f51672w);
                return;
            }
            boolean z12 = true;
            this.O0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().s1(this.D0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.D0.first_name.equals(this.f51672w.getText().toString())) {
                    setbotinfo.name = this.f51672w.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.E0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.F;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.F.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f51645b = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                this.f51645b.setOnCancelListener(new di.z(this, getConnectionsManager().sendRequest(setbotinfo, new u7(8, this, setbotinfo)), 3));
                this.f51645b.show();
            } else if (!org.telegram.messenger.v3.T(this.f51675x0) && (!this.K0 || this.F0)) {
                getMessagesController().T(getParentActivity(), this.f51673w0, this, new ln(this, 5), null);
            } else {
                if (this.f51677y0 != null && org.telegram.messenger.v3.T(this.f51675x0)) {
                    TLRPC.ChatFull chatFull = this.f51677y0;
                    boolean z13 = chatFull.hidden_prehistory;
                    boolean z14 = this.K0;
                    if (z13 != z14) {
                        chatFull.hidden_prehistory = z14;
                        getMessagesController().n5(this.f51673w0, this.K0);
                    }
                }
                if (this.f51667s.g()) {
                    this.N0 = true;
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                    this.f51645b = t1Var;
                    t1Var.setOnCancelListener(new wf(this, 1));
                    this.f51645b.show();
                    return;
                }
                if (!this.f51675x0.title.equals(this.f51672w.getText().toString())) {
                    getMessagesController().C(this.f51673w0, this.f51672w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.f51677y0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.F;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    org.telegram.messenger.np messagesController = getMessagesController();
                    long j3 = this.f51673w0;
                    String obj = this.F.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.f51677y0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.l1(-j3);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.di(messagesController, chatFull3, obj, 7), 64);
                }
                boolean z15 = this.F0;
                TLRPC.Chat chat = this.f51675x0;
                boolean z16 = chat.forum;
                if (z15 != z16 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
                    if (this.H0 != chat.forum_tabs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.I0 != chat.forum_sidebar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z15 == z16) {
                        z12 = false;
                    }
                    getMessagesController().m5(this.f51673w0, this.F0, this.H0, this.I0);
                    if (this.F0 && !this.H0 && (z12 || z10)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i7 = 0; i7 < fragmentStack.size(); i7++) {
                            if ((fragmentStack.get(i7) instanceof bn) && ((bn) fragmentStack.get(i7)).getArguments().getLong("chat_id") == this.f51673w0) {
                                ((ActionBarLayout) getParentLayout()).b0(i7);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f51673w0);
                                org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
                                HashSet hashSet = y91.f54098s1;
                                ((ActionBarLayout) parentLayout).c(i7, y91.I0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10 || z11) {
                        v0(z10);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.f51667s.h(i7, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.yt ytVar = this.f51672w;
        if (ytVar != null && ytVar.f42537e) {
            if (z10) {
                ytVar.k(true);
                return false;
            }
            return false;
        }
        return j0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f51647c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.x30 x30Var = this.f51667s;
        if (x30Var != null) {
            x30Var.d();
        }
        if (this.f51675x0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.ls.T);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25397u5);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25279a5);
            getNotificationCenter().n(this, org.telegram.messenger.ls.O3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.ls.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.ls.E3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25371r);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25282b1);
        org.telegram.ui.Components.yt ytVar = this.f51672w;
        if (ytVar != null) {
            ytVar.o();
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.f51647c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.Components.p5) obj).o(null);
        }
        org.telegram.ui.Components.yt ytVar = this.f51672w;
        if (ytVar != null) {
            ytVar.r();
        }
        UndoView undoView = this.f51647c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f51667s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.f51667s.j(i7, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.yt ytVar = this.f51672w;
        if (ytVar != null) {
            ytVar.s();
            this.f51672w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        u0(true, true);
        this.f51667s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
            fi.t3 t3Var = this.f51650e;
            if (t3Var != null) {
                t3Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn.p0():void");
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.p5 p5Var;
        this.f51677y0 = chatFull;
        if (chatFull != null) {
            if (this.f51675x0 == null) {
                this.f51675x0 = getMessagesController().O0(Long.valueOf(this.f51673w0));
            }
            if (org.telegram.messenger.v3.T(this.f51675x0) && !this.f51677y0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.K0 = z10;
            this.L0 = this.f51677y0.available_reactions;
            ArrayList arrayList = this.Q0;
            arrayList.clear();
            TLRPC.Chat chat = this.f51675x0;
            TLRPC.ChatFull chatFull2 = this.f51677y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.v3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i7);
                        i7++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).f26847r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                p5Var = org.telegram.ui.Components.p5.l(org.telegram.messenger.k10.f24968t0, org.telegram.ui.Components.p5.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            p5Var = org.telegram.ui.Components.p5.m(org.telegram.messenger.k10.f24968t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.p5.f());
                        } else {
                            p5Var = null;
                        }
                        if (p5Var != null) {
                            arrayList2.add(p5Var);
                            p5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).f26839n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(org.telegram.messenger.k10.f24968t0, org.telegram.ui.Components.p5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.f51644a0 != null && getMessagesController().f25880j6 && org.telegram.messenger.v3.V(this.f51675x0)) {
                this.f51644a0.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i7;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User c22;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j3 = this.C0;
                if (j3 == 0) {
                    c22 = null;
                } else {
                    c22 = getMessagesController().c2(Long.valueOf(j3));
                }
                this.D0 = c22;
            }
            org.telegram.ui.Cells.n8 n8Var = this.f51662o0;
            int i10 = 0;
            if (n8Var != null) {
                if (this.E0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n8Var.h(45, z10, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.n8 n8Var2 = this.f51662o0;
                    if (userFull2.starref_program == null) {
                        format = org.telegram.messenger.hd.N0(2131754342, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    n8Var2.w(format, false);
                }
            }
            org.telegram.ui.Cells.n8 n8Var3 = this.f51670u0;
            if (n8Var3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                n8Var3.setVisibility(i7);
            }
            org.telegram.ui.Cells.a9 a9Var = this.f51669t0;
            if (a9Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i10 = 8;
                }
                a9Var.setVisibility(i10);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x30 x30Var = this.f51667s;
        if (x30Var != null) {
            x30Var.f41962f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10, boolean z11) {
        if (this.f51660n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            if (z10) {
                this.f51660n.setVisibility(0);
                this.f51652f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f51660n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f51652f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f51660n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f51652f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new on(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f51660n.setAlpha(1.0f);
            this.f51660n.setVisibility(0);
            this.f51652f.setAlpha(1.0f);
            this.f51652f.setVisibility(0);
        } else {
            this.f51660n.setAlpha(0.0f);
            this.f51660n.setVisibility(4);
            this.f51652f.setAlpha(0.0f);
            this.f51652f.setVisibility(4);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x30 x30Var = this.f51667s;
        if (x30Var != null && (str = x30Var.f41962f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.yt ytVar = this.f51672w;
        if (ytVar != null) {
            String obj = ytVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.n8 n8Var;
        org.telegram.ui.Cells.n8 n8Var2;
        boolean z10;
        int i7;
        gm0 gm0Var;
        org.telegram.messenger.cp d;
        int w02;
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        rl0 rl0Var = this.M;
        if (rl0Var != null) {
            TLRPC.Chat chat = this.f51675x0;
            org.telegram.ui.Cells.n8 n8Var3 = this.O;
            if ((n8Var3 != null && n8Var3.getVisibility() == 0) || (((n8Var = this.R) != null && n8Var.getVisibility() == 0) || ((org.telegram.messenger.v3.n0(this.f51675x0) && org.telegram.messenger.v3.N(this.f51675x0)) || ((n8Var2 = this.N) != null && n8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = rl0Var.f51613n;
            int i13 = rl0Var.f51608a;
            org.telegram.ui.ActionBar.h6 h6Var = rl0Var.d;
            if (chat != null) {
                rl0Var.f51616w = z10;
                rl0Var.f51614r = new org.telegram.ui.Components.xy0(org.telegram.messenger.j6.m(chat.title, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
                gm0 gm0Var2 = rl0Var.f51617x;
                if (gm0Var2 != null) {
                    gm0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = gm0.f48141j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    i7 = -16777216;
                    rl0Var.f51617x = new gm0(i15, i15, i15, tL_emojiStatusCollectible.document_id);
                } else {
                    i7 = -16777216;
                    if (org.telegram.messenger.v3.I(chat) >= 0) {
                        gm0Var = gm0.c(i13, org.telegram.messenger.v3.I(chat));
                        gm0Var.f48142a = org.telegram.messenger.g0.L(11.0f);
                        gm0Var.d();
                    } else {
                        gm0Var = null;
                    }
                    rl0Var.f51617x = gm0Var;
                }
                gm0 gm0Var3 = rl0Var.f51617x;
                if (gm0Var3 != null) {
                    gm0Var3.e(rl0Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (h6Var != null) {
                        q10 = h6Var.d();
                    } else {
                        q10 = org.telegram.ui.ActionBar.m6.I.q();
                    }
                    if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i10 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i10 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | i7;
                    if (arrayList.size() >= 2) {
                        i11 = arrayList.get(1).intValue() | i7;
                    } else {
                        i11 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i12 = arrayList.get(2).intValue() | i7;
                    } else {
                        i12 = intValue;
                    }
                    rl0Var.f51614r.n(i10);
                    paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, i10));
                    gm0 gm0Var4 = new gm0(intValue, i11, i12, tL_peerColorCollectible.gift_emoji_id);
                    gm0Var4.f48142a = org.telegram.messenger.g0.L(11.0f);
                    gm0Var4.d();
                    rl0Var.f51618y = gm0Var4;
                    gm0Var4.e(rl0Var);
                    return;
                }
                int F = org.telegram.messenger.v3.F(chat);
                if (F < 7) {
                    int i16 = org.telegram.ui.ActionBar.m6.f29642r8[F];
                    rl0Var.f51615s = i16;
                    w02 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
                } else {
                    org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).f25966t4;
                    if (dpVar == null) {
                        d = null;
                    } else {
                        d = dpVar.d(F);
                    }
                    if (d != null) {
                        rl0Var.f51615s = -1;
                        w02 = d.f();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.m6.f29642r8[0];
                        rl0Var.f51615s = i17;
                        w02 = org.telegram.ui.ActionBar.m6.w0(i17, h6Var);
                    }
                }
                rl0Var.f51614r.n(w02);
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
                gm0 a10 = gm0.a(i13, F);
                a10.f48142a = org.telegram.messenger.g0.L(11.0f);
                a10.d();
                rl0Var.f51618y = a10;
                a10.e(rl0Var);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        int i11;
        int i12;
        int i13;
        boolean z17;
        boolean z18;
        int i14;
        boolean z19;
        int i15;
        int i16;
        String str;
        boolean z20;
        boolean z21;
        float f10;
        float f11;
        int i17;
        org.telegram.ui.Cells.n8 n8Var;
        TLRPC.ChatFull chatFull;
        int i18;
        String str2;
        String N0;
        org.telegram.ui.Cells.n8 n8Var2;
        org.telegram.ui.Cells.n8 n8Var3;
        boolean z22;
        org.telegram.ui.Cells.n8 n8Var4;
        org.telegram.ui.Cells.n8 n8Var5;
        boolean z23;
        int i19;
        String str3;
        String format;
        org.telegram.ui.Cells.n8 n8Var6;
        org.telegram.ui.Cells.n8 n8Var7;
        boolean z24;
        boolean z25;
        boolean z26;
        int i20;
        int i21;
        org.telegram.ui.Cells.n8 n8Var8;
        org.telegram.ui.Cells.n8 n8Var9;
        org.telegram.ui.Cells.n8 n8Var10;
        TLRPC.Chat O0;
        if (z10 && (O0 = getMessagesController().O0(Long.valueOf(this.f51673w0))) != null) {
            this.f51675x0 = O0;
        }
        boolean t02 = org.telegram.messenger.v3.t0(this.f51675x0);
        org.telegram.ui.Cells.a9 a9Var = this.Q;
        if (a9Var != null) {
            if (this.J == null && (((n8Var8 = this.K) == null || n8Var8.getVisibility() != 0) && (((n8Var9 = this.O) == null || n8Var9.getVisibility() != 0) && ((n8Var10 = this.I) == null || n8Var10.getVisibility() != 0)))) {
                i21 = 8;
            } else {
                i21 = 0;
            }
            a9Var.setVisibility(i21);
        }
        org.telegram.ui.Cells.n8 n8Var11 = this.Z;
        if (n8Var11 != null) {
            if (org.telegram.messenger.v3.T(this.f51675x0)) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            n8Var11.setVisibility(i20);
        }
        org.telegram.ui.Cells.n8 n8Var12 = this.K;
        if (n8Var12 != null) {
            TLRPC.ChatFull chatFull2 = this.f51677y0;
            if (chatFull2 != null && (this.J0 || chatFull2.linked_chat_id != 0)) {
                n8Var12.setVisibility(0);
                if (this.f51677y0.linked_chat_id == 0) {
                    this.K.u(org.telegram.messenger.hd.N0(2131751377, "Discussion"), org.telegram.messenger.hd.N0(2131751369, "DiscussionInfoShort"), false, 2131232114, true);
                } else {
                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f51677y0.linked_chat_id));
                    if (O02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = org.telegram.messenger.v3.K(O02, false);
                        if (TextUtils.isEmpty(K)) {
                            this.K.u(org.telegram.messenger.hd.N0(2131751377, "Discussion"), O02.title, false, 2131232114, true);
                        } else {
                            this.K.u(org.telegram.messenger.hd.N0(2131751377, "Discussion"), p5.c.k("@", K), false, 2131232114, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.v3.K(O02, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.n8 n8Var13 = this.K;
                            String N02 = org.telegram.messenger.hd.N0(2131748690, "LinkedChannel");
                            String str4 = O02.title;
                            org.telegram.ui.Cells.n8 n8Var14 = this.R;
                            if (n8Var14 != null && n8Var14.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            n8Var13.u(N02, str4, false, 2131232090, z26);
                        } else {
                            org.telegram.ui.Cells.n8 n8Var15 = this.K;
                            String N03 = org.telegram.messenger.hd.N0(2131748690, "LinkedChannel");
                            String k10 = p5.c.k("@", K2);
                            org.telegram.ui.Cells.n8 n8Var16 = this.R;
                            if (n8Var16 != null && n8Var16.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            n8Var15.u(N03, k10, false, 2131232090, z25);
                        }
                    }
                }
            } else {
                n8Var12.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.n8 n8Var17 = this.I;
        if (n8Var17 != null) {
            TLRPC.ChatFull chatFull3 = this.f51677y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                n8Var17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f51677y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.I.q(org.telegram.messenger.hd.N0(2131753958, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.I.q(org.telegram.messenger.hd.N0(2131753958, "AttachLocation"), "Unknown address", z11, true);
                }
            } else {
                n8Var17.setVisibility(8);
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.f51677y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t02) {
                    format = org.telegram.messenger.hd.N0(2131743684, "TypeLocationGroupEdit");
                } else {
                    format = String.format(a8.p0.s(new StringBuilder("https://"), getMessagesController().X2, "/%s"), org.telegram.messenger.v3.K(this.f51675x0, false));
                }
                String str5 = format;
                org.telegram.ui.Cells.n8 n8Var18 = this.J;
                String N04 = org.telegram.messenger.hd.N0(2131743685, "TypeLocationGroup");
                org.telegram.ui.Cells.n8 n8Var19 = this.O;
                if ((n8Var19 != null && n8Var19.getVisibility() == 0) || (((n8Var6 = this.K) != null && n8Var6.getVisibility() == 0) || ((n8Var7 = this.R) != null && n8Var7.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                n8Var18.u(N04, str5, false, 2131232090, z24);
            } else {
                boolean z27 = this.f51675x0.noforwards;
                if (this.J0) {
                    if (!t02) {
                        if (z27) {
                            i19 = 2131743676;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i19 = 2131743679;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i19 = 2131743675;
                        str3 = "TypePublic";
                    }
                    N0 = org.telegram.messenger.hd.N0(i19, str3);
                } else {
                    if (!t02) {
                        if (z27) {
                            i18 = 2131743677;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i18 = 2131743678;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i18 = 2131743674;
                        str2 = "TypePublicGroup";
                    }
                    N0 = org.telegram.messenger.hd.N0(i18, str2);
                }
                String str6 = N0;
                if (this.J0) {
                    org.telegram.ui.Cells.n8 n8Var20 = this.J;
                    String N05 = org.telegram.messenger.hd.N0(2131752264, "ChannelType");
                    org.telegram.ui.Cells.n8 n8Var21 = this.O;
                    if ((n8Var21 != null && n8Var21.getVisibility() == 0) || (((n8Var4 = this.K) != null && n8Var4.getVisibility() == 0) || ((n8Var5 = this.R) != null && n8Var5.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    n8Var20.u(N05, str6, false, 2131232090, z23);
                } else {
                    org.telegram.ui.Cells.n8 n8Var22 = this.J;
                    String N06 = org.telegram.messenger.hd.N0(2131749199, "GroupType");
                    org.telegram.ui.Cells.n8 n8Var23 = this.O;
                    if ((n8Var23 != null && n8Var23.getVisibility() == 0) || (((n8Var2 = this.K) != null && n8Var2.getVisibility() == 0) || ((n8Var3 = this.R) != null && n8Var3.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    n8Var22.u(N06, str6, false, 2131232177, z22);
                }
            }
        }
        if (this.O != null) {
            if (this.K0 && !this.F0) {
                i16 = 2131752220;
                str = "ChatHistoryHidden";
            } else {
                i16 = 2131752216;
                str = "ChatHistoryVisible";
            }
            String N07 = org.telegram.messenger.hd.N0(i16, str);
            org.telegram.ui.Cells.n8 n8Var24 = this.O;
            String N08 = org.telegram.messenger.hd.N0(2131752217, "ChatHistoryShort");
            if (this.R != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            n8Var24.u(N08, N07, z11, 2131232114, z20);
            this.O.setEnabled(!this.F0);
            if (!this.F0 && !t02 && (((chatFull = this.f51677y0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = 0.0f;
            if (this.O.getAlpha() <= 0.0f && !z21) {
                this.O.setVisibility(8);
                t0();
            } else {
                float f13 = 1.0f;
                if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    int i22 = 0;
                    boolean z28 = false;
                    while (i22 < this.G.getChildCount()) {
                        if (!z28 && this.G.getChildAt(i22) == this.O) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.G.getChildAt(i22));
                        }
                        i22++;
                        z28 = z28;
                    }
                    int i23 = 0;
                    boolean z29 = false;
                    while (i23 < this.f51674x.getChildCount()) {
                        if (!z29 && this.f51674x.getChildAt(i23) == this.G) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f51674x.getChildAt(i23));
                        }
                        i23++;
                        z29 = z29;
                    }
                    if (this.O.getVisibility() != 0) {
                        this.O.setAlpha(0.0f);
                        this.O.setTranslationY((-n8Var.getHeight()) / 2.0f);
                    }
                    this.O.setVisibility(0);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.O.getAlpha();
                        if (z21) {
                            f12 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f12);
                        this.T0 = ofFloat;
                        ofFloat.addUpdateListener(new ch.w(10, this, arrayList));
                        this.T0.addListener(new androidx.fragment.app.g(this, z21, arrayList, 7));
                        this.T0.setDuration(320L);
                        this.T0.setInterpolator(org.telegram.ui.Components.nr.h);
                        this.T0.start();
                    } else {
                        org.telegram.ui.Cells.n8 n8Var25 = this.O;
                        if (z21) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        n8Var25.setAlpha(f10);
                        org.telegram.ui.Cells.n8 n8Var26 = this.O;
                        float f14 = (-n8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f11 = 0.0f;
                        } else {
                            f11 = 1.0f;
                        }
                        n8Var26.setTranslationY(f14 * f11);
                        org.telegram.ui.Cells.n8 n8Var27 = this.O;
                        if (!z21) {
                            f13 = 0.0f;
                        }
                        n8Var27.setScaleY((f13 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.n8 n8Var28 = this.O;
                        if (z21) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        n8Var28.setVisibility(i17);
                        for (int i25 = 0; i25 < arrayList.size(); i25++) {
                            ((View) arrayList.get(i25)).setTranslationY(0.0f);
                        }
                        this.T0 = null;
                    }
                }
            }
        }
        if (this.U != null) {
            if (this.f51677y0 != null) {
                org.telegram.ui.Cells.n8 n8Var29 = this.V;
                if (n8Var29 != null) {
                    if (n8Var29.getParent() == null) {
                        i7 = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, c8.ma.o(-1, -2));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Cells.n8 n8Var30 = this.V;
                    if (this.f51677y0.requests_pending > 0) {
                        i15 = i7;
                    } else {
                        i15 = 8;
                    }
                    n8Var30.setVisibility(i15);
                } else {
                    i7 = 0;
                }
                if (this.J0 && !org.telegram.messenger.v3.Y(this.f51675x0)) {
                    org.telegram.ui.Cells.n8 n8Var31 = this.U;
                    String N09 = org.telegram.messenger.hd.N0(2131752277, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i7] = Integer.valueOf(this.f51677y0.participants_count);
                    n8Var31.u(N09, String.format("%d", objArr), false, 2131232177, true);
                    org.telegram.ui.Cells.n8 n8Var32 = this.Y;
                    CharSequence N010 = org.telegram.messenger.hd.N0(2131752441, null);
                    TLRPC.ChatFull chatFull5 = this.f51677y0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    org.telegram.ui.Cells.n8 n8Var33 = this.Z;
                    if (n8Var33 != null && n8Var33.getVisibility() == 0) {
                        z19 = 1;
                    } else {
                        z19 = i7;
                    }
                    n8Var32.u(N010, format2, false, 2131232417, z19);
                    z12 = z11;
                } else {
                    if (org.telegram.messenger.v3.T(this.f51675x0)) {
                        org.telegram.ui.Cells.n8 n8Var34 = this.U;
                        String N011 = org.telegram.messenger.hd.N0(2131752365, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(this.f51677y0.participants_count);
                        n8Var34.u(N011, String.format("%d", objArr3), false, 2131232177, true);
                    } else {
                        org.telegram.ui.Cells.n8 n8Var35 = this.U;
                        CharSequence N012 = org.telegram.messenger.hd.N0(2131752365, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i7] = Integer.valueOf(this.f51677y0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.V.getVisibility() == 0) {
                            z16 = 1;
                        } else {
                            z16 = i7;
                        }
                        n8Var35.u(N012, format3, false, 2131232177, z16);
                    }
                    TLRPC.Chat chat = this.f51675x0;
                    if (chat.gigagroup && !org.telegram.messenger.v3.Y(chat)) {
                        org.telegram.ui.Cells.n8 n8Var36 = this.Y;
                        CharSequence N013 = org.telegram.messenger.hd.N0(2131752441, null);
                        TLRPC.ChatFull chatFull6 = this.f51677y0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i7] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.n8 n8Var37 = this.Z;
                        if (n8Var37 != null && n8Var37.getVisibility() == 0) {
                            z18 = 1;
                        } else {
                            z18 = i7;
                        }
                        n8Var36.u(N013, format4, false, 2131232417, z18);
                        z12 = z11;
                    } else {
                        if (this.F0) {
                            i11 = 16;
                        } else {
                            i11 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f51675x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i12 = rq.s0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f51675x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i12++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i12++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i12++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i12++;
                            }
                            i13 = i11;
                        } else {
                            i12 = i11;
                            i13 = i12;
                        }
                        org.telegram.ui.Cells.n8 n8Var38 = this.Y;
                        String N014 = org.telegram.messenger.hd.N0(2131752321, null);
                        Integer valueOf = Integer.valueOf(i12);
                        Integer valueOf2 = Integer.valueOf(i13);
                        Object[] objArr6 = new Object[2];
                        objArr6[i7] = valueOf;
                        objArr6[1] = valueOf2;
                        n8Var38.u(N014, String.format("%d/%d", objArr6), z11, 2131232278, true);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.n8 n8Var39 = this.V;
                    if (n8Var39 != null) {
                        CharSequence N015 = org.telegram.messenger.hd.N0(2131748442, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i7] = Integer.valueOf(this.f51677y0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        org.telegram.ui.Cells.n8 n8Var40 = this.Z;
                        if (n8Var40 != null && n8Var40.getVisibility() == 0) {
                            z17 = 1;
                        } else {
                            z17 = i7;
                        }
                        n8Var39.u(N015, format5, false, 2131232342, z17);
                    }
                }
                org.telegram.ui.Cells.n8 n8Var41 = this.X;
                String N016 = org.telegram.messenger.hd.N0(2131752505, "ChannelAdministrators");
                if (org.telegram.messenger.v3.T(this.f51675x0)) {
                    i14 = this.f51677y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f51677y0;
                    if (chatFull7 == null) {
                        i14 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i27 = i7;
                        int i28 = i27;
                        while (i27 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.f51677y0.participants.participants.get(i27);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i28++;
                            }
                            i27++;
                        }
                        i14 = i28;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i7] = Integer.valueOf(i14);
                n8Var41.u(N016, String.format("%d", objArr8), false, 2131232051, true);
            } else {
                z12 = z11;
                i7 = 0;
                if (this.J0 && !org.telegram.messenger.v3.Y(this.f51675x0)) {
                    this.U.o(2131232177, org.telegram.messenger.hd.N0(2131752277, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.n8 n8Var42 = this.Y;
                    String N017 = org.telegram.messenger.hd.N0(2131752441, null);
                    org.telegram.ui.Cells.n8 n8Var43 = this.Z;
                    if (n8Var43 != null && n8Var43.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    n8Var42.o(2131232092, N017, z15);
                } else {
                    org.telegram.ui.Cells.n8 n8Var44 = this.U;
                    String N018 = org.telegram.messenger.hd.N0(2131752365, "ChannelMembers");
                    org.telegram.ui.Cells.n8 n8Var45 = this.Z;
                    if (n8Var45 != null && n8Var45.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n8Var44.o(2131232177, N018, z13);
                    if (this.f51675x0.gigagroup) {
                        org.telegram.ui.Cells.n8 n8Var46 = this.Y;
                        String N019 = org.telegram.messenger.hd.N0(2131752441, null);
                        org.telegram.ui.Cells.n8 n8Var47 = this.Z;
                        if (n8Var47 != null && n8Var47.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        n8Var46.o(2131232092, N019, z14);
                    } else {
                        this.Y.o(2131232278, org.telegram.messenger.hd.N0(2131752321, null), true);
                    }
                }
                this.X.o(2131232051, org.telegram.messenger.hd.N0(2131752505, "ChannelAdministrators"), true);
            }
            org.telegram.ui.Cells.n8 n8Var48 = this.P;
            if (org.telegram.messenger.v3.w(1, this.f51675x0)) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            n8Var48.setVisibility(i10);
            x0(z12);
            if (this.f51677y0 != null && org.telegram.messenger.v3.y(3, this.f51675x0) && (!t02 || !this.f51675x0.creator)) {
                if (this.f51677y0.invitesCount > 0) {
                    this.W.u(org.telegram.messenger.hd.N0(2131748947, "InviteLinks"), Integer.toString(this.f51677y0.invitesCount), false, 2131232206, true);
                } else {
                    this.W.u(org.telegram.messenger.hd.N0(2131748947, "InviteLinks"), "1", false, 2131232206, true);
                }
            } else {
                this.W.setVisibility(8);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10) {
        cx cxVar;
        xv xvVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i7 = 0;
            while (i7 < fragmentStack.size()) {
                if (fragmentStack.get(i7) instanceof bn) {
                    bn bnVar = (bn) fragmentStack.get(i7);
                    if (bnVar.getArguments().getLong("chat_id") == this.f51673w0) {
                        ((ActionBarLayout) getParentLayout()).d0(bnVar, false);
                        bnVar.clearViews();
                        if (((ActionBarLayout) getParentLayout()).c(i7, bnVar)) {
                            org.telegram.messenger.ls.e().j(bnVar.f46002da);
                        }
                        if (z10 && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f51673w0);
                            ((ActionBarLayout) getParentLayout()).c(i7, new y91(bundle));
                            i7++;
                        }
                    }
                } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof y91)) {
                    y91 y91Var = (y91) fragmentStack.get(i7);
                    if (y91Var.g() != null && y91Var.g().f28434id == this.f51673w0) {
                        ((ActionBarLayout) getParentLayout()).d0(y91Var, false);
                        i7--;
                    }
                } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof cx) && (cxVar = (cx) fragmentStack.get(i7)) != null && (xvVar = cxVar.H3) != null && xvVar.c()) {
                    cxVar.H3.a();
                }
                i7++;
            }
        }
    }

    public final void w0() {
        if (this.f51659l0 == null) {
            return;
        }
        if (this.D0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i10);
                i10++;
                if (tL_username.active) {
                    i7++;
                }
            }
            this.f51659l0.u(org.telegram.messenger.hd.N0(2131752992, null), org.telegram.messenger.hd.a0(null, null, 2131752991, Integer.valueOf(i7), Integer.valueOf(this.D0.usernames.size())), false, 2131232206, true);
            return;
        }
        this.f51659l0.u(org.telegram.messenger.hd.N0(2131752993, null), "t.me/" + this.D0.username, false, 2131232206, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull P0 = getMessagesController().P0(this.f51673w0);
        boolean V = org.telegram.messenger.v3.V(this.f51675x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i7 = 0;
                for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().f26847r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i7++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i7++;
                    }
                }
                if (V) {
                    if (P0 != null && P0.paid_reactions_available) {
                        i7++;
                    }
                    if (i7 == 0) {
                        str2 = org.telegram.messenger.hd.N0(2131746183, null);
                    } else {
                        str2 = String.valueOf(i7);
                    }
                } else {
                    int min = Math.min(getMediaDataController().f26839n.size(), i7);
                    if (min == 0) {
                        str2 = org.telegram.messenger.hd.N0(2131746183, null);
                    } else {
                        str2 = org.telegram.messenger.hd.a0(null, null, 2131746188, Integer.valueOf(min), Integer.valueOf(getMediaDataController().f26839n.size()));
                    }
                }
            } else {
                str2 = org.telegram.messenger.hd.N0(2131746190, null);
            }
        } else {
            String N0 = org.telegram.messenger.hd.N0(2131746183, null);
            if (P0 != null && P0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = N0;
                this.P.u(org.telegram.messenger.hd.N0(2131746191, null), str, z10, 2131232326, true);
            }
        }
        str = str2;
        this.P.u(org.telegram.messenger.hd.N0(2131746191, null), str, z10, 2131232326, true);
    }

    public final void y0(Long l10) {
        boolean z10;
        TLRPC.Chat chat = this.f51675x0;
        if (chat != null && this.L != null) {
            long j3 = 0;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = chat.broadcast_messages_allowed;
            }
            if (z10) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f51675x0.linked_monoforum_id));
                if (l10 != null) {
                    j3 = l10.longValue();
                } else if (O0 != null) {
                    j3 = O0.send_paid_messages_stars;
                }
                this.L.u(org.telegram.messenger.hd.N0(2131746902, null), di.pb.b1(false, org.telegram.messenger.hd.a0(null, null, 2131746874, Long.valueOf(j3)), 0.66f, null), false, 2131232218, true);
                return;
            }
            this.L.u(org.telegram.messenger.hd.N0(2131746902, null), org.telegram.messenger.hd.N0(2131746892, null), false, 2131232218, true);
        }
    }

    @Override
    public final void U() {
    }
}
