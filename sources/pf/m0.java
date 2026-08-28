package pf;

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
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import kh.h8;
import kh.i9;
import of.v1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.b81;
import org.telegram.ui.xe1;
public final class m0 extends o2 {
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
    public static final int f45689a0 = -11;
    public static final int f45690b0 = -12;
    public static final int f45691c0 = -13;
    public static final int f45692d0 = -14;
    public static final int f45693e0 = -15;
    public static final int f45694f0 = -16;
    public static final int f45695g0 = -17;
    public static final int f45696h0 = -18;
    public static final int f45697i0 = -19;
    public static final int f45698j0 = -20;
    public static final int f45699k0 = -21;
    public int A;
    public final i0 B;
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
    public fr f45700a;
    public org.telegram.ui.ActionBar.w0 f45701b;
    public i51 f45702c;
    public v1 d;
    public FrameLayout f45703e;
    public EditTextBoldCursor f45704f;
    public View h;
    public b81 f45705n;
    public TextView f45706r;
    public ImageView f45707s;
    public x v;
    public boolean f45708w;
    public boolean f45709x;
    public String f45710y;

    public m0() {
        super(null);
        this.A = 0;
        this.B = new i0(this, 4);
        this.F = TL_account.TL_businessBotRights.makeDefault();
        this.I = null;
        this.J = new LongSparseArray();
        this.K = -4;
        this.L = true;
        this.M = false;
        this.N = false;
    }

