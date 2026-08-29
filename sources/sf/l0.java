package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import nh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n31;
import org.telegram.ui.th;
public final class l0 extends o2 {
    public static final int Q = -1;
    public static final int R = -2;
    public static final int S = -3;
    public static final int T = -4;
    public static final int U = -5;
    public static final int V = -6;
    public static final int W = -7;
    public static final int X = -8;
    public static final int Y = -9;
    public static final int Z = -10;
    public static final int f47849a0 = -11;
    public static final int f47850b0 = -12;
    public static final int f47851c0 = -13;
    public static final int f47852d0 = -14;
    public static final int f47853e0 = -15;
    public static final int f47854f0 = -16;
    public static final int f47855g0 = -17;
    public static final int f47856h0 = -18;
    public static final int f47857i0 = -19;
    public static final int f47858j0 = -20;
    public static final int f47859k0 = -21;
    public int A;
    public final h0 B;
    public TL_account.connectedBots C;
    public TL_account.TL_connectedBot D;
    public boolean E;
    public TL_account.TL_businessBotRights F;
    public boolean G;
    public boolean H;
    public TLRPC.User I;
    public final LongSparseArray J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public ir f47860a;
    public org.telegram.ui.ActionBar.w0 f47861b;
    public u51 f47862c;
    public rf.k1 d;
    public FrameLayout f47863e;
    public EditTextBoldCursor f47864f;
    public View h;
    public n31 f47865n;
    public TextView f47866r;
    public ImageView f47867s;
    public w v;
    public boolean f47868w;
    public boolean f47869x;
    public String f47870y;

    public l0() {
        super(null);
        this.A = 0;
        this.B = new h0(this, 4);
        this.F = TL_account.TL_businessBotRights.makeDefault();
        this.I = null;
        this.J = new LongSparseArray();
        this.K = -4;
        this.L = true;
        this.M = false;
        this.N = false;
    }

