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
public final class xu0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.wu0 {
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
    public org.telegram.ui.Components.ux0 M;
    public org.telegram.ui.Components.wy N;
    public kh.b4 O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public org.telegram.ui.Cells.c6 X;
    public final boolean Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 f44607a;
    public wu0 f44608a0;
    public vu0 f44609b;
    public boolean f44610b0;
    public va1 f44611c;
    public int f44612c0;
    public f2.m0 d;
    public int f44613d0;
    public ed f44614e;
    public int f44615e0;
    public final qn f44616f;
    public int f44617f0;
    public int f44618g0;
    public org.telegram.ui.Components.s30 h;
    public int f44619h0;
    public int f44620i0;
    public int f44621j0;
    public int f44622k0;
    public int f44623l0;
    public int m0;
    public final int f44624n;
    public int f44625n0;
    public int f44626o0;
    public int f44627p0;
    public int f44628q0;
    public int[] f44629r;
    public int f44630r0;
    public int f44631s;
    public int f44632s0;
    public int f44633t0;
    public final v5 f44634u0;
    public final CharSequence[] v;
    public TLRPC.MessageMedia f44635v0;
    public final boolean[] f44636w;
    public boolean f44637w0;
    public int f44638x;
    public boolean f44639x0;
    public int f44640y;

    public xu0(qn qnVar) {
        super(null);
        this.f44640y = 1;
        this.C = true;
        this.D = false;
        this.F = true;
        this.K = AndroidUtilities.dp(3.0f);
        this.f44612c0 = -1;
        this.f44634u0 = new v5(this, 12);
        this.Z = true;
        int i9 = getMessagesController().todoItemsMax;
        this.f44624n = i9;
        this.v = new CharSequence[i9];
        this.f44636w = new boolean[i9];
        this.f44616f = qnVar;
        this.Y = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.H = false;
        this.J = 2;
    }

