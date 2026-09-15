package xh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.z7;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import yh.m5;
import yh.n5;
public abstract class r2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final np F;
    public final FrameLayout G;
    public int H;
    public n70 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final t1 N;
    public final le.b O;
    public int P;
    public int Q;
    public z7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 f46105a;
    public final int f46106b;
    public final long f46107c;
    public final n5 d;
    public final m5 e;
    public final e6 f46108f;
    public final w1 h;
    public final h81 f46109n;
    public final FrameLayout f46110r;
    public final SpannableStringBuilder f46111s;
    public final SpannableStringBuilder v;
    public final ci.d f46112w;
    public int f46113x;
    public final LinearLayout f46114y;

    public r2(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.e6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: xh.r2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.e6):void");
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, n5 n5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new va(n5Var, i10, runnable, 20));
        f1Var.setOnLongClickListener(new db(n5Var, i10, runnable));
    }

    public final void a() {
        n5 n5Var;
        n2 currentPage = getCurrentPage();
        if (currentPage != null && (n5Var = currentPage.e) != null && currentPage.d) {
            int i10 = n5Var.d;
            new l4(this.f46105a, this.f46107c, i10, new ei.r4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        m5 m5Var = this.e;
        if (!m5Var.h() || m5Var.d().size() >= MessagesController.getInstance(this.f46106b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f46106b;
        long j3 = this.f46107c;
        if (j3 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f46107c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f46114y;
        ci.d dVar = this.f46112w;
        long j3 = this.f46107c;
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
                this.f46113x = 60;
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
            this.f46113x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M > 0) {
            ArrayList d = this.e.d();
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
                this.f46109n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        w1 w1Var = this.h;
        if (w1Var != null && this.f46109n != null) {
            w1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        n2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f46038n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f46110r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.w1.B(this.f46113x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f46113x));
        }
        return (int) (AndroidUtilities.dp(this.f46113x) - translationY);
    }

    public n5 getCurrentList() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public ll0 getCurrentListView() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f46037f;
        }
        return null;
    }

    public n2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        n5 n5Var;
        int i11;
        n2 currentPage = getCurrentPage();
        n5 n5Var2 = this.d;
        if (currentPage != null && (n5Var = currentPage.e) != n5Var2) {
            if (n5Var != null && (i11 = n5Var.f47500n) > 0) {
                return i11;
            }
        } else if (n5Var2 != null && (i10 = n5Var2.f47500n) > 0) {
            return i10;
        }
        int i12 = this.f46106b;
        long j3 = this.f46107c;
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
        n5 n5Var = this.d;
        if (n5Var != null && !n5Var.f47498l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < n5Var.f47498l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) n5Var.f47498l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f18118id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f18118id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        w1 w1Var = this.h;
        float f7 = 0.0f;
        if (w1Var.getViewPages() != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    f7 = (((n2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        h81 h81Var = this.f46109n;
        if (h81Var != null) {
            return h81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        i70 i70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        e6 e6Var = this.f46108f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str != null) {
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        z1 z1Var = new z1(this, context, e6Var);
        z1Var.lineYFix = true;
        z1Var.setOnEditorActionListener(new a2(z1Var, callback, b2VarArr, view));
        MediaDataController.getInstance(this.f46106b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        z1Var.setTextSize(1, 18.0f);
        z1Var.setTextColor(i6.v0(i6.f18943j5, e6Var));
        z1Var.setHintColor(i6.v0(i6.Xh, e6Var));
        z1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        z1Var.setFocusable(true);
        z1Var.setInputType(147457);
        z1Var.setLineColors(i6.v0(i6.f18964k6, e6Var), i6.v0(i6.f18982l6, e6Var), i6.v0(i6.f19056p7, e6Var));
        z1Var.setImeOptions(6);
        z1Var.setBackgroundDrawable(null);
        z1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        z1Var.addTextChangedListener(new b2(z1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        z1Var.setText(str);
        linearLayout.addView(z1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f18437a.f18461a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new tg.d(10, z1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(26));
        b2VarArr[0] = alertDialog$Builder.f18437a;
        n70 n70Var = this.I;
        if (n70Var != null && (i70Var = n70Var.f26358m) != null) {
            i70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f46105a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.t0(this, z1Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.r(3, z1Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f18474h0 = false;
        b2Var.d(-1);
        z1Var.setSelection(z1Var.getText().length());
    }

    public final void i() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        n5 n5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            m5 m5Var = this.e;
            if (i11 < m5Var.d().size()) {
                if (i11 >= 0 && i11 < m5Var.d().size()) {
                    n5Var = m5Var.e(((TL_stars.TL_starGiftCollection) m5Var.d().get(i11)).collection_id);
                } else {
                    n5Var = null;
                }
                if (n5Var != null) {
                    return n5Var.f47498l.isEmpty();
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
        sb sbVar;
        w1 w1Var = this.h;
        if (w1Var != null) {
            float f10 = 1.0f;
            if (w1Var.getCurrentPosition() == w1Var.getNextPosition()) {
                if (!k(w1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(w1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = w1Var.getCurrentPositionAlpha() * f7;
                if (!k(w1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((w1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f46110r;
            float B = nextPositionAlpha + org.telegram.messenger.w1.B(this.f46113x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.b bVar = this.O;
            bVar.a(z10, true);
            float f11 = bVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && w1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f46111s;
            }
            this.f46112w.g(spannableStringBuilder, true, true);
            oc ocVar = oc.f26747w;
            if (ocVar != null && (sbVar = ocVar.e) != null) {
                sbVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f46112w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = i6.Oh;
        e6 e6Var = this.f46108f;
        dVar.setBackground(i6.b0(dp, ((nr0) this).U.V0(i6.v0(i10, e6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n2 n2Var = (n2) view;
                    e6 e6Var2 = n2Var.f46036c;
                    if (n2Var.f46040s != null) {
                        n2Var.f46041w.setTextColor(i6.v0(i6.G6, e6Var2));
                        TextView textView = n2Var.f46042x;
                        int i11 = i6.Oh;
                        textView.setTextColor(i6.v0(i11, e6Var2));
                        n2Var.f46042x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, e6Var2)), 4, 4));
                    } else {
                        n2Var.F.setTextColor(i6.v0(i6.G6, e6Var2));
                        n2Var.G.setTextColor(i6.v0(i6.f19218y6, e6Var2));
                        n2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(i6.v0(i6.f18943j5, e6Var));
        this.f46114y.setBackground(i6.Y(i6.v0(i6.f18926i6, e6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        w1 w1Var = this.h;
        if (w1Var.getViewPages() != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    ((n2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        h81 h81Var = this.f46109n;
        if (h81Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        h81Var.setTranslationY(min);
        h81Var.setScaleX(lerp);
        h81Var.setScaleY(lerp);
        w1 w1Var = this.h;
        if (w1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    if (((n2) view).I) {
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
        h81Var.setAlpha(w7.p.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f46106b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        n5 n5Var = this.d;
        if (n5Var != null) {
            n5Var.f47501o = true;
            n5Var.a();
        }
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.f47463j = true;
            m5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f46106b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        n5 n5Var = this.d;
        if (n5Var != null) {
            n5Var.f47501o = false;
        }
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.f47463j = false;
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
                if (view instanceof n2) {
                    n2 n2Var = (n2) view;
                    i2 i2Var = n2Var.f46037f;
                    int paddingTop = i2Var.getPaddingTop();
                    i2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(i2Var, new u1(n2Var, paddingTop - i2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            n2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f46109n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new r1(profileActivity, 0));
                }
            }
            if (!z10) {
                t1 t1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(t1Var);
                AndroidUtilities.runOnUIThread(t1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        w1 w1Var = this.h;
        if (w1Var != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    ((n2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
