package yh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.v7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.z5;
import zh.e5;
import zh.f5;
public abstract class q2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final aq F;
    public final FrameLayout G;
    public int H;
    public l80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final s1 N;
    public final ne.b O;
    public int P;
    public int Q;
    public v7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.m2 f49088a;
    public final int f49089b;
    public final long f49090c;
    public final f5 d;
    public final e5 e;
    public final c6 f49091f;
    public final v1 h;
    public final k91 f49092n;
    public final FrameLayout f49093r;
    public final SpannableStringBuilder f49094s;
    public final SpannableStringBuilder v;
    public final di.d f49095w;
    public int f49096x;
    public final LinearLayout f49097y;

    public q2(int r28, long r29, android.content.Context r31, org.telegram.ui.ActionBar.m2 r32, org.telegram.ui.ActionBar.c6 r33) {
        throw new UnsupportedOperationException("Method not decompiled: yh.q2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void j(org.telegram.ui.ActionBar.e1 e1Var, f5 f5Var, Runnable runnable, int i10) {
        e1Var.setOnClickListener(new sa(f5Var, i10, runnable, 22));
        e1Var.setOnLongClickListener(new ab(f5Var, i10, runnable));
    }

    public final void a() {
        f5 f5Var;
        m2 currentPage = getCurrentPage();
        if (currentPage != null && (f5Var = currentPage.e) != null && currentPage.d) {
            int i10 = f5Var.d;
            new k4(this.f49088a, this.f49090c, i10, new fi.r4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        e5 e5Var = this.e;
        if (!e5Var.h() || e5Var.d().size() >= MessagesController.getInstance(this.f49089b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j10 = this.f49090c;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f49089b;
        if (i10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f49090c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f49097y;
        di.d dVar = this.f49095w;
        long j10 = this.f49090c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j10) {
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
                this.f49096x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
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
            this.f49096x = 60;
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
                this.f49092n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        v1 v1Var = this.h;
        if (v1Var != null && this.f49092n != null) {
            v1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        m2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f48997n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f49093r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.g0.B(this.f49096x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f49096x));
        }
        return (int) (AndroidUtilities.dp(this.f49096x) - translationY);
    }

    public f5 getCurrentList() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public mm0 getCurrentListView() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f48996f;
        }
        return null;
    }

    public m2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (m2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        f5 f5Var;
        int i11;
        m2 currentPage = getCurrentPage();
        f5 f5Var2 = this.d;
        if (currentPage != null && (f5Var = currentPage.e) != f5Var2) {
            if (f5Var != null && (i11 = f5Var.f50512n) > 0) {
                return i11;
            }
        } else if (f5Var2 != null && (i10 = f5Var2.f50512n) > 0) {
            return i10;
        }
        long j10 = this.f49090c;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f49089b;
        if (i12 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i13).getUserFull(j10);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(-j10);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        f5 f5Var = this.d;
        if (f5Var != null && !f5Var.f50510l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < f5Var.f50510l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) f5Var.f50510l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f18922id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f18922id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        v1 v1Var = this.h;
        float f7 = 0.0f;
        if (v1Var.getViewPages() != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    f7 = (((m2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        k91 k91Var = this.f49092n;
        if (k91Var != null) {
            return k91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        g80 g80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        c6 c6Var = this.f49091f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        y1 y1Var = new y1(this, context, c6Var);
        y1Var.lineYFix = true;
        y1Var.setOnEditorActionListener(new z1(y1Var, callback, a2VarArr, view));
        MediaDataController.getInstance(this.f49089b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        y1Var.setTextSize(1, 18.0f);
        y1Var.setTextColor(g6.w0(g6.f19707j5, c6Var));
        y1Var.setHintColor(g6.w0(g6.Xh, c6Var));
        y1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        y1Var.setFocusable(true);
        y1Var.setInputType(147457);
        y1Var.setLineColors(g6.w0(g6.f19728k6, c6Var), g6.w0(g6.f19745l6, c6Var), g6.w0(g6.f19822p7, c6Var));
        y1Var.setImeOptions(6);
        y1Var.setBackgroundDrawable(null);
        y1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        y1Var.addTextChangedListener(new a2(y1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y1Var.setText(str);
        linearLayout.addView(y1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f19248a.f19257a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new org.telegram.ui.web.o0(20, y1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(28));
        a2VarArr[0] = alertDialog$Builder.f19248a;
        l80 l80Var = this.I;
        if (l80Var != null && (g80Var = l80Var.f26658m) != null) {
            g80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f49088a.getClassGuid());
        a2VarArr[0].setOnDismissListener(new fi.s0(this, y1Var, findActivity, 6));
        a2VarArr[0].setOnShowListener(new ig.r(3, y1Var));
        a2VarArr[0].show();
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        a2Var.f19270h0 = false;
        a2Var.d(-1);
        y1Var.setSelection(y1Var.getText().length());
    }

    public final void i() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        f5 f5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            e5 e5Var = this.e;
            if (i11 < e5Var.d().size()) {
                if (i11 >= 0 && i11 < e5Var.d().size()) {
                    f5Var = e5Var.e(((TL_stars.TL_starGiftCollection) e5Var.d().get(i11)).collection_id);
                } else {
                    f5Var = null;
                }
                if (f5Var != null) {
                    return f5Var.f50510l.isEmpty();
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
        wb wbVar;
        v1 v1Var = this.h;
        if (v1Var != null) {
            float f10 = 1.0f;
            if (v1Var.getCurrentPosition() == v1Var.getNextPosition()) {
                if (!k(v1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(v1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = v1Var.getCurrentPositionAlpha() * f7;
                if (!k(v1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((v1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f49093r;
            float B = nextPositionAlpha + org.telegram.messenger.g0.B(this.f49096x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            ne.b bVar = this.O;
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
            if (this.e.h() && v1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f49094s;
            }
            this.f49095w.g(spannableStringBuilder, true, true);
            sc scVar = sc.f28798w;
            if (scVar != null && (wbVar = scVar.e) != null) {
                wbVar.updatePosition();
            }
        }
    }

    public final void m() {
        di.d dVar = this.f49095w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = g6.Oh;
        c6 c6Var = this.f49091f;
        dVar.setBackground(g6.c0(dp, ((ns0) this).U.W0(g6.w0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m2 m2Var = (m2) view;
                    c6 c6Var2 = m2Var.f48995c;
                    if (m2Var.f48999s != null) {
                        m2Var.f49000w.setTextColor(g6.w0(g6.G6, c6Var2));
                        TextView textView = m2Var.f49001x;
                        int i11 = g6.Oh;
                        textView.setTextColor(g6.w0(i11, c6Var2));
                        m2Var.f49001x.setBackground(g6.Z(g6.m1(0.1f, g6.w0(i11, c6Var2)), 4, 4));
                    } else {
                        m2Var.F.setTextColor(g6.w0(g6.G6, c6Var2));
                        m2Var.G.setTextColor(g6.w0(g6.f19988y6, c6Var2));
                        m2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(g6.w0(g6.f19707j5, c6Var));
        this.f49097y.setBackground(g6.Z(g6.w0(g6.f19690i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        k91 k91Var = this.f49092n;
        if (k91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        k91Var.setTranslationY(min);
        k91Var.setScaleX(lerp);
        k91Var.setScaleY(lerp);
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    if (((m2) view).I) {
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
        k91Var.setAlpha(w7.r.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f49089b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.f50513o = true;
            f5Var.a();
        }
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.f50447j = true;
            e5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        m2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f49089b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.f50513o = false;
        }
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.f50447j = false;
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
                if (view instanceof m2) {
                    m2 m2Var = (m2) view;
                    h2 h2Var = m2Var.f48996f;
                    int paddingTop = h2Var.getPaddingTop();
                    h2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h2Var, new t1(m2Var, paddingTop - h2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            m2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f49092n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new q1(profileActivity, 0));
                }
            }
            if (!z10) {
                s1 s1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(s1Var);
                AndroidUtilities.runOnUIThread(s1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        v1 v1Var = this.h;
        if (v1Var != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