    public static void b0(xu0 xu0Var, View view, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = xu0Var.Z;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i9 == xu0Var.f44615e0) {
                if (z10) {
                    i13 = xu0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = xu0Var.A;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i9 == xu0Var.f44617f0) {
                Editable editable = xu0Var.B;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = xu0Var.f44621j0;
                if (i9 >= i17 && i9 < xu0Var.f44640y + i17) {
                    int i18 = i9 - i17;
                    if (z10) {
                        i10 = xu0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = xu0Var.v[i18];
                    if (charSequence2 != null) {
                        i11 = charSequence2.length();
                    } else {
                        i11 = 0;
                    }
                    i12 = i10 - i11;
                    i13 = i10;
                } else {
                    return;
                }
            }
            float f10 = i13;
            if (i12 <= f10 - (0.7f * f10)) {
                c6Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.h5 textView2 = c6Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.f6.f23212p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.f6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void c0(xu0 xu0Var, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        f2.q1 T;
        if (xu0Var.Y && z10) {
            if (xu0Var.X == c6Var && xu0Var.L && xu0Var.f44639x0) {
                xu0Var.i0();
                xu0Var.L = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = xu0Var.X;
            xu0Var.X = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.f31383e;
            emojiButton.j(ogVar, false);
            va1 va1Var = xu0Var.f44611c;
            View F = va1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = va1Var.T(F);
            }
            org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
            if (ux0Var != null) {
                ux0Var.f();
                org.telegram.ui.Components.ux0 ux0Var2 = xu0Var.M;
                if (ux0Var2 != null && T != null) {
                    View view = T.f5501a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && ux0Var2.getDelegate() != view) {
                        xu0Var.M.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (xu0Var.L) {
                    xu0Var.i0();
                    xu0Var.j0(false);
                    xu0Var.l0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(ogVar, false);
            }
        }
    }

    public static void d0(xu0 xu0Var, org.telegram.ui.Cells.c6 c6Var) {
        xu0Var.X = c6Var;
        if (xu0Var.L) {
            xu0Var.i0();
            xu0Var.l0();
            return;
        }
        xu0Var.p0(1);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int dp;
        if (this.Y) {
            if (i9 > AndroidUtilities.dp(50.0f) && this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.T = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.T).commit();
                } else {
                    this.S = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.S).commit();
                }
            }
            if (this.L) {
                if (z10) {
                    i10 = this.T;
                } else {
                    i10 = this.S;
                }
                if (this.f44639x0) {
                    i10 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = AndroidUtilities.displaySize.x;
                if (i11 != i12 || layoutParams.height != i10 || this.f44637w0 != this.f44639x0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.N.setLayoutParams(layoutParams);
                    this.R = layoutParams.height;
                    this.O.a();
                    this.f44614e.requestLayout();
                    boolean z13 = this.f44637w0;
                    if (z13 != this.f44639x0) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        f0(dp);
                    }
                    this.f44637w0 = this.f44639x0;
                }
            }
            if (this.V != i9 || this.W != z10) {
                this.V = i9;
                this.W = z10;
                boolean z14 = this.U;
                org.telegram.ui.Cells.c6 c6Var = this.X;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && this.O.c() && i9 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.U = z12;
                } else {
                    this.U = false;
                }
                if (this.U && this.L) {
                    p0(0);
                }
                if (this.R != 0 && !(z11 = this.U) && z11 != z14 && !this.L) {
                    this.R = 0;
                    this.O.a();
                    this.f44614e.requestLayout();
                }
                if (this.U && this.P) {
                    this.P = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f44634u0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i9;
        int i10;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.Z;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.E) {
                i10 = R.string.TodoAddTasksTitle;
            } else {
                i10 = R.string.TodoEditTitle;
            }
            kVar2.setTitle(LocaleController.getString(i10));
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
        this.actionBar.setActionBarMenuOnItemClick(new pu0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z10) {
            if (this.E) {
                i9 = R.string.TodoAddTasksButton;
            } else {
                i9 = R.string.TodoEditTasksButton;
            }
            upperCase = LocaleController.getString(i9);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f44607a = n10.e(1, upperCase);
        this.f44609b = new vu0(this, context);
        ed edVar = new ed(3, context, this);
        this.f44614e = edVar;
        edVar.setDelegate(this);
        ed edVar2 = this.f44614e;
        this.fragmentView = edVar2;
        edVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f44611c = new va1(context, 11, null);
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.f44611c.setItemAnimator(nVar);
        this.f44611c.setVerticalScrollBarEnabled(false);
        ((f2.n) this.f44611c.getItemAnimator()).C = false;
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        this.f44611c.setLayoutManager(m0Var);
        new f2.h0(new jh.f(this, 6)).d(this.f44611c);
        frameLayout.addView(this.f44611c, g7.e6.e(-1, -1, 51));
        this.f44611c.setAdapter(this.f44609b);
        this.f44611c.setOnItemClickListener(new i(this, 22));
        this.f44611c.setOnScrollListener(new l3(this, 24));
        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(context, 4);
        this.h = s30Var;
        s30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Y) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, this.currentAccount, null, this.resourceProvider);
            this.M = ux0Var;
            ux0Var.f33168y = true;
            ux0Var.A = true;
            ux0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.M, g7.e6.e(-2, 160, 51));
        }
        this.O = new kh.b4(this.f44614e, false, null);
        h0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wy wyVar = this.N;
            if (wyVar != null) {
                wyVar.L.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.X.getEditField().setTextColor(-1);
                this.X.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0() {
        int i9;
        org.telegram.ui.Components.ux0 ux0Var = this.M;
        if (ux0Var != null) {
            ux0Var.setDelegate(null);
            this.M.f();
        }
        int i10 = this.f44640y;
        this.f44636w[i10] = false;
        int i11 = i10 + 1;
        this.f44640y = i11;
        if (this.f44629r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f44629r;
                if (i12 < iArr2.length) {
                    i9 = iArr2[i12];
                } else {
                    i9 = this.f44631s + 1;
                    this.f44631s = i9;
                }
                iArr[i12] = i9;
            }
            this.f44629r = iArr;
        }
        if (this.f44640y == this.v.length) {
            this.f44609b.u(this.f44622k0);
        }
        this.f44609b.o(this.f44622k0);
        q0();
        this.f44610b0 = false;
        this.f44612c0 = (this.f44621j0 + this.f44640y) - 1;
        this.f44609b.m(this.f44623l0);
    }

    public final void f0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new cg(this, f10, 3));
        ofFloat.addListener(new qu0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
        ofFloat.start();
    }

