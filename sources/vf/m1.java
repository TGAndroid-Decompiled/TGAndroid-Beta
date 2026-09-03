package vf;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import k7.c6;
import oh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.du;
import org.telegram.ui.n80;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.u9;
public final class m1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public static d2 h;
    public h61 f49168a;
    public final ArrayList f49169b;
    public NumberTextView f49170c;
    public org.telegram.ui.ActionBar.w0 d;
    public int f49171e;
    public boolean f49172f;

    public m1() {
        super(null);
        this.f49169b = new ArrayList();
        this.f49172f = true;
    }

    public static void U(m1 m1Var, int i10, ArrayList arrayList) {
        if (i10 == m1Var.f49171e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h51) arrayList.get(i11)).G instanceof o1) {
                    ((o1) ((h51) arrayList.get(i11)).G).f49198c = i11;
                }
            }
            p1 f10 = p1.f(m1Var.currentAccount);
            ArrayList arrayList2 = f10.f49208b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = yh.d(((o1) arrayList2.get(i12)).f49196a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new du(23));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((o1) arrayList2.get(i13)).f49196a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = yh.d(((o1) arrayList2.get(i14)).f49196a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f49207a).sendRequest(tL_messages_reorderQuickReplies, new p5(19));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void V(m1 m1Var, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h51 h51Var = new h51(2);
        h51Var.f27375l = string;
        h51Var.f27378o = string2;
        h51Var.f27376m = "RestrictedEmoji";
        h51Var.f27377n = "📝";
        arrayList.add(h51Var);
        w51Var.U();
        p1 f10 = p1.f(m1Var.currentAccount);
        ArrayList arrayList2 = f10.f49208b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((o1) arrayList2.get(i13)).f49197b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((o1) arrayList2.get(i13)).f49197b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f10.f49207a).quickRepliesLimit) {
            h51 c3 = h51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c3.f27380q = true;
            arrayList.add(c3);
        }
        m1Var.f49171e = w51Var.M();
        ArrayList arrayList3 = p1.f(m1Var.currentAccount).f49208b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            h51 h51Var2 = new h51(16);
            h51Var2.G = o1Var;
            h51Var2.K(m1Var.f49169b.contains(Integer.valueOf(o1Var.f49196a)));
            arrayList.add(h51Var2);
        }
        w51Var.L();
        w51Var.T();
        yh.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(m1 m1Var, h51 h51Var, View view) {
        if (h51Var.d == 1) {
            d0(m1Var.getParentActivity(), m1Var.currentAccount, null, null, m1Var.getResourceProvider(), new org.telegram.ui.web.d1(m1Var, 21));
        } else if (h51Var.f2505a == 16 && (h51Var.G instanceof o1)) {
            if (!m1Var.f49169b.isEmpty()) {
                m1Var.e0(h51Var, view);
                return;
            }
            o1 o1Var = (o1) h51Var.G;
            if (!o1Var.f49201g) {
                Bundle h9 = android.support.v4.media.a.h(5, "chatMode");
                h9.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                h9.putString("quick_reply", o1Var.f49197b);
                xn xnVar = new xn(h9);
                xnVar.nb(o1Var.f49196a);
                m1Var.presentFragment(xnVar);
            }
        }
    }

    public static void X(m1 m1Var) {
        m1Var.f49169b.clear();
        AndroidUtilities.forEachViews((RecyclerView) m1Var.f49168a, (h5.d) new ag.d(19));
        m1Var.actionBar.r();
        m1Var.f49168a.v1(false);
    }

    public static void d0(Activity activity, int i10, String str, o1 o1Var, g6 g6Var, Utilities.Callback callback) {
        View view;
        boolean z4;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        d2[] d2VarArr = new d2[1];
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (o1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        d2 d2Var = alertDialog$Builder2.f21168a;
        d2Var.O = string;
        final g1 g1Var = new g1(activity, g6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        g1Var.setTextSize(1, 18.0f);
        if (o1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = o1Var.f49197b;
        }
        g1Var.setText(charSequence);
        int i13 = k6.f21768j5;
        g1Var.setTextColor(k6.v0(i13, g6Var));
        g1Var.setHintColor(k6.v0(k6.Xh, g6Var));
        g1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        g1Var.setSingleLine(true);
        g1Var.setFocusable(true);
        g1Var.setLineColors(k6.v0(k6.f21787k6, g6Var), k6.v0(k6.f21805l6, g6Var), k6.v0(k6.f21878p7, g6Var));
        g1Var.setImeOptions(6);
        g1Var.setBackgroundDrawable(null);
        g1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        g1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout h9 = l.d.h(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.l(i13, g6Var, textView, 1, 16.0f);
        if (o1Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, c6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.l(k6.f21897q7, g6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, c6.e(-1, -2, 83));
        hg.c1 c1Var = new hg.c1(r15, new ValueAnimator[1], textView2, textView, 16);
        Runnable[] runnableArr = {new u9(c1Var, 24)};
        g1Var.addTextChangedListener(new i1(textView2, runnableArr));
        h9.addView(frameLayout, c6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        h9.addView(g1Var, c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(h9);
        d2Var.f21237a = AndroidUtilities.dp(292.0f);
        g1Var.setOnEditorActionListener(new j1(g1Var, i10, o1Var, textView2, c1Var, callback, d2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n80(g1Var, c1Var, i10, o1Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new sg.a(20));
        if (z4) {
            h = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new m(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            g1 g1Var2 = g1Var;
                            g1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var2);
                            return;
                        default:
                            g1 g1Var3 = g1Var;
                            g1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            d2Var.L = new org.telegram.ui.web.d1(g1Var, 22);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new fg.d0(g1Var, 12));
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            g1 g1Var2 = g1Var;
                            g1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var2);
                            return;
                        default:
                            g1 g1Var3 = g1Var;
                            g1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var3);
                            return;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[r32].f21245e0 = r32;
        g1Var.setSelection(g1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f49170c = numberTextView;
        numberTextView.setTextSize(18);
        this.f49170c.setTypeface(AndroidUtilities.bold());
        this.f49170c.setTextColor(k6.w0(null, k6.f22040y8, false));
        j10.addView(this.f49170c, c6.m(1.0f, 0, -1, 72, 0, 0));
        this.f49170c.setOnTouchListener(new s2(1));
        org.telegram.ui.ActionBar.w0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        z51 z51Var = new z51(context, null, 5);
        z51Var.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        h61 h61Var = new h61(this, new Utilities.Callback2(this) {
            public final m1 f49051b;

            {
                this.f49051b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        m1.V(this.f49051b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        m1.U(this.f49051b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new d1(this), new d1(this));
        this.f49168a = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.f49168a;
        h61Var2.V2.f32651r = false;
        h61Var2.A1(new Utilities.Callback2(this) {
            public final m1 f49051b;

            {
                this.f49051b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        m1.V(this.f49051b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        m1.U(this.f49051b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        z51Var.addView(this.f49168a, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49168a, true);
        this.fragmentView = z51Var;
        return z51Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h61 h61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (h61Var = this.f49168a) != null && (w51Var = h61Var.V2) != null) {
            w51Var.N(true);
        }
    }

    public final void e0(h51 h51Var, View view) {
        boolean z4;
        float f10;
        float f11;
        o1 o1Var = (o1) h51Var.G;
        l1 l1Var = (l1) view;
        Integer valueOf = Integer.valueOf(o1Var.f49196a);
        ArrayList arrayList = this.f49169b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(o1Var.f49196a));
        } else {
            arrayList.add(Integer.valueOf(o1Var.f49196a));
        }
        boolean z10 = true;
        this.f49168a.v1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(o1Var.f49196a));
        h51Var.f27369e = contains;
        l1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f49170c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            o1 c3 = p1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z4 = (c3 == null || p1.g(c3.f49197b)) ? false : false;
        }
        if (this.f49172f != z4) {
            this.f49172f = z4;
            ViewPropertyAnimator animate = this.d.animate();
            float f12 = 1.0f;
            if (this.f49172f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (this.f49172f) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!this.f49172f) {
                f12 = 0.7f;
            }
            org.telegram.ui.b.p(scaleX.scaleY(f12), pr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        p1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f49168a.setPadding(0, 0, 0, i13);
        this.f49168a.setClipToPadding(false);
    }
}
