package uf;

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
import k7.b6;
import nh.p5;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.eu;
import org.telegram.ui.o80;
import org.telegram.ui.zn;
import ph.ga;
public final class m1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public static d2 h;
    public g61 f45447a;
    public final ArrayList f45448b;
    public NumberTextView f45449c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f45450f;

    public m1() {
        super(null);
        this.f45448b = new ArrayList();
        this.f45450f = true;
    }

    public static void U(m1 m1Var, int i10, ArrayList arrayList) {
        if (i10 == m1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((i51) arrayList.get(i11)).G instanceof o1) {
                    ((o1) ((i51) arrayList.get(i11)).G).f45473c = i11;
                }
            }
            p1 f10 = p1.f(m1Var.currentAccount);
            ArrayList arrayList2 = f10.f45482b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = ai.d(((o1) arrayList2.get(i12)).f45471a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new eu(23));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((o1) arrayList2.get(i13)).f45471a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = ai.d(((o1) arrayList2.get(i14)).f45471a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f45481a).sendRequest(tL_messages_reorderQuickReplies, new p5(19));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void V(m1 m1Var, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        i51 i51Var = new i51(2);
        i51Var.f25585l = string;
        i51Var.f25588o = string2;
        i51Var.f25586m = "RestrictedEmoji";
        i51Var.f25587n = "📝";
        arrayList.add(i51Var);
        w51Var.U();
        p1 f10 = p1.f(m1Var.currentAccount);
        ArrayList arrayList2 = f10.f45482b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((o1) arrayList2.get(i13)).f45472b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((o1) arrayList2.get(i13)).f45472b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f10.f45481a).quickRepliesLimit) {
            i51 c3 = i51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c3.f25590q = true;
            arrayList.add(c3);
        }
        m1Var.e = w51Var.M();
        ArrayList arrayList3 = p1.f(m1Var.currentAccount).f45482b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            i51 i51Var2 = new i51(16);
            i51Var2.G = o1Var;
            i51Var2.K(m1Var.f45448b.contains(Integer.valueOf(o1Var.f45471a)));
            arrayList.add(i51Var2);
        }
        w51Var.L();
        w51Var.T();
        ai.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(m1 m1Var, i51 i51Var, View view) {
        if (i51Var.d == 1) {
            d0(m1Var.getParentActivity(), m1Var.currentAccount, null, null, m1Var.getResourceProvider(), new org.telegram.ui.web.a1(m1Var, 21));
        } else if (i51Var.f1830a == 16 && (i51Var.G instanceof o1)) {
            if (!m1Var.f45448b.isEmpty()) {
                m1Var.e0(i51Var, view);
                return;
            }
            o1 o1Var = (o1) i51Var.G;
            if (!o1Var.f45475g) {
                Bundle h9 = android.support.v4.media.a.h(5, "chatMode");
                h9.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                h9.putString("quick_reply", o1Var.f45472b);
                zn znVar = new zn(h9);
                znVar.nb(o1Var.f45471a);
                m1Var.presentFragment(znVar);
            }
        }
    }

    public static void X(m1 m1Var) {
        m1Var.f45448b.clear();
        AndroidUtilities.forEachViews((RecyclerView) m1Var.f45447a, (h5.d) new nh.e(18));
        m1Var.actionBar.r();
        m1Var.f45447a.v1(false);
    }

    public static void d0(Activity activity, int i10, String str, o1 o1Var, f6 f6Var, Utilities.Callback callback) {
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
        if (R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        d2[] d2VarArr = new d2[1];
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (o1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        d2 d2Var = alertDialog$Builder2.f19478a;
        d2Var.O = string;
        final g1 g1Var = new g1(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        g1Var.setTextSize(1, 18.0f);
        if (o1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = o1Var.f45472b;
        }
        g1Var.setText(charSequence);
        int i13 = j6.f19987j5;
        g1Var.setTextColor(j6.v0(i13, f6Var));
        g1Var.setHintColor(j6.v0(j6.Xh, f6Var));
        g1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        g1Var.setSingleLine(true);
        g1Var.setFocusable(true);
        g1Var.setLineColors(j6.v0(j6.f20006k6, f6Var), j6.v0(j6.f20024l6, f6Var), j6.v0(j6.f20097p7, f6Var));
        g1Var.setImeOptions(6);
        g1Var.setBackgroundDrawable(null);
        g1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        g1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout h9 = kf.k0.h(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.l(i13, f6Var, textView, 1, 16.0f);
        if (o1Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, b6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.l(j6.f20116q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, b6.e(-1, -2, 83));
        gg.c1 c1Var = new gg.c1(r15, new ValueAnimator[1], textView2, textView, 17);
        Runnable[] runnableArr = {new ga(c1Var, 23)};
        g1Var.addTextChangedListener(new i1(textView2, runnableArr));
        h9.addView(frameLayout, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        h9.addView(g1Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(h9);
        d2Var.f19559a = AndroidUtilities.dp(292.0f);
        g1Var.setOnEditorActionListener(new j1(g1Var, i10, o1Var, textView2, c1Var, callback, d2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new o80(g1Var, c1Var, i10, o1Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new s0.b(14));
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
            d2Var.L = new org.telegram.ui.web.a1(g1Var, 22);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new eg.d0(g1Var, 12));
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
        d2VarArr[r32].f19566e0 = r32;
        g1Var.setSelection(g1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f45449c = numberTextView;
        numberTextView.setTextSize(18);
        this.f45449c.setTypeface(AndroidUtilities.bold());
        this.f45449c.setTextColor(j6.w0(null, j6.f20258y8, false));
        j10.addView(this.f45449c, b6.m(1.0f, 0, -1, 72, 0, 0));
        this.f45449c.setOnTouchListener(new oh.d(2));
        org.telegram.ui.ActionBar.w0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        z51 z51Var = new z51(context, null, 5);
        z51Var.setBackgroundColor(j6.w0(null, j6.f19827a7, false));
        g61 g61Var = new g61(this, new Utilities.Callback2(this) {
            public final m1 f45338b;

            {
                this.f45338b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        m1.V(this.f45338b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        m1.U(this.f45338b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new d1(this), new d1(this));
        this.f45447a = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.f45447a;
        g61Var2.V2.f30148r = false;
        g61Var2.A1(new Utilities.Callback2(this) {
            public final m1 f45338b;

            {
                this.f45338b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        m1.V(this.f45338b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        m1.U(this.f45338b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        z51Var.addView(this.f45447a, b6.c(-1.0f, -1));
        this.actionBar.A(this.f45447a, true);
        this.fragmentView = z51Var;
        return z51Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g61 g61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (g61Var = this.f45447a) != null && (w51Var = g61Var.V2) != null) {
            w51Var.N(true);
        }
    }

    public final void e0(i51 i51Var, View view) {
        boolean z4;
        float f10;
        float f11;
        o1 o1Var = (o1) i51Var.G;
        l1 l1Var = (l1) view;
        Integer valueOf = Integer.valueOf(o1Var.f45471a);
        ArrayList arrayList = this.f45448b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(o1Var.f45471a));
        } else {
            arrayList.add(Integer.valueOf(o1Var.f45471a));
        }
        boolean z10 = true;
        this.f45447a.v1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(o1Var.f45471a));
        i51Var.e = contains;
        l1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f45449c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            o1 c3 = p1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z4 = (c3 == null || p1.g(c3.f45472b)) ? false : false;
        }
        if (this.f45450f != z4) {
            this.f45450f = z4;
            ViewPropertyAnimator animate = this.d.animate();
            float f12 = 1.0f;
            if (this.f45450f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (this.f45450f) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!this.f45450f) {
                f12 = 0.7f;
            }
            org.telegram.ui.b.p(scaleX.scaleY(f12), mr.h, 340L);
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
        this.f45447a.setPadding(0, 0, 0, i13);
        this.f45447a.setClipToPadding(false);
    }
}