    public static void T(m0 m0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        o2 U2;
        if (tL_error != null) {
            m0Var.f45700a.a(0.0f);
            oc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            m0Var.f45700a.a(0.0f);
            ll.p(R.string.UnknownError, oc.a0(m0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new ai1(14, m0Var, tLObject));
            }
            int i9 = iArr[0] + 1;
            iArr[0] = i9;
            if (i9 == arrayList.size()) {
                g.a(m0Var.currentAccount).b();
                m0Var.getMessagesController().clearFullUsers();
                m0Var.finishFragment();
                if (z10 && user != null) {
                    o2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        j2.q(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, oc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    j2.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, oc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void V(m0 m0Var, l41 l41Var, final View view) {
        if (l41Var.f30335g && !m0Var.v.h(l41Var)) {
            int i9 = l41Var.d;
            if (i9 == Q) {
                x xVar = m0Var.v;
                m0Var.E = true;
                xVar.h = true;
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == R) {
                x xVar2 = m0Var.v;
                m0Var.E = false;
                xVar2.h = false;
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == S) {
                m0Var.I = null;
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (l41Var.f48814a == 13) {
                TLRPC.User user = (TLRPC.User) m0Var.J.get(l41Var.f30350x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m0Var.getParentActivity(), 0, m0Var.resourceProvider);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        m0Var.showDialog(alertDialog$Builder.f22702a);
                        return;
                    }
                    m0Var.I = user;
                    AndroidUtilities.hideKeyboard(m0Var.f45704f);
                    m0Var.f45702c.U2.N(true);
                    m0Var.X(true);
                }
            } else if (i9 == T) {
                boolean z10 = !m0Var.L;
                m0Var.L = z10;
                ((s8) view).setChecked(z10);
                m0Var.f45702c.U2.N(true);
            } else if (i9 == U) {
                int i10 = -m0Var.K;
                m0Var.K = i10;
                AndroidUtilities.shakeViewSpring(view, i10);
            } else if (i9 == V) {
                TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((z1) view).c(z11, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var.F;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((z1) view).c(z12, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var.F;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((z1) view).c(z13, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var.F;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((z1) view).c(z14, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == Z) {
                boolean z15 = !m0Var.M;
                m0Var.M = z15;
                ((s8) view).setChecked(z15);
                m0Var.f45702c.U2.N(true);
            } else if (i9 == f45689a0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var.F;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((z1) view).c(z16, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == f45690b0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var.F;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((z1) view).c(z17, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == f45691c0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = m0Var.F;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((z1) view).c(z18, true);
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
            } else if (i9 == f45692d0) {
                m0Var.W(i9, !m0Var.F.edit_username, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((z1) view).c(z19, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45693e0) {
                boolean z19 = !m0Var.N;
                m0Var.N = z19;
                ((s8) view).setChecked(z19);
                m0Var.f45702c.U2.N(true);
            } else if (i9 == f45694f0) {
                m0Var.W(i9, !m0Var.F.view_gifts, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((z1) view).c(z192, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45695g0) {
                m0Var.W(i9, !m0Var.F.sell_gifts, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((z1) view).c(z192, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45696h0) {
                m0Var.W(i9, !m0Var.F.change_gift_settings, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((z1) view).c(z192, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45697i0) {
                m0Var.W(i9, !m0Var.F.transfer_and_upgrade_gifts, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((z1) view).c(z192, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45698j0) {
                m0Var.W(i9, !m0Var.F.transfer_stars, new Runnable(m0Var) {
                    public final m0 f45644b;

                    {
                        this.f45644b = m0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m0 m0Var2 = this.f45644b;
                                m0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((z1) view).c(z192, true);
                                m0Var2.f45702c.U2.N(true);
                                m0Var2.X(true);
                                return;
                            case 1:
                                m0 m0Var3 = this.f45644b;
                                m0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((z1) view).c(z20, true);
                                m0Var3.f45702c.U2.N(true);
                                m0Var3.X(true);
                                return;
                            case 2:
                                m0 m0Var4 = this.f45644b;
                                m0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((z1) view).c(z21, true);
                                m0Var4.f45702c.U2.N(true);
                                m0Var4.X(true);
                                return;
                            case 3:
                                m0 m0Var5 = this.f45644b;
                                m0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((z1) view).c(z22, true);
                                m0Var5.f45702c.U2.N(true);
                                m0Var5.X(true);
                                return;
                            case 4:
                                m0 m0Var6 = this.f45644b;
                                m0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((z1) view).c(z23, true);
                                m0Var6.f45702c.U2.N(true);
                                m0Var6.X(true);
                                return;
                            default:
                                m0 m0Var7 = this.f45644b;
                                m0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((z1) view).c(z24, true);
                                m0Var7.f45702c.U2.N(true);
                                m0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i9 == f45699k0) {
                m0Var.W(i9, !m0Var.F.manage_stories, new i0(m0Var, 0));
            }
        }
    }

    public final void W(int i9, boolean z10, final Runnable runnable) {
        if (!this.G && i9 == f45692d0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new b2(this) {
                public final m0 f45676b;

                {
                    this.f45676b = this;
                }

                @Override
                public final void f(c2 c2Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f45676b.G = true;
                            runnable.run();
                            return;
                        default:
                            this.f45676b.H = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.H && z10 && (i9 == f45695g0 || i9 == f45696h0 || i9 == f45697i0 || i9 == f45698j0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            c2 c2Var2 = alertDialog$Builder2.f22702a;
            c2Var2.N = string2;
            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new b2(this) {
                public final m0 f45676b;

                {
                    this.f45676b = this;
                }

                @Override
                public final void f(c2 c2Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f45676b.G = true;
                            runnable.run();
                            return;
                        default:
                            this.f45676b.H = true;
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

    public final void X(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f45701b == null) {
            return;
        }
        boolean Y2 = Y();
        this.f45701b.setEnabled(Y2);
        float f14 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f45701b.animate();
            if (Y2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (Y2) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (Y2) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f45701b;
        if (Y2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f45701b;
        if (Y2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f45701b;
        if (Y2) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean Y() {
        boolean z10;
        boolean z11;
        long j10;
        x xVar;
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
                    j10 = user.f22527id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.F.equals(tL_connectedBot.rights) && ((xVar = this.v) == null || !xVar.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void Z() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.f45700a.f28558c <= 0.0f) {
            if (!Y()) {
                finishFragment();
            } else if (this.v.k(this.f45702c)) {
                TLRPC.User user2 = this.I;
                if (user2 != null && ((tL_connectedBot = this.D) == null || tL_connectedBot.bot_id != user2.f22527id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.D;
                if (tL_connectedBot2 != null && ((user = this.I) == null || tL_connectedBot2.bot_id != user.f22527id)) {
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
                        tL_connectedBot3.bot_id = this.I.f22527id;
                        tL_connectedBot3.recipients = this.v.c();
                        this.D.rights = this.F;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i9), new eh.g(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void a0() {
        boolean z10;
        float f10;
        float f11;
        boolean z11 = this.f45708w;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.J;
        if (!e10 && !this.f45709x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f45709x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f45708w = z12;
            ViewPropertyAnimator animate = this.f45706r.animate();
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z12) {
                f11 = -AndroidUtilities.dp(8.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f11).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = this.f45707s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(grVar).start();
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f45700a = new fr(mutate, new jp(f6.w0(null, i11, false)));
        this.f45701b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45700a);
        X(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f45704f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f45704f.setHintTextColor(f6.w0(null, f6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f45704f;
        int i12 = f6.G6;
        editTextBoldCursor2.setTextColor(f6.w0(null, i12, false));
        this.f45704f.setBackgroundDrawable(null);
        this.f45704f.setMaxLines(1);
        this.f45704f.setLines(1);
        this.f45704f.setPadding(0, 0, 0, 0);
        this.f45704f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f45704f;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        editTextBoldCursor3.setGravity(i9 | 48);
        this.f45704f.setInputType(180224);
        this.f45704f.setImeOptions(6);
        this.f45704f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f45704f.setCursorColor(f6.w0(null, i12, false));
        this.f45704f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f45704f.setCursorWidth(1.5f);
        this.f45704f.setOnEditorActionListener(new gh.k(this, 1));
        this.f45704f.addTextChangedListener(new bh.f(this, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45703e = frameLayout2;
        frameLayout2.addView(this.f45704f, e6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f45703e;
        int i13 = f6.f23001d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(f6.f23002d7));
        FrameLayout frameLayout4 = this.f45703e;
        View view2 = this.h;
        float f10 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        int i14 = 21;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 21;
        }
        float f11 = i10;
        if (!z10) {
            i14 = 0;
        }
        frameLayout4.addView(view2, e6.d(-1, f10, 87, f11, 0.0f, i14, 0.0f));
        b81 b81Var = new b81(context, 7);
        this.f45705n = b81Var;
        b81Var.setBackgroundColor(getThemedColor(i13));
        TextView textView = new TextView(context);
        this.f45706r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f45706r.setTextSize(1, 14.0f);
        TextView textView2 = this.f45706r;
        int i15 = f6.f23386z6;
        textView2.setTextColor(getThemedColor(i15));
        this.f45705n.addView(this.f45706r, e6.e(-2, -2, 17));
        this.f45707s = new ImageView(context);
        h8 h8Var = new h8(getThemedColor(i15));
        this.f45707s.setScaleType(ImageView.ScaleType.CENTER);
        this.f45707s.setImageDrawable(h8Var);
        this.f45705n.addView(this.f45707s, e6.e(-2, -2, 17));
        this.f45707s.setAlpha(0.0f);
        this.f45707s.setTranslationY(AndroidUtilities.dp(8.0f));
        v1 v1Var = new v1(true);
        this.d = v1Var;
        v1Var.f19524a = new n2.p(this, 13);
        x xVar = new x(this, new i0(this, 3));
        this.v = xVar;
        TL_account.TL_connectedBot tL_connectedBot = this.D;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        xVar.i(tL_businessBotRecipients);
        i51 i51Var = new i51(this, new b8(this, 18), new k0(this, 3), null);
        this.f45702c = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.f45702c;
        i51Var2.U2.f35188r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.f45702c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (Y()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new k0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new k0(this, 1));
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
        } else if (this.I != null || Y() || (this.d.d.isEmpty() && this.d.f19527e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new k0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f22702a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.O && !this.P) {
            this.O = true;
            g.a(this.currentAccount).c(new i9(this, 12));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f45702c.setPadding(0, 0, 0, i12);
        this.f45702c.setClipToPadding(false);
    }
}
