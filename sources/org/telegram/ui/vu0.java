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
public final class vu0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.gv0 {
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
    public org.telegram.ui.Components.fy0 M;
    public org.telegram.ui.Components.fz N;
    public nh.w3 O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public org.telegram.ui.Cells.a6 X;
    public final boolean Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 f43752a;
    public uu0 f43753a0;
    public tu0 f43754b;
    public boolean f43755b0;
    public wa1 f43756c;
    public int f43757c0;
    public f2.j0 d;
    public int f43758d0;
    public dd f43759e;
    public int f43760e0;
    public final tn f43761f;
    public int f43762f0;
    public int f43763g0;
    public org.telegram.ui.Components.g40 h;
    public int f43764h0;
    public int f43765i0;
    public int f43766j0;
    public int f43767k0;
    public int f43768l0;
    public int m0;
    public final int f43769n;
    public int f43770n0;
    public int f43771o0;
    public int f43772p0;
    public int f43773q0;
    public int[] f43774r;
    public int f43775r0;
    public int f43776s;
    public int f43777s0;
    public int f43778t0;
    public final w5 f43779u0;
    public final CharSequence[] v;
    public TLRPC.MessageMedia f43780v0;
    public final boolean[] f43781w;
    public boolean f43782w0;
    public int f43783x;
    public boolean f43784x0;
    public int f43785y;

    public vu0(tn tnVar) {
        super(null);
        this.f43785y = 1;
        this.C = true;
        this.D = false;
        this.F = true;
        this.K = AndroidUtilities.dp(3.0f);
        this.f43757c0 = -1;
        this.f43779u0 = new w5(this, 12);
        this.Z = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f43769n = i10;
        this.v = new CharSequence[i10];
        this.f43781w = new boolean[i10];
        this.f43761f = tnVar;
        this.Y = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.H = false;
        this.J = 2;
    }

