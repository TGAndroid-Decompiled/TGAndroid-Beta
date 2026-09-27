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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.y5;
import yh.j5;
import yh.k5;
public abstract class t2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final pp F;
    public final FrameLayout G;
    public int H;
    public a80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final v1 N;
    public final le.c O;
    public int P;
    public int Q;
    public x7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.o2 f46469a;
    public final int f46470b;
    public final long f46471c;
    public final k5 d;
    public final j5 e;
    public final e6 f46472f;
    public final y1 h;
    public final x81 f46473n;
    public final FrameLayout f46474r;
    public final SpannableStringBuilder f46475s;
    public final SpannableStringBuilder v;
    public final ci.d f46476w;
    public int f46477x;
    public final LinearLayout f46478y;

    public t2(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.e6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: xh.t2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.e6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, k5 k5Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new ua(k5Var, i10, runnable, 20));
        g1Var.setOnLongClickListener(new cb(k5Var, i10, runnable));
    }

    public final void a() {
        k5 k5Var;
        p2 currentPage = getCurrentPage();
        if (currentPage != null && (k5Var = currentPage.e) != null && currentPage.d) {
            int i10 = k5Var.d;
            new n4(this.f46469a, this.f46471c, i10, new ei.r4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        j5 j5Var = this.e;
        if (!j5Var.h() || j5Var.d().size() >= MessagesController.getInstance(this.f46470b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f46470b;
        long j3 = this.f46471c;
        if (j3 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f46471c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f46478y;
        ci.d dVar = this.f46476w;
        long j3 = this.f46471c;
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
                this.f46477x = 60;
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
            this.f46477x = 60;
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
                this.f46473n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        y1 y1Var = this.h;
        if (y1Var != null && this.f46473n != null) {
            y1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        p2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f46409n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f46474r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.l0.B(this.f46477x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f46477x));
        }
        return (int) (AndroidUtilities.dp(this.f46477x) - translationY);
    }

    public k5 getCurrentList() {
        p2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public yl0 getCurrentListView() {
        p2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f46408f;
        }
        return null;
    }

    public p2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (p2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        k5 k5Var;
        int i11;
        p2 currentPage = getCurrentPage();
        k5 k5Var2 = this.d;
        if (currentPage != null && (k5Var = currentPage.e) != k5Var2) {
            if (k5Var != null && (i11 = k5Var.f47668n) > 0) {
                return i11;
            }
        } else if (k5Var2 != null && (i10 = k5Var2.f47668n) > 0) {
            return i10;
        }
        int i12 = this.f46470b;
        long j3 = this.f46471c;
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
        if (k5Var != null && !k5Var.f47666l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < k5Var.f47666l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) k5Var.f47666l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f18335id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f18335id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        y1 y1Var = this.h;
        float f7 = 0.0f;
        if (y1Var.getViewPages() != null) {
            for (View view : y1Var.getViewPages()) {
                if (view instanceof p2) {
                    f7 = (((p2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        x81 x81Var = this.f46473n;
        if (x81Var != null) {
            return x81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        v70 v70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        e6 e6Var = this.f46472f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str != null) {
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        b2 b2Var = new b2(this, context, e6Var);
        b2Var.lineYFix = true;
        b2Var.setOnEditorActionListener(new c2(b2Var, callback, c2VarArr, view));
        MediaDataController.getInstance(this.f46470b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        b2Var.setTextSize(1, 18.0f);
        b2Var.setTextColor(i6.v0(i6.f19164j5, e6Var));
        b2Var.setHintColor(i6.v0(i6.Xh, e6Var));
        b2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        b2Var.setFocusable(true);
        b2Var.setInputType(147457);
        b2Var.setLineColors(i6.v0(i6.f19185k6, e6Var), i6.v0(i6.f19203l6, e6Var), i6.v0(i6.f19278p7, e6Var));
        b2Var.setImeOptions(6);
        b2Var.setBackgroundDrawable(null);
        b2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b2Var.addTextChangedListener(new d2(b2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        b2Var.setText(str);
        linearLayout.addView(b2Var, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f18655a.f18717a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new s5.e(12, b2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new u2.x0(17));
        c2VarArr[0] = alertDialog$Builder.f18655a;
        a80 a80Var = this.I;
        if (a80Var != null && (v70Var = a80Var.f22596m) != null) {
            v70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f46469a.getClassGuid());
        c2VarArr[0].setOnDismissListener(new ei.t0(this, b2Var, findActivity, 6));
        c2VarArr[0].setOnShowListener(new hg.r(3, b2Var));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.f18730h0 = false;
        c2Var.d(-1);
        b2Var.setSelection(b2Var.getText().length());
    }

    public final void i() {
        p2 currentPage = getCurrentPage();
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
            j5 j5Var = this.e;
            if (i11 < j5Var.d().size()) {
                if (i11 >= 0 && i11 < j5Var.d().size()) {
                    k5Var = j5Var.e(((TL_stars.TL_starGiftCollection) j5Var.d().get(i11)).collection_id);
                } else {
                    k5Var = null;
                }
                if (k5Var != null) {
                    return k5Var.f47666l.isEmpty();
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
        ub ubVar;
        y1 y1Var = this.h;
        if (y1Var != null) {
            float f10 = 1.0f;
            if (y1Var.getCurrentPosition() == y1Var.getNextPosition()) {
                if (!k(y1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(y1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = y1Var.getCurrentPositionAlpha() * f7;
                if (!k(y1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((y1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f46474r;
            float B = nextPositionAlpha + org.telegram.messenger.l0.B(this.f46477x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.c cVar = this.O;
            cVar.a(z10, true);
            float f11 = cVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && y1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f46475s;
            }
            this.f46476w.g(spannableStringBuilder, true, true);
            qc qcVar = qc.f27684w;
            if (qcVar != null && (ubVar = qcVar.e) != null) {
                ubVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f46476w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = i6.Oh;
        e6 e6Var = this.f46472f;
        dVar.setBackground(i6.b0(dp, ((bs0) this).U.V0(i6.v0(i10, e6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    p2 p2Var = (p2) view;
                    e6 e6Var2 = p2Var.f46407c;
                    if (p2Var.f46411s != null) {
                        p2Var.f46412w.setTextColor(i6.v0(i6.G6, e6Var2));
                        TextView textView = p2Var.f46413x;
                        int i11 = i6.Oh;
                        textView.setTextColor(i6.v0(i11, e6Var2));
                        p2Var.f46413x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, e6Var2)), 4, 4));
                    } else {
                        p2Var.F.setTextColor(i6.v0(i6.G6, e6Var2));
                        p2Var.G.setTextColor(i6.v0(i6.f19442y6, e6Var2));
                        p2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(i6.v0(i6.f19164j5, e6Var));
        this.f46478y.setBackground(i6.Y(i6.v0(i6.f19147i6, e6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        y1 y1Var = this.h;
        if (y1Var.getViewPages() != null) {
            for (View view : y1Var.getViewPages()) {
                if (view instanceof p2) {
                    ((p2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        x81 x81Var = this.f46473n;
        if (x81Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        x81Var.setTranslationY(min);
        x81Var.setScaleX(lerp);
        x81Var.setScaleY(lerp);
        y1 y1Var = this.h;
        if (y1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : y1Var.getViewPages()) {
                if (view instanceof p2) {
                    if (((p2) view).I) {
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
        x81Var.setAlpha(w7.q.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f46470b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        p2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.f47669o = true;
            k5Var.a();
        }
        j5 j5Var = this.e;
        if (j5Var != null) {
            j5Var.f47626j = true;
            j5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        p2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f46470b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.f47669o = false;
        }
        j5 j5Var = this.e;
        if (j5Var != null) {
            j5Var.f47626j = false;
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
                if (view instanceof p2) {
                    p2 p2Var = (p2) view;
                    k2 k2Var = p2Var.f46408f;
                    int paddingTop = k2Var.getPaddingTop();
                    k2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(k2Var, new w1(p2Var, paddingTop - k2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        p2 currentPage = getCurrentPage();
        if (currentPage != null) {
            p2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f46473n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new s1(profileActivity, 0));
                }
            }
            if (!z10) {
                v1 v1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(v1Var);
                AndroidUtilities.runOnUIThread(v1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        y1 y1Var = this.h;
        if (y1Var != null) {
            for (View view : y1Var.getViewPages()) {
                if (view instanceof p2) {
                    ((p2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