    public static void U(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        o2 U2;
        if (tL_error != null) {
            l0Var.f47860a.a(0.0f);
            tc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            l0Var.f47860a.a(0.0f);
            x3.s(R.string.UnknownError, tc.a0(l0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new org.telegram.ui.web.y(28, l0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                g.a(l0Var.currentAccount).b();
                l0Var.getMessagesController().clearFullUsers();
                l0Var.finishFragment();
                if (z10 && user != null) {
                    o2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        th.r(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, tc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    th.r(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, tc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(l0 l0Var, w41 w41Var, final View view) {
        if (w41Var.f34296g && !l0Var.v.h(w41Var)) {
            int i10 = w41Var.d;
            if (i10 == Q) {
                w wVar = l0Var.v;
                l0Var.E = true;
                wVar.h = true;
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == R) {
                w wVar2 = l0Var.v;
                l0Var.E = false;
                wVar2.h = false;
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == S) {
                l0Var.I = null;
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (w41Var.f50845a == 13) {
                TLRPC.User user = (TLRPC.User) l0Var.J.get(w41Var.f34311x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l0Var.getParentActivity(), 0, l0Var.resourceProvider);
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        l0Var.showDialog(alertDialog$Builder.f22714a);
                        return;
                    }
                    l0Var.I = user;
                    AndroidUtilities.hideKeyboard(l0Var.f47864f);
                    l0Var.f47862c.U2.N(true);
                    l0Var.Y(true);
                }
            } else if (i10 == T) {
                boolean z10 = !l0Var.L;
                l0Var.L = z10;
                ((p8) view).setChecked(z10);
                l0Var.f47862c.U2.N(true);
            } else if (i10 == U) {
                int i11 = -l0Var.K;
                l0Var.K = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == V) {
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var.F;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((y1) view).c(z11, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.F;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((y1) view).c(z12, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.F;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((y1) view).c(z13, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.F;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((y1) view).c(z14, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == Z) {
                boolean z15 = !l0Var.M;
                l0Var.M = z15;
                ((p8) view).setChecked(z15);
                l0Var.f47862c.U2.N(true);
            } else if (i10 == f47849a0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.F;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((y1) view).c(z16, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == f47850b0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.F;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((y1) view).c(z17, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == f47851c0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = l0Var.F;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((y1) view).c(z18, true);
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
            } else if (i10 == f47852d0) {
                l0Var.X(i10, !l0Var.F.edit_username, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((y1) view).c(z19, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47853e0) {
                boolean z19 = !l0Var.N;
                l0Var.N = z19;
                ((p8) view).setChecked(z19);
                l0Var.f47862c.U2.N(true);
            } else if (i10 == f47854f0) {
                l0Var.X(i10, !l0Var.F.view_gifts, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((y1) view).c(z192, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47855g0) {
                l0Var.X(i10, !l0Var.F.sell_gifts, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((y1) view).c(z192, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47856h0) {
                l0Var.X(i10, !l0Var.F.change_gift_settings, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((y1) view).c(z192, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47857i0) {
                l0Var.X(i10, !l0Var.F.transfer_and_upgrade_gifts, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((y1) view).c(z192, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47858j0) {
                l0Var.X(i10, !l0Var.F.transfer_stars, new Runnable(l0Var) {
                    public final l0 f47812b;

                    {
                        this.f47812b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f47812b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((y1) view).c(z192, true);
                                l0Var2.f47862c.U2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f47812b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((y1) view).c(z20, true);
                                l0Var3.f47862c.U2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f47812b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((y1) view).c(z21, true);
                                l0Var4.f47862c.U2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f47812b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((y1) view).c(z22, true);
                                l0Var5.f47862c.U2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f47812b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((y1) view).c(z23, true);
                                l0Var6.f47862c.U2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f47812b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((y1) view).c(z24, true);
                                l0Var7.f47862c.U2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f47859k0) {
                l0Var.X(i10, !l0Var.F.manage_stories, new h0(l0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.G && i10 == f47852d0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new b2(this) {
                public final l0 f47833b;

                {
                    this.f47833b = this;
                }

                @Override
                public final void g(c2 c2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f47833b.G = true;
                            runnable.run();
                            return;
                        default:
                            this.f47833b.H = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.H && z10 && (i10 == f47855g0 || i10 == f47856h0 || i10 == f47857i0 || i10 == f47858j0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            c2 c2Var2 = alertDialog$Builder2.f22714a;
            c2Var2.N = string2;
            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new b2(this) {
                public final l0 f47833b;

                {
                    this.f47833b = this;
                }

                @Override
                public final void g(c2 c2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f47833b.G = true;
                            runnable.run();
                            return;
                        default:
                            this.f47833b.H = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.o();
        } else {
            runnable.run();
        }
    }

    public final void Y(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f47861b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f47861b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f47861b.animate();
            if (Z2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (Z2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (Z2) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f47861b;
        if (Z2) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f47861b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f47861b;
        if (Z2) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean Z() {
        boolean z10;
        boolean z11;
        long j10;
        w wVar;
        if (this.P) {
            TLRPC.User user = this.I;
            if (user != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.D;
            if (tL_connectedBot != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                long j11 = 0;
                if (user == null) {
                    j10 = 0;
                } else {
                    j10 = user.f22539id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.F.equals(tL_connectedBot.rights) && ((wVar = this.v) == null || !wVar.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void a0() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.f47860a.f29455c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f47862c)) {
                TLRPC.User user2 = this.I;
                if (user2 != null && ((tL_connectedBot = this.D) == null || tL_connectedBot.bot_id != user2.f22539id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.D;
                if (tL_connectedBot2 != null && ((user = this.I) == null || tL_connectedBot2.bot_id != user.f22539id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().getInputUser(this.D.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.I != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.F;
                    updateconnectedbot2.bot = getMessagesController().getInputUser(this.I);
                    updateconnectedbot2.recipients = this.v.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.D;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.I.f22539id;
                        tL_connectedBot3.recipients = this.v.c();
                        this.D.rights = this.F;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new hh.g(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void b0() {
        boolean z10;
        float f9;
        float f10;
        boolean z11 = this.f47868w;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.J;
        if (!e10 && !this.f47869x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f47869x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f47868w = z12;
            ViewPropertyAnimator animate = this.f47866r.animate();
            float f11 = 1.0f;
            float f12 = 0.0f;
            if (z12) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (z12) {
                f10 = -AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f10).setDuration(320L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
            ViewPropertyAnimator animate2 = this.f47867s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(jrVar).start();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f47860a = new ir(mutate, new np(g6.w0(null, i12, false)));
        this.f47861b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f47860a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f47864f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f47864f.setHintTextColor(g6.w0(null, g6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f47864f;
        int i13 = g6.G6;
        editTextBoldCursor2.setTextColor(g6.w0(null, i13, false));
        this.f47864f.setBackgroundDrawable(null);
        this.f47864f.setMaxLines(1);
        this.f47864f.setLines(1);
        this.f47864f.setPadding(0, 0, 0, 0);
        this.f47864f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f47864f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f47864f.setInputType(180224);
        this.f47864f.setImeOptions(6);
        this.f47864f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f47864f.setCursorColor(g6.w0(null, i13, false));
        this.f47864f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f47864f.setCursorWidth(1.5f);
        this.f47864f.setOnEditorActionListener(new jh.j(this, 1));
        this.f47864f.addTextChangedListener(new bh.c(this, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47863e = frameLayout2;
        frameLayout2.addView(this.f47864f, f6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f47863e;
        int i14 = g6.f23062d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.f23063d7));
        FrameLayout frameLayout4 = this.f47863e;
        View view2 = this.h;
        float f9 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        int i15 = 21;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (!z10) {
            i15 = 0;
        }
        frameLayout4.addView(view2, f6.d(-1, f9, 87, f10, 0.0f, i15, 0.0f));
        n31 n31Var = new n31(context, 10);
        this.f47865n = n31Var;
        n31Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f47866r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f47866r.setTextSize(1, 14.0f);
        TextView textView2 = this.f47866r;
        int i16 = g6.f23450z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f47865n.addView(this.f47866r, f6.e(-2, -2, 17));
        this.f47867s = new ImageView(context);
        v7 v7Var = new v7(getThemedColor(i16));
        this.f47867s.setScaleType(ImageView.ScaleType.CENTER);
        this.f47867s.setImageDrawable(v7Var);
        this.f47865n.addView(this.f47867s, f6.e(-2, -2, 17));
        this.f47867s.setAlpha(0.0f);
        this.f47867s.setTranslationY(AndroidUtilities.dp(8.0f));
        rf.k1 k1Var = new rf.k1(true);
        this.d = k1Var;
        k1Var.f47277a = new o1.a(this, 21);
        w wVar = new w(this, new h0(this, 3));
        this.v = wVar;
        TL_account.TL_connectedBot tL_connectedBot = this.D;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        wVar.i(tL_businessBotRecipients);
        u51 u51Var = new u51(this, new t4(this, 19), new j0(this, 3), null);
        this.f47862c = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.f47862c;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.f47862c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (Z()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new j0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new j0(this, 1));
                showDialog(alertDialog$Builder.f22714a);
                return false;
            }
        } else if (this.I != null || Z() || (this.d.d.isEmpty() && this.d.f47280e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new j0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f22714a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.O && !this.P) {
            this.O = true;
            g.a(this.currentAccount).c(new nh.b0(this, 19));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f47862c.setPadding(0, 0, 0, i13);
        this.f47862c.setClipToPadding(false);
    }
}
