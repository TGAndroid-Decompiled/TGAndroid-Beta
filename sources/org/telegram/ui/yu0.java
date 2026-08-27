package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class yu0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.yu0 {
    public CharSequence A;
    public Editable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int J;
    public int K;
    public boolean L;
    public org.telegram.ui.Components.wx0 M;
    public org.telegram.ui.Components.yy N;
    public lh.a4 O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public org.telegram.ui.Cells.z5 X;
    public final boolean Y;
    public final boolean Z;

    public org.telegram.ui.ActionBar.v0 f44916a;

    public xu0 f44917a0;

    public wu0 f44918b;

    public boolean f44919b0;

    public ta1 f44920c;

    public int f44921c0;
    public f2.k0 d;

    public int f44922d0;

    public ed f44923e;

    public int f44924e0;

    public final rn f44925f;

    public int f44926f0;

    public int f44927g0;
    public org.telegram.ui.Components.x30 h;

    public int f44928h0;

    public int f44929i0;

    public int f44930j0;

    public int f44931k0;

    public int f44932l0;
    public int m0;

    public final int f44933n;

    public int f44934n0;

    public int f44935o0;

    public int f44936p0;

    public int f44937q0;

    public int[] f44938r;

    public int f44939r0;

    public int f44940s;

    public int f44941s0;

    public int f44942t0;

    public final w5 f44943u0;
    public final CharSequence[] v;

    public TLRPC.MessageMedia f44944v0;

    public final boolean[] f44945w;

    public boolean f44946w0;

    public int f44947x;

    public boolean f44948x0;

    public int f44949y;

    public yu0(rn rnVar) {
        super(null);
        this.f44949y = 1;
        this.C = true;
        this.D = false;
        this.F = true;
        this.K = AndroidUtilities.dp(3.0f);
        this.f44921c0 = -1;
        this.f44943u0 = new w5(this, 12);
        this.Z = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f44933n = i10;
        this.v = new CharSequence[i10];
        this.f44945w = new boolean[i10];
        this.f44925f = rnVar;
        this.Y = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.H = false;
        this.J = 2;
    }

    public static void c0(yu0 yu0Var, View view, int i10) {
        int length;
        int i11;
        boolean z10 = yu0Var.Z;
        if (view instanceof org.telegram.ui.Cells.z5) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            if (i10 == yu0Var.f44924e0) {
                i11 = z10 ? yu0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = yu0Var.A;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == yu0Var.f44926f0) {
                Editable editable = yu0Var.B;
                i11 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i12 = yu0Var.f44930j0;
                if (i10 < i12 || i10 >= yu0Var.f44949y + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? yu0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = yu0Var.v[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f10 = i11;
            if (length > f10 - (0.7f * f10)) {
                z5Var.setText2("");
                return;
            }
            z5Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.h5 textView2 = z5Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void d0(yu0 yu0Var, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        if (yu0Var.Y && z10) {
            if (yu0Var.X == z5Var && yu0Var.L && yu0Var.f44948x0) {
                yu0Var.j0();
                yu0Var.L = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = yu0Var.X;
            yu0Var.X = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.mg emojiButton = z5Var.getEmojiButton();
            org.telegram.ui.Components.kg kgVar = org.telegram.ui.Components.kg.f30100e;
            emojiButton.j(kgVar, false);
            ta1 ta1Var = yu0Var.f44920c;
            View viewF = ta1Var.F(z5Var);
            f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
            org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
            if (wx0Var != null) {
                wx0Var.f();
                org.telegram.ui.Components.wx0 wx0Var2 = yu0Var.M;
                if (wx0Var2 != null && o1VarT != null) {
                    View view = o1VarT.f5789a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && wx0Var2.getDelegate() != view) {
                        yu0Var.M.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 == null || z5Var2 == z5Var) {
                return;
            }
            if (yu0Var.L) {
                yu0Var.j0();
                yu0Var.k0(false);
                yu0Var.m0();
            }
            z5Var2.setEmojiButtonVisibility(false);
            z5Var2.getEmojiButton().j(kgVar, false);
        }
    }

    public static void e0(yu0 yu0Var, org.telegram.ui.Cells.z5 z5Var) {
        yu0Var.X = z5Var;
        if (!yu0Var.L) {
            yu0Var.q0(1);
        } else {
            yu0Var.j0();
            yu0Var.m0();
        }
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (this.Y) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.T = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.T).commit();
                } else {
                    this.S = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.S).commit();
                }
            }
            if (this.L) {
                int iDp = z10 ? this.T : this.S;
                if (this.f44948x0) {
                    iDp += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = AndroidUtilities.displaySize.x;
                if (i11 != i12 || layoutParams.height != iDp || this.f44946w0 != this.f44948x0) {
                    layoutParams.width = i12;
                    layoutParams.height = iDp;
                    this.N.setLayoutParams(layoutParams);
                    this.R = layoutParams.height;
                    this.O.a();
                    this.f44923e.requestLayout();
                    boolean z12 = this.f44946w0;
                    if (z12 != this.f44948x0) {
                        g0(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.f44946w0 = this.f44948x0;
                }
            }
            if (this.V == i10 && this.W == z10) {
                return;
            }
            this.V = i10;
            this.W = z10;
            boolean z13 = this.U;
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                this.U = z5Var.getEditField().isFocused() && this.O.c() && i10 > 0;
            } else {
                this.U = false;
            }
            if (this.U && this.L) {
                q0(0);
            }
            if (this.R != 0 && !(z11 = this.U) && z11 != z13 && !this.L) {
                this.R = 0;
                this.O.a();
                this.f44923e.requestLayout();
            }
            if (this.U && this.P) {
                this.P = false;
                AndroidUtilities.cancelRunOnUIThread(this.f44943u0);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(getThemedColor(i10), false);
        this.actionBar.D(getThemedColor(i10), true);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.Z;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(this.E ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.J == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qu0(this));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        if (z10) {
            upperCase = LocaleController.getString(this.E ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f44916a = zVarN.e(1, upperCase);
        this.f44918b = new wu0(this, context);
        ed edVar = new ed(3, context, this);
        this.f44923e = edVar;
        edVar.setDelegate(this);
        ed edVar2 = this.f44923e;
        this.fragmentView = edVar2;
        edVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f44920c = new ta1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        this.f44920c.setItemAnimator(lVar);
        this.f44920c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f44920c.getItemAnimator()).C = false;
        f2.k0 k0Var = new f2.k0(1, false);
        this.d = k0Var;
        this.f44920c.setLayoutManager(k0Var);
        new f2.f0(new kh.g(this, 6)).d(this.f44920c);
        frameLayout.addView(this.f44920c, h7.z5.e(-1, -1, 51));
        this.f44920c.setAdapter(this.f44918b);
        this.f44920c.setOnItemClickListener(new i(this, 22));
        this.f44920c.setOnScrollListener(new m3(this, 24));
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(context, 4);
        this.h = x30Var;
        x30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Y) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.currentAccount, null, this.resourceProvider);
            this.M = wx0Var;
            wx0Var.f34373y = true;
            wx0Var.A = true;
            wx0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.M, h7.z5.e(-2, 160, 51));
        }
        this.O = new lh.a4(this.f44923e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.yy yyVar = this.N;
            if (yyVar != null) {
                yyVar.L.f1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.X.getEditField().setTextColor(-1);
                this.X.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.wx0 wx0Var = this.M;
        if (wx0Var != null) {
            wx0Var.setDelegate(null);
            this.M.f();
        }
        int i11 = this.f44949y;
        this.f44945w[i11] = false;
        int i12 = i11 + 1;
        this.f44949y = i12;
        if (this.f44938r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f44938r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f44940s + 1;
                    this.f44940s = i10;
                }
                iArr[i13] = i10;
            }
            this.f44938r = iArr;
        }
        if (this.f44949y == this.v.length) {
            this.f44918b.u(this.f44931k0);
        }
        this.f44918b.o(this.f44931k0);
        r0();
        this.f44919b0 = false;
        this.f44921c0 = (this.f44930j0 + this.f44949y) - 1;
        this.f44918b.m(this.f44932l0);
    }

    public final void g0(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new dg(this, f10, 3));
        valueAnimatorOfFloat.addListener(new ru0(this, 0));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
        valueAnimatorOfFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.z5.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 4, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i13 = org.telegram.ui.ActionBar.g6.f23215m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 196608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23182k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.f44944v0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(this.f44949y, charSequenceArr.length); i11++) {
                if (!TextUtils.isEmpty(charSequenceArr[i11])) {
                    i10++;
                }
            }
            boolean z13 = (this.E || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.in.Y(this.A))) && i10 == todoList.list.size();
            if (!z13) {
                z12 = z13;
                break;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    z12 = z13;
                    break;
                }
                if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                    break;
                }
                i12++;
            }
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.A));
            if (zIsEmpty) {
                for (int i13 = 0; i13 < this.f44949y && (zIsEmpty = TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i13]))); i13++) {
                }
            }
            z12 = zIsEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.Z;
            alertDialog$Builder.f22702a.N = LocaleController.getString(z14 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(z14 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new dl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f22702a);
        }
        return z12;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return this.f44921c0 < 0;
    }

    public final void i0() {
        int i10;
        boolean z10;
        boolean z11 = this.H;
        CharSequence[] charSequenceArr = this.v;
        if (z11) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.f44945w;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.Z;
        int i12 = z12 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z12 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.B)) || this.B.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.in.Y(this.A)) && this.A.length() <= i12) {
            int i14 = 0;
            for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i15]))) {
                    if (charSequenceArr[i15].length() > i13) {
                        i14 = 0;
                        break;
                    }
                    i14++;
                }
            }
            if (i14 < (z12 ? 1 : 2) || (this.H && i10 < 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        this.f44916a.setEnabled((this.H && i10 == 0) || z10);
        this.f44916a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
            if (this.actionBar.t()) {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393w8, false);
            }
            if (i0.b.f(iW0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f44948x0) {
            this.N.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.N.setLayoutParams(layoutParams);
            this.R = layoutParams.height;
            this.f44946w0 = this.f44948x0;
            this.f44948x0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.Y) {
            int i10 = 1;
            if (this.L) {
                org.telegram.ui.Components.yy yyVar = this.N;
                yyVar.L.B0();
                yyVar.E.scrollTo(0, 0);
                yyVar.H(1);
                yyVar.M.h1(0, 0);
                this.N.u(false);
                if (z10) {
                    this.N.C();
                }
                this.f44948x0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.yy yyVar2 = this.N;
                if (yyVar2 == null || yyVar2.getVisibility() != 0) {
                    l0();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.N.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new pu0(this, i10));
                valueAnimatorOfFloat.addListener(new ru0(this, 2));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.yy yyVar;
        org.telegram.ui.Components.mg emojiButton;
        if (!this.L && (yyVar = this.N) != null && yyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.kg.f30100e, false);
            }
            this.N.setVisibility(8);
        }
        int i10 = this.R;
        this.R = 0;
        if (i10 != 0) {
            this.O.a();
        }
    }

    public final void m0() {
        this.O.f15636e = true;
        EditTextBoldCursor editField = this.X.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        q0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.U || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.P = true;
        w5 w5Var = this.f44943u0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        AndroidUtilities.runOnUIThread(w5Var, 100L);
    }

    public final void n0(pg pgVar) {
        this.f44917a0 = pgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.L) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View childAt;
        super.onBecomeFullyVisible();
        if (!this.f44919b0 || this.f44921c0 < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f44920c.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = this.f44920c.getChildAt(i10);
            this.f44920c.getClass();
            if (RecyclerView.R(childAt) == this.f44921c0) {
                break;
            } else {
                i10++;
            }
        }
        if (childAt instanceof org.telegram.ui.Cells.z5) {
            AndroidUtilities.runOnUIThread(new ah(5, ((org.telegram.ui.Cells.z5) childAt).getTextView()), 300L);
            this.f44921c0 = -1;
        }
        this.f44919b0 = false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.Q = true;
        if (this.Y) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.yy yyVar = this.N;
            if (yyVar != null) {
                this.f44923e.removeView(yyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.Y) {
            k0(false);
            org.telegram.ui.Components.wx0 wx0Var = this.M;
            if (wx0Var != null) {
                wx0Var.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.X;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.X.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.X.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wu0 wu0Var = this.f44918b;
        if (wu0Var != null) {
            wu0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f44944v0 = messageMedia;
        this.E = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.A = spannableStringBuilder;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.A = charSequenceReplaceEmoji;
            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.A = spannableReplaceAnimatedEmoji;
            MessageObject.addEntitiesToText(spannableReplaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.f44949y = size;
            this.f44947x = size;
            this.f44940s = 0;
            this.f44938r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f44949y;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = Emoji.replaceEmoji(charSequenceArr[i12], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i12] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false);
                this.f44938r[i12] = tL_messageMediaToDo.todo.list.get(i12).f22525id;
                this.f44940s = Math.max(this.f44940s, this.f44938r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.F = todoList.others_can_complete;
            this.D = todoList.others_can_append;
            if (this.E) {
                this.f44949y = i11 + 1;
                r0();
                this.f44919b0 = true;
                int i13 = this.f44930j0;
                if (i10 < 0) {
                    i10 = this.f44949y - 1;
                }
                this.f44921c0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        org.telegram.ui.Cells.z5 z5Var;
        if (this.Y) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.mg emojiButton = this.X.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.kg.f30100e, true);
                }
                org.telegram.ui.Components.yy yyVar = this.N;
                if (yyVar != null) {
                    this.L = false;
                    this.f44948x0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        yyVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.R = 0;
                }
                this.O.a();
                this.f44923e.requestLayout();
                return;
            }
            org.telegram.ui.Components.yy yyVar2 = this.N;
            boolean z10 = yyVar2 != null && yyVar2.getVisibility() == 0;
            org.telegram.ui.Components.yy yyVar3 = this.N;
            if (yyVar3 != null && yyVar3.Y0 != UserConfig.selectedAccount) {
                this.f44923e.removeView(yyVar3);
                this.N = null;
            }
            if (this.N == null) {
                org.telegram.ui.Components.yy yyVar4 = new org.telegram.ui.Components.yy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.N = yyVar4;
                yyVar4.f35040t2 = false;
                yyVar4.Q0 = false;
                yyVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.N.setForseMultiwindowLayout(true);
                }
                this.N.setDelegate(new su0(this));
                this.f44923e.addView(this.N);
            }
            this.N.setVisibility(0);
            this.L = true;
            org.telegram.ui.Components.yy yyVar5 = this.N;
            if (this.S <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.S = AndroidUtilities.dp(150.0f);
                } else {
                    this.S = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.T <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.T = AndroidUtilities.dp(150.0f);
                } else {
                    this.T = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i13 = point.x > point.y ? this.T : this.S;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar5.getLayoutParams();
            layoutParams.height = i13;
            yyVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (z5Var = this.X) != null) {
                AndroidUtilities.hideKeyboard(z5Var.getEditField());
            }
            this.R = i13;
            this.O.a();
            this.f44923e.requestLayout();
            org.telegram.ui.Components.mg emojiButton2 = this.X.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.kg.d, true);
            }
            if (z10 || this.U) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.R, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new pu0(this, i11));
            valueAnimatorOfFloat.addListener(new ru0(this, i12));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            valueAnimatorOfFloat.start();
        }
    }

    public final void r0() {
        this.f44922d0 = -1;
        this.f44924e0 = -1;
        this.f44928h0 = -1;
        this.f44929i0 = -1;
        this.f44926f0 = -1;
        this.f44927g0 = -1;
        this.f44930j0 = -1;
        this.f44931k0 = -1;
        this.f44934n0 = -1;
        this.f44935o0 = -1;
        this.f44937q0 = -1;
        this.f44939r0 = -1;
        this.f44936p0 = -1;
        this.f44941s0 = -1;
        this.m0 = -1;
        this.f44942t0 = 0;
        boolean z10 = this.Z;
        if (!z10 || !this.E) {
            this.f44922d0 = 0;
            this.f44924e0 = 1;
            this.f44928h0 = 2;
            this.f44942t0 = 4;
            this.f44929i0 = 3;
        }
        int i10 = this.f44949y;
        if (i10 != 0) {
            int i11 = this.f44942t0;
            this.f44930j0 = i11;
            this.f44942t0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f44942t0;
            this.f44942t0 = i12 + 1;
            this.f44931k0 = i12;
        }
        int i13 = this.f44942t0;
        int i14 = i13 + 1;
        this.f44942t0 = i14;
        this.f44932l0 = i13;
        if (z10 && this.E) {
            return;
        }
        int i15 = i13 + 2;
        this.f44942t0 = i15;
        this.m0 = i14;
        if (z10) {
            int i16 = i13 + 3;
            this.f44942t0 = i16;
            this.f44939r0 = i15;
            if (this.F) {
                this.f44942t0 = i13 + 4;
                this.f44937q0 = i16;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f44925f.f42026e;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i17 = this.f44942t0;
            this.f44942t0 = i17 + 1;
            this.f44934n0 = i17;
        }
        int i18 = this.J;
        if (i18 != 1) {
            int i19 = this.f44942t0;
            this.f44942t0 = i19 + 1;
            this.f44935o0 = i19;
        }
        if (i18 == 0) {
            int i20 = this.f44942t0;
            this.f44942t0 = i20 + 1;
            this.f44936p0 = i20;
        }
        int i21 = this.f44942t0;
        int i22 = i21 + 1;
        this.f44942t0 = i22;
        this.f44941s0 = i21;
        if (this.H) {
            this.f44926f0 = i22;
            this.f44942t0 = i21 + 3;
            this.f44927g0 = i21 + 2;
        }
    }
}
