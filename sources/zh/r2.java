package zh;

import a8.ee;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.p8;
import bi.pa;
import bi.q9;
import bi.t9;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zg1;
public abstract class r2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap V = new HashMap();
    public final TextView E;
    public final zp F;
    public final FrameLayout G;
    public int H;
    public k80 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public oi.q N;
    public boolean O;
    public int P;
    public final r1 Q;
    public final oe.b R;
    public int S;
    public int T;
    public final hh.c U;
    public final org.telegram.ui.ActionBar.r2 f53227a;
    public final int f53228b;
    public final long f53229c;
    public final t9 d;
    public final q9 e;
    public final u6 f53230f;
    public final v1 h;
    public final t91 f53231n;
    public final FrameLayout f53232r;
    public final SpannableStringBuilder f53233s;
    public final SpannableStringBuilder v;
    public final fi.d f53234w;
    public int f53235x;
    public final LinearLayout f53236y;

    public r2(int r28, long r29, android.content.Context r31, org.telegram.ui.ActionBar.r2 r32, org.telegram.ui.ActionBar.u6 r33) {
        throw new UnsupportedOperationException("Method not decompiled: zh.r2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.r2, org.telegram.ui.ActionBar.u6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, t9 t9Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new pa(t9Var, i10, runnable, 23));
        g1Var.setOnLongClickListener(new db(t9Var, i10, runnable));
    }

    public final void a() {
        t9 t9Var;
        m2 currentPage = getCurrentPage();
        if (currentPage != null && (t9Var = currentPage.e) != null && currentPage.d) {
            int i10 = t9Var.d;
            new l4(this.f53227a, this.f53229c, i10, new hi.p4(this, i10, currentPage, 6)).show();
        }
    }

    public final boolean b() {
        q9 q9Var = this.e;
        if (!q9Var.h() || q9Var.d().size() >= MessagesController.getInstance(this.f53228b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j10 = this.f53229c;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f53228b;
        if (i10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f53229c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f53236y;
        fi.d dVar = this.f53234w;
        long j10 = this.f53229c;
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
                this.f53235x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                o();
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
            this.f53235x = 60;
            setVisibleHeight(this.T);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.P > 0) {
            ArrayList d = this.e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.P) {
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
                this.P = 0;
                this.f53231n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        v1 v1Var = this.h;
        if (v1Var != null && this.f53231n != null) {
            v1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.O) {
            return true;
        }
        m2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f53232r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.t.C(this.f53235x, Math.max(AndroidUtilities.dp(240.0f), this.T) + (-frameLayout.getTop()), 1);
        if (this.T < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.T, AndroidUtilities.dp(this.f53235x));
        }
        return (int) (AndroidUtilities.dp(this.f53235x) - translationY);
    }

    public t9 getCurrentList() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public mm0 getCurrentListView() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f53143f;
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
        t9 t9Var;
        int i11;
        m2 currentPage = getCurrentPage();
        t9 t9Var2 = this.d;
        if (currentPage != null && (t9Var = currentPage.e) != t9Var2) {
            if (t9Var != null && (i11 = t9Var.f5473n) > 0) {
                return i11;
            }
        } else if (t9Var2 != null && (i10 = t9Var2.f5473n) > 0) {
            return i10;
        }
        long j10 = this.f53229c;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f53228b;
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
        t9 t9Var = this.d;
        if (t9Var != null && !t9Var.f5471l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < t9Var.f5471l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) t9Var.f5471l.get(i11)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f22033id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f22033id));
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
        t91 t91Var = this.f53231n;
        if (t91Var != null) {
            return t91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        f80 f80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        u6 u6Var = this.f53230f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        if (str != null) {
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        y1 y1Var = new y1(this, context, u6Var);
        y1Var.lineYFix = true;
        y1Var.setOnEditorActionListener(new z1(y1Var, callback, e2VarArr, view));
        MediaDataController.getInstance(this.f53228b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        y1Var.setTextSize(1, 18.0f);
        f7.V(y1Var, y6.f23462j5, u6Var);
        f7.m(y1Var, 34, y6.Xh, u6Var);
        y1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        y1Var.setFocusable(true);
        y1Var.setInputType(147457);
        f7.G(y1Var, y6.f23482k6, y6.f23500l6, y6.f23579p7, u6Var);
        y1Var.setImeOptions(6);
        y1Var.setBackgroundDrawable(null);
        y1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        y1Var.addTextChangedListener(new a2(y1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y1Var.setText(str);
        linearLayout.addView(y1Var, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.f22366a.f22553a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new zg1(28, y1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vg.d(18));
        e2VarArr[0] = alertDialog$Builder.f22366a;
        k80 k80Var = this.I;
        if (k80Var != null && (f80Var = k80Var.f29856m) != null) {
            f80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f53227a.getClassGuid());
        e2VarArr[0].setOnDismissListener(new hi.y0(this, y1Var, findActivity, 6));
        e2VarArr[0].setOnShowListener(new jg.s(y1Var, 3));
        e2VarArr[0].show();
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        e2Var.f22575j0 = false;
        e2Var.d(-1);
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
        t9 t9Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            q9 q9Var = this.e;
            if (i11 < q9Var.d().size()) {
                if (i11 >= 0 && i11 < q9Var.d().size()) {
                    t9Var = q9Var.e(((TL_stars.TL_starGiftCollection) q9Var.d().get(i11)).collection_id);
                } else {
                    t9Var = null;
                }
                if (t9Var != null) {
                    return t9Var.f5471l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f7;
        float f10;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        ub ubVar;
        v1 v1Var = this.h;
        if (v1Var != null) {
            if (v1Var.getCurrentPosition() == v1Var.getNextPosition()) {
                if (k(v1Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(v1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = v1Var.getCurrentPositionAlpha() * f7;
                if (k(v1Var.getNextPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (v1Var.getNextPositionAlpha() * f10) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f53232r;
            float C = org.telegram.messenger.t.C(this.f53235x, (-frameLayout.getTop()) + this.T, 1);
            float dp = ((AndroidUtilities.dp(68.0f) + 2) * nextPositionAlpha) + C;
            int i10 = 0;
            if (this.T > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            oe.b bVar = this.R;
            bVar.a(z10, true);
            float f11 = bVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + C, (AndroidUtilities.dp(16.0f) * nextPositionAlpha) + C, f11);
            float f12 = (1.0f - nextPositionAlpha) * f11;
            this.G.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + dp, dp, f11) - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.S);
            frameLayout.setAlpha(f12);
            if (f12 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && v1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f53233s;
            }
            this.f53234w.i(spannableStringBuilder, true, true);
            qc qcVar = qc.f31880x;
            if (qcVar != null && (ubVar = qcVar.e) != null) {
                ubVar.updatePosition();
            }
        }
    }

    public final void m() {
        fi.d dVar = this.f53234w;
        dVar.updateColors();
        int i10 = y6.Oh;
        u6 u6Var = this.f53230f;
        int b12 = ((vs0) this).W.b1(y6.w0(i10, u6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != b12) {
                y6.z1(b12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(y6.c0(AndroidUtilities.dp(19.0f), b12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m2 m2Var = (m2) view;
                    u6 u6Var2 = m2Var.f53142c;
                    if (m2Var.f53145r != null) {
                        m2Var.v.setTextColor(y6.w0(y6.G6, u6Var2));
                        m2Var.f53147w.setTextColor(y6.w0(y6.Oh, u6Var2));
                    } else {
                        m2Var.E.setTextColor(y6.w0(y6.G6, u6Var2));
                        m2Var.F.setTextColor(y6.w0(y6.f23746y6, u6Var2));
                        m2Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(y6.w0(y6.f23462j5, u6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof m2) {
                m2 m2Var = (m2) view;
                h2 h2Var = m2Var.f53143f;
                int paddingTop = h2Var.getPaddingTop();
                m2Var.g();
                int paddingTop2 = paddingTop - h2Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    AndroidUtilities.doOnLayout(h2Var, new q1(m2Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f53228b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.f5474o = true;
            t9Var.b();
        }
        q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.f5297j = true;
            q9Var.i();
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
        int i10 = this.f53228b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.f5474o = false;
        }
        q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.f5297j = false;
        }
    }

    public final void p() {
        float f7;
        View[] viewPages;
        float f10;
        t91 t91Var = this.f53231n;
        if (t91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        t91Var.setTranslationY(min);
        t91Var.setScaleX(lerp);
        t91Var.setScaleY(lerp);
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    if (((m2) view).H) {
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
        t91Var.setAlpha(ee.a(f7, 0.0f, 1.0f) * clamp01);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.S != i10) {
            this.S = i10;
            l();
        }
    }

    public void setGlassEngine(oi.q qVar) {
        View[] viewPages;
        this.N = qVar;
        v1 v1Var = this.h;
        qVar.c(v1Var);
        for (View view : v1Var.getViewPages()) {
            if (view instanceof m2) {
                qVar.b(((m2) view).f53143f);
            }
        }
    }

    public void setPaddingTop(int i10) {
        if (this.K != i10) {
            this.K = i10;
            n();
            p();
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
        if (this.O != z10) {
            this.O = z10;
            q(g());
            this.f53231n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.O4(false);
                    AndroidUtilities.runOnUIThread(new p8(profileActivity, 1));
                }
            }
            if (!z10) {
                r1 r1Var = this.Q;
                AndroidUtilities.cancelRunOnUIThread(r1Var);
                AndroidUtilities.runOnUIThread(r1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.T = i10;
        l();
        v1 v1Var = this.h;
        if (v1Var != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