    public static void c0(vu0 vu0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = vu0Var.Z;
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            if (i10 == vu0Var.f43760e0) {
                if (z10) {
                    i14 = vu0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = vu0Var.A;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == vu0Var.f43762f0) {
                Editable editable = vu0Var.B;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = vu0Var.f43766j0;
                if (i10 >= i18 && i10 < vu0Var.f43785y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = vu0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = vu0Var.v[i19];
                    if (charSequence2 != null) {
                        i12 = charSequence2.length();
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 - i12;
                    i14 = i11;
                } else {
                    return;
                }
            }
            float f9 = i14;
            if (i13 <= f9 - (0.7f * f9)) {
                a6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.h5 textView2 = a6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.g6.f23279p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.g6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            a6Var.setText2("");
        }
    }

    public static void d0(vu0 vu0Var, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        f2.n1 T;
        if (vu0Var.Y && z10) {
            if (vu0Var.X == a6Var && vu0Var.L && vu0Var.f43784x0) {
                vu0Var.j0();
                vu0Var.L = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = vu0Var.X;
            vu0Var.X = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.tg emojiButton = a6Var.getEmojiButton();
            org.telegram.ui.Components.rg rgVar = org.telegram.ui.Components.rg.f32296e;
            emojiButton.j(rgVar, false);
            wa1 wa1Var = vu0Var.f43756c;
            View F = wa1Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = wa1Var.T(F);
            }
            org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
            if (fy0Var != null) {
                fy0Var.f();
                org.telegram.ui.Components.fy0 fy0Var2 = vu0Var.M;
                if (fy0Var2 != null && T != null) {
                    View view = T.f6432a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && fy0Var2.getDelegate() != view) {
                        vu0Var.M.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (vu0Var.L) {
                    vu0Var.j0();
                    vu0Var.k0(false);
                    vu0Var.m0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(rgVar, false);
            }
        }
    }

    public static void e0(vu0 vu0Var, org.telegram.ui.Cells.a6 a6Var) {
        vu0Var.X = a6Var;
        if (vu0Var.L) {
            vu0Var.j0();
            vu0Var.m0();
            return;
        }
        vu0Var.q0(1);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
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
                if (z10) {
                    i11 = this.T;
                } else {
                    i11 = this.S;
                }
                if (this.f43784x0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f43782w0 != this.f43784x0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.N.setLayoutParams(layoutParams);
                    this.R = layoutParams.height;
                    this.O.a();
                    this.f43759e.requestLayout();
                    boolean z13 = this.f43782w0;
                    if (z13 != this.f43784x0) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.f43782w0 = this.f43784x0;
                }
            }
            if (this.V != i10 || this.W != z10) {
                this.V = i10;
                this.W = z10;
                boolean z14 = this.U;
                org.telegram.ui.Cells.a6 a6Var = this.X;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && this.O.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.U = z12;
                } else {
                    this.U = false;
                }
                if (this.U && this.L) {
                    q0(0);
                }
                if (this.R != 0 && !(z11 = this.U) && z11 != z14 && !this.L) {
                    this.R = 0;
                    this.O.a();
                    this.f43759e.requestLayout();
                }
                if (this.U && this.P) {
                    this.P = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f43779u0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        lVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.Z;
        if (z10) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (this.E) {
                i11 = R.string.TodoAddTasksTitle;
            } else {
                i11 = R.string.TodoEditTitle;
            }
            lVar2.setTitle(LocaleController.getString(i11));
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
        this.actionBar.setActionBarMenuOnItemClick(new nu0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        if (z10) {
            if (this.E) {
                i10 = R.string.TodoAddTasksButton;
            } else {
                i10 = R.string.TodoEditTasksButton;
            }
            upperCase = LocaleController.getString(i10);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f43752a = n10.e(1, upperCase);
        this.f43754b = new tu0(this, context);
        dd ddVar = new dd(3, context, this);
        this.f43759e = ddVar;
        ddVar.setDelegate(this);
        dd ddVar2 = this.f43759e;
        this.fragmentView = ddVar2;
        ddVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f43756c = new wa1(context, 10, null);
        f2.l lVar3 = new f2.l();
        lVar3.f6463m = false;
        lVar3.C = false;
        lVar3.o(org.telegram.ui.Components.jr.h);
        lVar3.n(350L);
        this.f43756c.setItemAnimator(lVar3);
        this.f43756c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f43756c.getItemAnimator()).C = false;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        this.f43756c.setLayoutManager(j0Var);
        new f2.e0(new mh.f(this, 6)).d(this.f43756c);
        frameLayout.addView(this.f43756c, i7.f6.e(-1, -1, 51));
        this.f43756c.setAdapter(this.f43754b);
        this.f43756c.setOnItemClickListener(new j(this, 22));
        this.f43756c.setOnScrollListener(new m3(this, 24));
        org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(context, 4);
        this.h = g40Var;
        g40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Y) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, this.currentAccount, null, this.resourceProvider);
            this.M = fy0Var;
            fy0Var.f28573y = true;
            fy0Var.A = true;
            fy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.M, i7.f6.e(-2, 160, 51));
        }
        this.O = new nh.w3(this.f43759e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.fz fzVar = this.N;
            if (fzVar != null) {
                fzVar.L.f1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.X;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.X.getEditField().setTextColor(-1);
                this.X.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.fy0 fy0Var = this.M;
        if (fy0Var != null) {
            fy0Var.setDelegate(null);
            this.M.f();
        }
        int i11 = this.f43785y;
        this.f43781w[i11] = false;
        int i12 = i11 + 1;
        this.f43785y = i12;
        if (this.f43774r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f43774r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f43776s + 1;
                    this.f43776s = i10;
                }
                iArr[i13] = i10;
            }
            this.f43774r = iArr;
        }
        if (this.f43785y == this.v.length) {
            this.f43754b.u(this.f43767k0);
        }
        this.f43754b.o(this.f43767k0);
        r0();
        this.f43755b0 = false;
        this.f43757c0 = (this.f43766j0 + this.f43785y) - 1;
        this.f43754b.m(this.f43768l0);
    }

    public final void g0(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ag(this, f9, 3));
        ofFloat.addListener(new ou0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.a6.class, org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 4, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i13 = org.telegram.ui.ActionBar.g6.f23223m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 196608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23190k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i15 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43756c, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f43780v0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f43785y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.E && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.on.Y(this.A))) || i12 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (!TextUtils.equals(charSequenceArr[i14].toString(), todoList.list.get(i14).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.on.Y(this.A));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f43785y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.on.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.Z;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new zk0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f22714a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f43757c0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vu0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23403w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f43784x0) {
            this.N.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.N.setLayoutParams(layoutParams);
            this.R = layoutParams.height;
            this.f43782w0 = this.f43784x0;
            this.f43784x0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.Y) {
            if (this.L) {
                org.telegram.ui.Components.fz fzVar = this.N;
                fzVar.L.B0();
                fzVar.E.scrollTo(0, 0);
                fzVar.G(1);
                fzVar.M.h1(0, 0);
                this.N.t(false);
                if (z10) {
                    this.N.B();
                }
                this.f43784x0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.fz fzVar2 = this.N;
                if (fzVar2 != null && fzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.N.getMeasuredHeight());
                    ofFloat.addUpdateListener(new mu0(this, 1));
                    ofFloat.addListener(new ou0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.fz fzVar;
        org.telegram.ui.Components.tg emojiButton;
        if (!this.L && (fzVar = this.N) != null && fzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.X;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.rg.f32296e, false);
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
        int i10;
        this.O.f18780e = true;
        EditTextBoldCursor editField = this.X.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        q0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.P = true;
            w5 w5Var = this.f43779u0;
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            AndroidUtilities.runOnUIThread(w5Var, 100L);
        }
    }

    public final void n0(mg mgVar) {
        this.f43753a0 = mgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.L) {
            if (z10) {
                k0(true);
                return false;
            }
            return false;
        }
        return h0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f43755b0 && this.f43757c0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f43756c.getChildCount()) {
                    view = this.f43756c.getChildAt(i10);
                    this.f43756c.getClass();
                    if (RecyclerView.R(view) == this.f43757c0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.a6) {
                AndroidUtilities.runOnUIThread(new xg(5, ((org.telegram.ui.Cells.a6) view).getTextView()), 300L);
                this.f43757c0 = -1;
            }
            this.f43755b0 = false;
        }
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
            org.telegram.ui.Components.fz fzVar = this.N;
            if (fzVar != null) {
                this.f43759e.removeView(fzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.Y) {
            k0(false);
            org.telegram.ui.Components.fy0 fy0Var = this.M;
            if (fy0Var != null) {
                fy0Var.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.X;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.X.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.X.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tu0 tu0Var = this.f43754b;
        if (tu0Var != null) {
            tu0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f43780v0 = messageMedia;
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
            this.f43785y = size;
            this.f43783x = size;
            this.f43776s = 0;
            this.f43774r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f43785y;
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
                this.f43774r[i12] = tL_messageMediaToDo.todo.list.get(i12).f22537id;
                this.f43776s = Math.max(this.f43776s, this.f43774r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.F = todoList.others_can_complete;
            this.D = todoList.others_can_append;
            if (this.E) {
                this.f43785y = i11 + 1;
                r0();
                this.f43755b0 = true;
                int i13 = this.f43766j0;
                if (i10 < 0) {
                    i10 = this.f43785y - 1;
                }
                this.f43757c0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.Y) {
            if (i10 == 1) {
                org.telegram.ui.Components.fz fzVar = this.N;
                if (fzVar != null && fzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.fz fzVar2 = this.N;
                if (fzVar2 != null && fzVar2.Y0 != UserConfig.selectedAccount) {
                    this.f43759e.removeView(fzVar2);
                    this.N = null;
                }
                if (this.N == null) {
                    org.telegram.ui.Components.fz fzVar3 = new org.telegram.ui.Components.fz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.N = fzVar3;
                    fzVar3.f28638t2 = false;
                    fzVar3.Q0 = false;
                    fzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.N.setForseMultiwindowLayout(true);
                    }
                    this.N.setDelegate(new pu0(this));
                    this.f43759e.addView(this.N);
                }
                this.N.setVisibility(0);
                this.L = true;
                org.telegram.ui.Components.fz fzVar4 = this.N;
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
                    i11 = this.T;
                } else {
                    i11 = this.S;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar4.getLayoutParams();
                layoutParams.height = i11;
                fzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (a6Var = this.X) != null) {
                    AndroidUtilities.hideKeyboard(a6Var.getEditField());
                }
                this.R = i11;
                this.O.a();
                this.f43759e.requestLayout();
                org.telegram.ui.Components.tg emojiButton = this.X.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.rg.d, true);
                }
                if (!z10 && !this.U) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
                    ofFloat.addUpdateListener(new mu0(this, 0));
                    ofFloat.addListener(new ou0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.tg emojiButton2 = this.X.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.rg.f32296e, true);
            }
            org.telegram.ui.Components.fz fzVar5 = this.N;
            if (fzVar5 != null) {
                this.L = false;
                this.f43784x0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    fzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.R = 0;
            }
            this.O.a();
            this.f43759e.requestLayout();
        }
    }

    public final void r0() {
        this.f43758d0 = -1;
        this.f43760e0 = -1;
        this.f43764h0 = -1;
        this.f43765i0 = -1;
        this.f43762f0 = -1;
        this.f43763g0 = -1;
        this.f43766j0 = -1;
        this.f43767k0 = -1;
        this.f43770n0 = -1;
        this.f43771o0 = -1;
        this.f43773q0 = -1;
        this.f43775r0 = -1;
        this.f43772p0 = -1;
        this.f43777s0 = -1;
        this.m0 = -1;
        this.f43778t0 = 0;
        boolean z10 = this.Z;
        if (!z10 || !this.E) {
            this.f43758d0 = 0;
            this.f43760e0 = 1;
            this.f43764h0 = 2;
            this.f43778t0 = 4;
            this.f43765i0 = 3;
        }
        int i10 = this.f43785y;
        if (i10 != 0) {
            int i11 = this.f43778t0;
            this.f43766j0 = i11;
            this.f43778t0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f43778t0;
            this.f43778t0 = i12 + 1;
            this.f43767k0 = i12;
        }
        int i13 = this.f43778t0;
        int i14 = i13 + 1;
        this.f43778t0 = i14;
        this.f43768l0 = i13;
        if (!z10 || !this.E) {
            int i15 = i13 + 2;
            this.f43778t0 = i15;
            this.m0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f43778t0 = i16;
                this.f43775r0 = i15;
                if (this.F) {
                    this.f43778t0 = i13 + 4;
                    this.f43773q0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f43761f.f42787e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f43778t0;
                this.f43778t0 = i17 + 1;
                this.f43770n0 = i17;
            }
            int i18 = this.J;
            if (i18 != 1) {
                int i19 = this.f43778t0;
                this.f43778t0 = i19 + 1;
                this.f43771o0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f43778t0;
                this.f43778t0 = i20 + 1;
                this.f43772p0 = i20;
            }
            int i21 = this.f43778t0;
            int i22 = i21 + 1;
            this.f43778t0 = i22;
            this.f43777s0 = i21;
            if (this.H) {
                this.f43762f0 = i22;
                this.f43778t0 = i21 + 3;
                this.f43763g0 = i21 + 2;
            }
        }
    }
}
