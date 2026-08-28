package pf;

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
import g7.e6;
import ih.q5;
import java.util.ArrayList;
import java.util.Collections;
import kh.i9;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a80;
import org.telegram.ui.fk0;
import org.telegram.ui.qn;
public final class n1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 h;
    public i51 f45722a;
    public final ArrayList f45723b;
    public NumberTextView f45724c;
    public org.telegram.ui.ActionBar.w0 d;
    public int f45725e;
    public boolean f45726f;

    public n1() {
        super(null);
        this.f45723b = new ArrayList();
        this.f45726f = true;
    }

    public static void T(n1 n1Var, int i9, ArrayList arrayList) {
        if (i9 == n1Var.f45725e) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((l41) arrayList.get(i10)).G instanceof q1) {
                    ((q1) ((l41) arrayList.get(i10)).G).f45758c = i10;
                }
            }
            r1 f10 = r1.f(n1Var.currentAccount);
            ArrayList arrayList2 = f10.f45766b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = j3.r0.e(((q1) arrayList2.get(i11)).f45756a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jn0(22));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((q1) arrayList2.get(i12)).f45756a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = j3.r0.e(((q1) arrayList2.get(i13)).f45756a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f45765a).sendRequest(tL_messages_reorderQuickReplies, new q5(19));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void U(n1 n1Var, ArrayList arrayList, z41 z41Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        l41 l41Var = new l41(2);
        l41Var.f30339l = string;
        l41Var.f30342o = string2;
        l41Var.f30340m = "RestrictedEmoji";
        l41Var.f30341n = "📝";
        arrayList.add(l41Var);
        z41Var.U();
        r1 f10 = r1.f(n1Var.currentAccount);
        ArrayList arrayList2 = f10.f45766b;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((q1) arrayList2.get(i12)).f45757b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((q1) arrayList2.get(i12)).f45757b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < MessagesController.getInstance(f10.f45765a).quickRepliesLimit) {
            l41 c10 = l41.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f30344q = true;
            arrayList.add(c10);
        }
        n1Var.f45725e = z41Var.M();
        ArrayList arrayList3 = r1.f(n1Var.currentAccount).f45766b;
        int size = arrayList3.size();
        while (i9 < size) {
            Object obj = arrayList3.get(i9);
            i9++;
            q1 q1Var = (q1) obj;
            l41 l41Var2 = new l41(16);
            l41Var2.G = q1Var;
            l41Var2.K(n1Var.f45723b.contains(Integer.valueOf(q1Var.f45756a)));
            arrayList.add(l41Var2);
        }
        z41Var.L();
        z41Var.T();
        j2.y(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void V(n1 n1Var, l41 l41Var, View view) {
        if (l41Var.d == 1) {
            c0(n1Var.getParentActivity(), n1Var.currentAccount, null, null, n1Var.getResourceProvider(), new i9(n1Var, 14));
        } else if (l41Var.f48814a == 16 && (l41Var.G instanceof q1)) {
            if (!n1Var.f45723b.isEmpty()) {
                n1Var.d0(l41Var, view);
                return;
            }
            q1 q1Var = (q1) l41Var.G;
            if (!q1Var.f45761g) {
                Bundle h10 = aa.d.h(5, "chatMode");
                h10.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                h10.putString("quick_reply", q1Var.f45757b);
                qn qnVar = new qn(h10);
                qnVar.nb(q1Var.f45756a);
                n1Var.presentFragment(qnVar);
            }
        }
    }

    public static void W(n1 n1Var) {
        n1Var.f45723b.clear();
        AndroidUtilities.forEachViews((RecyclerView) n1Var.f45722a, (d5.d) new ih.e(17));
        n1Var.actionBar.r();
        n1Var.f45722a.w1(false);
    }

    public static void c0(Activity activity, int i9, String str, q1 q1Var, b6 b6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        CharSequence charSequence;
        int i11;
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof xu0) && ((xu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2[] c2VarArr = new c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (q1Var == null && str == null) {
            i10 = R.string.BusinessRepliesNewTitle;
        } else {
            i10 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i10);
        c2 c2Var = alertDialog$Builder2.f22702a;
        c2Var.N = string;
        final h1 h1Var = new h1(activity, b6Var);
        MediaDataController.getInstance(i9).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        h1Var.setTextSize(1, 18.0f);
        if (q1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = q1Var.f45757b;
        }
        h1Var.setText(charSequence);
        int i12 = f6.f23108j5;
        h1Var.setTextColor(f6.v0(i12, b6Var));
        h1Var.setHintColor(f6.v0(f6.Xh, b6Var));
        h1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        h1Var.setSingleLine(true);
        h1Var.setFocusable(true);
        h1Var.setLineColors(f6.v0(f6.f23127k6, b6Var), f6.v0(f6.f23144l6, b6Var), f6.v0(f6.f23212p7, b6Var));
        h1Var.setImeOptions(6);
        h1Var.setBackgroundDrawable(null);
        h1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        h1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        ll.n(i12, b6Var, textView, 1, 16.0f);
        if (q1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewMessage;
        } else {
            i11 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i11));
        frameLayout.addView(textView, e6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        ll.n(f6.f23230q7, b6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, e6.e(-1, -2, 83));
        bg.j1 j1Var = new bg.j1(r15, new ValueAnimator[1], textView2, textView, 16);
        Runnable[] runnableArr = {new m2(j1Var, 29)};
        h1Var.addTextChangedListener(new j1(textView2, runnableArr));
        f10.addView(frameLayout, e6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(h1Var, e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f10);
        c2Var.f22761a = AndroidUtilities.dp(292.0f);
        h1Var.setOnEditorActionListener(new k1(h1Var, i9, q1Var, textView2, j1Var, callback, c2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new a80(h1Var, j1Var, i9, q1Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(16));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            return;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            c2Var.K = new i9(h1Var, 15);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new eh.l(h1Var, 10));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            return;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            return;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[r32].f22767d0 = r32;
        h1Var.setSelection(h1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new g1(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f45724c = numberTextView;
        numberTextView.setTextSize(18);
        this.f45724c.setTypeface(AndroidUtilities.bold());
        this.f45724c.setTextColor(f6.w0(null, f6.f23371y8, false));
        j10.addView(this.f45724c, e6.m(1.0f, 0, -1, 72, 0, 0));
        this.f45724c.setOnTouchListener(new jh.d(2));
        org.telegram.ui.ActionBar.w0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        b51 b51Var = new b51(context, null, 5);
        b51Var.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        i51 i51Var = new i51(this, new Utilities.Callback2(this) {
            public final n1 f45604b;

            {
                this.f45604b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        n1.U(this.f45604b, (ArrayList) obj, (z41) obj2);
                        return;
                    default:
                        n1.T(this.f45604b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new e1(this), new e1(this));
        this.f45722a = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.f45722a;
        i51Var2.U2.f35188r = false;
        i51Var2.B1(new Utilities.Callback2(this) {
            public final n1 f45604b;

            {
                this.f45604b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        n1.U(this.f45604b, (ArrayList) obj, (z41) obj2);
                        return;
                    default:
                        n1.T(this.f45604b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        b51Var.addView(this.f45722a, e6.c(-1.0f, -1));
        this.actionBar.z(this.f45722a, true);
        this.fragmentView = b51Var;
        return b51Var;
    }

    public final void d0(l41 l41Var, View view) {
        boolean z10;
        float f10;
        float f11;
        q1 q1Var = (q1) l41Var.G;
        m1 m1Var = (m1) view;
        Integer valueOf = Integer.valueOf(q1Var.f45756a);
        ArrayList arrayList = this.f45723b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(q1Var.f45756a));
        } else {
            arrayList.add(Integer.valueOf(q1Var.f45756a));
        }
        boolean z11 = true;
        this.f45722a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(q1Var.f45756a));
        l41Var.f30333e = contains;
        m1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.N(null, null);
            }
        }
        this.f45724c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            q1 c10 = r1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || r1.g(c10.f45757b)) ? false : false;
        }
        if (this.f45726f != z10) {
            this.f45726f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f12 = 1.0f;
            if (this.f45726f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (this.f45726f) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!this.f45726f) {
                f12 = 0.7f;
            }
            ll.r(scaleX.scaleY(f12), gr.h, 340L);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        i51 i51Var;
        z41 z41Var;
        if (i9 == NotificationCenter.quickRepliesUpdated && (i51Var = this.f45722a) != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        r1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f45722a.setPadding(0, 0, 0, i12);
        this.f45722a.setClipToPadding(false);
    }
}
