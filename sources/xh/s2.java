package xh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.x7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.z5;
import yh.j5;
import yh.k5;
public abstract class s2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final qp F;
    public final FrameLayout G;
    public int H;
    public b80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final u1 N;
    public final le.b O;
    public int P;
    public int Q;
    public x7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 f50225a;
    public final int f50226b;
    public final long f50227c;
    public final k5 d;
    public final j5 f50228e;
    public final d6 f50229f;
    public final x1 h;
    public final f91 f50230n;
    public final FrameLayout f50231r;
    public final SpannableStringBuilder f50232s;
    public final SpannableStringBuilder v;
    public final ci.d f50233w;
    public int f50234x;
    public final LinearLayout f50235y;

    public s2(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: xh.s2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, k5 k5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new ua(k5Var, i10, runnable, 20));
        f1Var.setOnLongClickListener(new cb(k5Var, i10, runnable));
    }

    public final void a() {
        k5 k5Var;
        o2 currentPage = getCurrentPage();
        if (currentPage != null && (k5Var = currentPage.f50155e) != null && currentPage.d) {
            int i10 = k5Var.d;
            new m4(this.f50225a, this.f50227c, i10, new ei.s4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        j5 j5Var = this.f50228e;
        if (!j5Var.h() || j5Var.d().size() >= MessagesController.getInstance(this.f50226b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f50226b;
        long j3 = this.f50227c;
        if (j3 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f50227c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f50235y;
        ci.d dVar = this.f50233w;
        long j3 = this.f50227c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j3) {
                if (d()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dVar.setVisibility(i13);
                if (d()) {
                    i15 = 0;
                }
                linearLayout.setVisibility(i15);
                this.f50234x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                f(true);
                n();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar.setVisibility(i12);
            if (d()) {
                i15 = 0;
            }
            linearLayout.setVisibility(i15);
            this.f50234x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M > 0) {
            ArrayList d = this.f50228e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.M) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i10 >= 0 && tL_starGiftCollection != null) {
                this.M = 0;
                this.f50230n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        x1 x1Var = this.h;
        if (x1Var != null && this.f50230n != null) {
            x1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        o2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f50157n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f50231r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.q.B(this.f50234x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f50234x));
        }
        return (int) (AndroidUtilities.dp(this.f50234x) - translationY);
    }

    public k5 getCurrentList() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f50155e;
        }
        return this.d;
    }

    public zl0 getCurrentListView() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f50156f;
        }
        return null;
    }

    public o2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (o2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        k5 k5Var;
        int i11;
        o2 currentPage = getCurrentPage();
        k5 k5Var2 = this.d;
        if (currentPage != null && (k5Var = currentPage.f50155e) != k5Var2) {
            if (k5Var != null && (i11 = k5Var.f51535n) > 0) {
                return i11;
            }
        } else if (k5Var2 != null && (i10 = k5Var2.f51535n) > 0) {
            return i10;
        }
        int i12 = this.f50226b;
        long j3 = this.f50227c;
        if (j3 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j3);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        k5 k5Var = this.d;
        if (k5Var != null && !k5Var.f51533l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < k5Var.f51533l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) k5Var.f51533l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f20048id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f20048id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        x1 x1Var = this.h;
        float f7 = 0.0f;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    f7 = (((o2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        f91 f91Var = this.f50230n;
        if (f91Var != null) {
            return f91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        w70 w70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        d6 d6Var = this.f50229f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        if (str != null) {
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        a2 a2Var = new a2(this, context, d6Var);
        a2Var.lineYFix = true;
        a2Var.setOnEditorActionListener(new b2(a2Var, callback, b2VarArr, view));
        MediaDataController.getInstance(this.f50226b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setTextColor(i6.v0(i6.f20930j5, d6Var));
        a2Var.setHintColor(i6.v0(i6.Xh, d6Var));
        a2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        a2Var.setFocusable(true);
        a2Var.setInputType(147457);
        a2Var.setLineColors(i6.v0(i6.f20951k6, d6Var), i6.v0(i6.f20969l6, d6Var), i6.v0(i6.f21044p7, d6Var));
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        a2Var.addTextChangedListener(new c2(a2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a2Var.setText(str);
        linearLayout.addView(a2Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20372a.f20414a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new rg.x(13, a2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new u2.l0(18));
        b2VarArr[0] = alertDialog$Builder.f20372a;
        b80 b80Var = this.I;
        if (b80Var != null && (w70Var = b80Var.f24839m) != null) {
            w70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f50225a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.u0(this, a2Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.s(3, a2Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f20428h0 = false;
        b2Var.d(-1);
        a2Var.setSelection(a2Var.getText().length());
    }

    public final void i() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        k5 k5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            j5 j5Var = this.f50228e;
            if (i11 < j5Var.d().size()) {
                if (i11 >= 0 && i11 < j5Var.d().size()) {
                    k5Var = j5Var.e(((TL_stars.TL_starGiftCollection) j5Var.d().get(i11)).collection_id);
                } else {
                    k5Var = null;
                }
                if (k5Var != null) {
                    return k5Var.f51533l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f7;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        vb vbVar;
        x1 x1Var = this.h;
        if (x1Var != null) {
            float f10 = 1.0f;
            if (x1Var.getCurrentPosition() == x1Var.getNextPosition()) {
                if (!k(x1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(x1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = x1Var.getCurrentPositionAlpha() * f7;
                if (!k(x1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((x1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f50231r;
            float B = nextPositionAlpha + org.telegram.messenger.q.B(this.f50234x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.b bVar = this.O;
            bVar.a(z10, true);
            float f11 = bVar.f15436e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.f50228e.h() && x1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f50232s;
            }
            this.f50233w.g(spannableStringBuilder, true, true);
            rc rcVar = rc.f30337w;
            if (rcVar != null && (vbVar = rcVar.f30341e) != null) {
                vbVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f50233w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = i6.Oh;
        d6 d6Var = this.f50229f;
        dVar.setBackground(i6.b0(dp, ((fs0) this).U.V0(i6.v0(i10, d6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o2 o2Var = (o2) view;
                    d6 d6Var2 = o2Var.f50154c;
                    if (o2Var.f50159s != null) {
                        o2Var.f50160w.setTextColor(i6.v0(i6.G6, d6Var2));
                        TextView textView = o2Var.f50161x;
                        int i11 = i6.Oh;
                        textView.setTextColor(i6.v0(i11, d6Var2));
                        o2Var.f50161x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, d6Var2)), 4, 4));
                    } else {
                        o2Var.F.setTextColor(i6.v0(i6.G6, d6Var2));
                        o2Var.G.setTextColor(i6.v0(i6.f21209y6, d6Var2));
                        o2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(i6.v0(i6.f20930j5, d6Var));
        this.f50235y.setBackground(i6.Y(i6.v0(i6.f20913i6, d6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.f50228e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        f91 f91Var = this.f50230n;
        if (f91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        f91Var.setTranslationY(min);
        f91Var.setScaleX(lerp);
        f91Var.setScaleY(lerp);
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    if (((o2) view).I) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f7 += f10;
                }
            }
        } else {
            f7 = 0.0f;
        }
        f91Var.setAlpha(w7.q.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f50226b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.f51536o = true;
            k5Var.a();
        }
        j5 j5Var = this.f50228e;
        if (j5Var != null) {
            j5Var.f51487j = true;
            j5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        o2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f50226b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.f51536o = false;
        }
        j5 j5Var = this.f50228e;
        if (j5Var != null) {
            j5Var.f51487j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.P != i10) {
            this.P = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        View[] viewPages;
        if (this.K != i10) {
            this.K = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof o2) {
                    o2 o2Var = (o2) view;
                    j2 j2Var = o2Var.f50156f;
                    int paddingTop = j2Var.getPaddingTop();
                    j2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(j2Var, new v1(o2Var, paddingTop - j2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            o2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f50230n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new r1(profileActivity, 0));
                }
            }
            if (!z10) {
                u1 u1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(u1Var);
                AndroidUtilities.runOnUIThread(u1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        x1 x1Var = this.h;
        if (x1Var != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