    public final boolean g0(boolean z10) {
        int i9;
        int i10;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f44635v0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.f44640y, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.E && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.X(this.A))) || i11 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (!TextUtils.equals(charSequenceArr[i13].toString(), todoList.list.get(i13).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.X(this.A));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.f44640y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i14]))); i14++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.Z;
            if (z14) {
                i9 = R.string.CancelTodoAlertTitle;
            } else {
                i9 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
            if (z14) {
                i10 = R.string.CancelTodoAlertText;
            } else {
                i10 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new dl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f22702a);
        }
        return z13;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        int i12 = org.telegram.ui.ActionBar.f6.f23162m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.f23128k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        int i14 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23229q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 32, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44611c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xu0.h0():void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f44612c0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        if (this.f44639x0) {
            this.N.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.N.setLayoutParams(layoutParams);
            this.R = layoutParams.height;
            this.f44637w0 = this.f44639x0;
            this.f44639x0 = false;
            f0(-AndroidUtilities.dp(120.0f));
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0(boolean z10) {
        if (this.Y) {
            if (this.L) {
                org.telegram.ui.Components.wy wyVar = this.N;
                wyVar.L.B0();
                wyVar.E.scrollTo(0, 0);
                wyVar.G(1);
                wyVar.M.h1(0, 0);
                this.N.t(false);
                if (z10) {
                    this.N.A();
                }
                this.f44639x0 = false;
                p0(0);
            }
            if (z10) {
                org.telegram.ui.Components.wy wyVar2 = this.N;
                if (wyVar2 != null && wyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.N.getMeasuredHeight());
                    ofFloat.addUpdateListener(new ou0(this, 1));
                    ofFloat.addListener(new qu0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                    ofFloat.start();
                    return;
                }
                k0();
            }
        }
    }

    public final void k0() {
        org.telegram.ui.Components.wy wyVar;
        org.telegram.ui.Components.qg emojiButton;
        if (!this.L && (wyVar = this.N) != null && wyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.og.f31383e, false);
            }
            this.N.setVisibility(8);
        }
        int i9 = this.R;
        this.R = 0;
        if (i9 != 0) {
            this.O.a();
        }
    }

    public final void l0() {
        int i9;
        this.O.f14993e = true;
        EditTextBoldCursor editField = this.X.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        p0(i9);
        if (!AndroidUtilities.usingHardwareInput && !this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.P = true;
            v5 v5Var = this.f44634u0;
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            AndroidUtilities.runOnUIThread(v5Var, 100L);
        }
    }

    public final void m0(ng ngVar) {
        this.f44608a0 = ngVar;
    }

    public final void n0(TLRPC.MessageMedia messageMedia, boolean z10) {
        o0(messageMedia, z10, -1);
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10, int i9) {
        int i10;
        this.f44635v0 = messageMedia;
        this.E = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.A = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.A = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.A = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.f44640y = size;
            this.f44638x = size;
            this.f44631s = 0;
            this.f44629r = new int[size];
            int i11 = 0;
            while (true) {
                i10 = this.f44640y;
                if (i11 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i11).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i11] = spannableStringBuilder2;
                charSequenceArr[i11] = Emoji.replaceEmoji(charSequenceArr[i11], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i11] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i11], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i11], tL_textWithEntities.entities, false, false, false, false);
                this.f44629r[i11] = tL_messageMediaToDo.todo.list.get(i11).f22525id;
                this.f44631s = Math.max(this.f44631s, this.f44629r[i11]);
                i11++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.F = todoList.others_can_complete;
            this.D = todoList.others_can_append;
            if (this.E) {
                this.f44640y = i10 + 1;
                q0();
                this.f44610b0 = true;
                int i12 = this.f44621j0;
                if (i9 < 0) {
                    i9 = this.f44640y - 1;
                }
                this.f44612c0 = i12 + i9;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.L) {
            if (z10) {
                j0(true);
                return false;
            }
            return false;
        }
        return g0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f44610b0 && this.f44612c0 >= 0) {
            int i9 = 0;
            while (true) {
                if (i9 < this.f44611c.getChildCount()) {
                    view = this.f44611c.getChildAt(i9);
                    this.f44611c.getClass();
                    if (RecyclerView.R(view) == this.f44612c0) {
                        break;
                    }
                    i9++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.c6) {
                AndroidUtilities.runOnUIThread(new yg(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
                this.f44612c0 = -1;
            }
            this.f44610b0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.Q = true;
        if (this.Y) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.wy wyVar = this.N;
            if (wyVar != null) {
                this.f44614e.removeView(wyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.Y) {
            j0(false);
            org.telegram.ui.Components.ux0 ux0Var = this.M;
            if (ux0Var != null) {
                ux0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.X.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.X.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vu0 vu0Var = this.f44609b;
        if (vu0Var != null) {
            vu0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(int i9) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.Y) {
            if (i9 == 1) {
                org.telegram.ui.Components.wy wyVar = this.N;
                if (wyVar != null && wyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.wy wyVar2 = this.N;
                if (wyVar2 != null && wyVar2.Y0 != UserConfig.selectedAccount) {
                    this.f44614e.removeView(wyVar2);
                    this.N = null;
                }
                if (this.N == null) {
                    org.telegram.ui.Components.wy wyVar3 = new org.telegram.ui.Components.wy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.N = wyVar3;
                    wyVar3.f34447t2 = false;
                    wyVar3.Q0 = false;
                    wyVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.N.setForseMultiwindowLayout(true);
                    }
                    this.N.setDelegate(new ru0(this));
                    this.f44614e.addView(this.N);
                }
                this.N.setVisibility(0);
                this.L = true;
                org.telegram.ui.Components.wy wyVar4 = this.N;
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
                if (point.x > point.y) {
                    i10 = this.T;
                } else {
                    i10 = this.S;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar4.getLayoutParams();
                layoutParams.height = i10;
                wyVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.X) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.R = i10;
                this.O.a();
                this.f44614e.requestLayout();
                org.telegram.ui.Components.qg emojiButton = this.X.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.d, true);
                }
                if (!z10 && !this.U) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
                    ofFloat.addUpdateListener(new ou0(this, 0));
                    ofFloat.addListener(new qu0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.qg emojiButton2 = this.X.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.f31383e, true);
            }
            org.telegram.ui.Components.wy wyVar5 = this.N;
            if (wyVar5 != null) {
                this.L = false;
                this.f44639x0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wyVar5.setVisibility(8);
                }
            }
            if (i9 == 0) {
                this.R = 0;
            }
            this.O.a();
            this.f44614e.requestLayout();
        }
    }

    public final void q0() {
        this.f44613d0 = -1;
        this.f44615e0 = -1;
        this.f44619h0 = -1;
        this.f44620i0 = -1;
        this.f44617f0 = -1;
        this.f44618g0 = -1;
        this.f44621j0 = -1;
        this.f44622k0 = -1;
        this.f44625n0 = -1;
        this.f44626o0 = -1;
        this.f44628q0 = -1;
        this.f44630r0 = -1;
        this.f44627p0 = -1;
        this.f44632s0 = -1;
        this.m0 = -1;
        this.f44633t0 = 0;
        boolean z10 = this.Z;
        if (!z10 || !this.E) {
            this.f44613d0 = 0;
            this.f44615e0 = 1;
            this.f44619h0 = 2;
            this.f44633t0 = 4;
            this.f44620i0 = 3;
        }
        int i9 = this.f44640y;
        if (i9 != 0) {
            int i10 = this.f44633t0;
            this.f44621j0 = i10;
            this.f44633t0 = i10 + i9;
        }
        if (i9 != this.v.length) {
            int i11 = this.f44633t0;
            this.f44633t0 = i11 + 1;
            this.f44622k0 = i11;
        }
        int i12 = this.f44633t0;
        int i13 = i12 + 1;
        this.f44633t0 = i13;
        this.f44623l0 = i12;
        if (!z10 || !this.E) {
            int i14 = i12 + 2;
            this.f44633t0 = i14;
            this.m0 = i13;
            if (z10) {
                int i15 = i12 + 3;
                this.f44633t0 = i15;
                this.f44630r0 = i14;
                if (this.F) {
                    this.f44633t0 = i12 + 4;
                    this.f44628q0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f44616f.f41890e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i16 = this.f44633t0;
                this.f44633t0 = i16 + 1;
                this.f44625n0 = i16;
            }
            int i17 = this.J;
            if (i17 != 1) {
                int i18 = this.f44633t0;
                this.f44633t0 = i18 + 1;
                this.f44626o0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f44633t0;
                this.f44633t0 = i19 + 1;
                this.f44627p0 = i19;
            }
            int i20 = this.f44633t0;
            int i21 = i20 + 1;
            this.f44633t0 = i21;
            this.f44632s0 = i20;
            if (this.H) {
                this.f44617f0 = i21;
                this.f44633t0 = i20 + 3;
                this.f44618g0 = i20 + 2;
            }
        }
    }
}
