package vf;

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
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h51;
import org.telegram.ui.yh;
import qh.c4;
import qh.x6;
public final class l0 extends p2 {
    public static final int R = -1;
    public static final int S = -2;
    public static final int T = -3;
    public static final int U = -4;
    public static final int V = -5;
    public static final int W = -6;
    public static final int X = -7;
    public static final int Y = -8;
    public static final int Z = -9;
    public static final int f49134a0 = -10;
    public static final int f49135b0 = -11;
    public static final int f49136c0 = -12;
    public static final int f49137d0 = -13;
    public static final int f49138e0 = -14;
    public static final int f49139f0 = -15;
    public static final int f49140g0 = -16;
    public static final int f49141h0 = -17;
    public static final int f49142i0 = -18;
    public static final int f49143j0 = -19;
    public static final int f49144k0 = -20;
    public static final int f49145l0 = -21;
    public int B;
    public final g0 C;
    public TL_account.connectedBots D;
    public TL_account.TL_connectedBot E;
    public boolean F;
    public TL_account.TL_businessBotRights G;
    public boolean H;
    public boolean I;
    public TLRPC.User J;
    public final LongSparseArray K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public or f49146a;
    public org.telegram.ui.ActionBar.w0 f49147b;
    public h61 f49148c;
    public uf.k1 d;
    public FrameLayout f49149e;
    public EditTextBoldCursor f49150f;
    public View h;
    public h51 f49151n;
    public TextView f49152r;
    public ImageView f49153s;
    public v v;
    public boolean f49154w;
    public boolean f49155x;
    public String f49156y;

    public l0() {
        super(null);
        this.B = 0;
        this.C = new g0(this, 4);
        this.G = TL_account.TL_businessBotRights.makeDefault();
        this.J = null;
        this.K = new LongSparseArray();
        this.L = -4;
        this.M = true;
        this.N = false;
        this.O = false;
    }

    public static void U(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        p2 U2;
        if (tL_error != null) {
            l0Var.f49146a.a(0.0f);
            qc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            l0Var.f49146a.a(0.0f);
            y3.s(R.string.UnknownError, qc.a0(l0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new k0(0, l0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(l0Var.currentAccount).b();
                l0Var.getMessagesController().clearFullUsers();
                l0Var.finishFragment();
                if (z4 && user != null) {
                    p2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        yh.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, qc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    yh.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, qc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(l0 l0Var, org.telegram.ui.Components.h51 h51Var, final View view) {
        if (h51Var.f27371g && !l0Var.v.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 == R) {
                v vVar = l0Var.v;
                l0Var.F = true;
                vVar.h = true;
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == S) {
                v vVar2 = l0Var.v;
                l0Var.F = false;
                vVar2.h = false;
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == T) {
                l0Var.J = null;
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (h51Var.f2505a == 13) {
                TLRPC.User user = (TLRPC.User) l0Var.K.get(h51Var.f27386x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l0Var.getParentActivity(), 0, l0Var.resourceProvider);
                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        l0Var.showDialog(alertDialog$Builder.f21168a);
                        return;
                    }
                    l0Var.J = user;
                    AndroidUtilities.hideKeyboard(l0Var.f49150f);
                    l0Var.f49148c.V2.N(true);
                    l0Var.Y(true);
                }
            } else if (i10 == U) {
                boolean z4 = !l0Var.M;
                l0Var.M = z4;
                ((r8) view).setChecked(z4);
                l0Var.f49148c.V2.N(true);
            } else if (i10 == V) {
                int i11 = -l0Var.L;
                l0Var.L = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                boolean z10 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z10;
                ((z1) view).c(z10, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                boolean z11 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z11;
                ((z1) view).c(z11, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                boolean z12 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z12;
                ((z1) view).c(z12, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                boolean z13 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z13;
                ((z1) view).c(z13, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == f49134a0) {
                boolean z14 = !l0Var.N;
                l0Var.N = z14;
                ((r8) view).setChecked(z14);
                l0Var.f49148c.V2.N(true);
            } else if (i10 == f49135b0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                boolean z15 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z15;
                ((z1) view).c(z15, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == f49136c0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                boolean z16 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z16;
                ((z1) view).c(z16, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == f49137d0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = l0Var.G;
                boolean z17 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z17;
                ((z1) view).c(z17, true);
                l0Var.f49148c.V2.N(true);
                l0Var.Y(true);
            } else if (i10 == f49138e0) {
                l0Var.X(i10, !l0Var.G.edit_username, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z18 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z18;
                                ((z1) view).c(z18, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49139f0) {
                boolean z18 = !l0Var.O;
                l0Var.O = z18;
                ((r8) view).setChecked(z18);
                l0Var.f49148c.V2.N(true);
            } else if (i10 == f49140g0) {
                l0Var.X(i10, !l0Var.G.view_gifts, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((z1) view).c(z182, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49141h0) {
                l0Var.X(i10, !l0Var.G.sell_gifts, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((z1) view).c(z182, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49142i0) {
                l0Var.X(i10, !l0Var.G.change_gift_settings, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((z1) view).c(z182, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49143j0) {
                l0Var.X(i10, !l0Var.G.transfer_and_upgrade_gifts, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((z1) view).c(z182, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49144k0) {
                l0Var.X(i10, !l0Var.G.transfer_stars, new Runnable(l0Var) {
                    public final l0 f49083b;

                    {
                        this.f49083b = l0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l0 l0Var2 = this.f49083b;
                                l0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((z1) view).c(z182, true);
                                l0Var2.f49148c.V2.N(true);
                                l0Var2.Y(true);
                                return;
                            case 1:
                                l0 l0Var3 = this.f49083b;
                                l0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((z1) view).c(z19, true);
                                l0Var3.f49148c.V2.N(true);
                                l0Var3.Y(true);
                                return;
                            case 2:
                                l0 l0Var4 = this.f49083b;
                                l0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((z1) view).c(z20, true);
                                l0Var4.f49148c.V2.N(true);
                                l0Var4.Y(true);
                                return;
                            case 3:
                                l0 l0Var5 = this.f49083b;
                                l0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((z1) view).c(z21, true);
                                l0Var5.f49148c.V2.N(true);
                                l0Var5.Y(true);
                                return;
                            case 4:
                                l0 l0Var6 = this.f49083b;
                                l0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((z1) view).c(z22, true);
                                l0Var6.f49148c.V2.N(true);
                                l0Var6.Y(true);
                                return;
                            default:
                                l0 l0Var7 = this.f49083b;
                                l0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((z1) view).c(z23, true);
                                l0Var7.f49148c.V2.N(true);
                                l0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f49145l0) {
                l0Var.X(i10, !l0Var.G.manage_stories, new g0(l0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z4, final Runnable runnable) {
        if (!this.H && i10 == f49138e0 && z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.J)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new c2(this) {
                public final l0 f49104b;

                {
                    this.f49104b = this;
                }

                @Override
                public final void j(d2 d2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f49104b.H = true;
                            runnable.run();
                            return;
                        default:
                            this.f49104b.I = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.I && z4 && (i10 == f49141h0 || i10 == f49142i0 || i10 == f49143j0 || i10 == f49144k0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            d2 d2Var2 = alertDialog$Builder2.f21168a;
            d2Var2.O = string2;
            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.J)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new c2(this) {
                public final l0 f49104b;

                {
                    this.f49104b = this;
                }

                @Override
                public final void j(d2 d2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f49104b.H = true;
                            runnable.run();
                            return;
                        default:
                            this.f49104b.I = true;
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

    public final void Y(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f49147b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f49147b.setEnabled(Z2);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f49147b.animate();
            if (Z2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (Z2) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (Z2) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f49147b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f49147b;
        if (Z2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f49147b;
        if (Z2) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean Z() {
        boolean z4;
        boolean z10;
        long j10;
        v vVar;
        if (this.Q) {
            TLRPC.User user = this.J;
            if (user != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.E;
            if (tL_connectedBot != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 == z10) {
                long j11 = 0;
                if (user == null) {
                    j10 = 0;
                } else {
                    j10 = user.f20992id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.G.equals(tL_connectedBot.rights) && ((vVar = this.v) == null || !vVar.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void a0() {
        boolean z4;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.f49146a.f29874c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f49148c)) {
                TLRPC.User user2 = this.J;
                if (user2 != null && ((tL_connectedBot = this.E) == null || tL_connectedBot.bot_id != user2.f20992id)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.E;
                if (tL_connectedBot2 != null && ((user = this.J) == null || tL_connectedBot2.bot_id != user.f20992id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().getInputUser(this.E.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.J != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.G;
                    updateconnectedbot2.bot = getMessagesController().getInputUser(this.J);
                    updateconnectedbot2.recipients = this.v.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.E;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.J.f20992id;
                        tL_connectedBot3.recipients = this.v.c();
                        this.E.rights = this.G;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new kh.g(this, iArr, arrayList, z4, user2));
                }
            }
        }
    }

    public final void b0() {
        boolean z4;
        float f10;
        float f11;
        boolean z10 = this.f49154w;
        boolean e6 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.K;
        if (!e6 && !this.f49155x && longSparseArray.size() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z10 != z4) {
            if (!this.d.e() && !this.f49155x && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.f49154w = z11;
            ViewPropertyAnimator animate = this.f49152r.animate();
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z11) {
                f11 = -AndroidUtilities.dp(8.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f11).setDuration(320L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).start();
            ViewPropertyAnimator animate2 = this.f49153s.animate();
            if (!z11) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z11) {
                f13 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(prVar).start();
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
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = k6.f21983v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f49146a = new or(mutate, new tp(k6.w0(null, i12, false)));
        this.f49147b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49146a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f49150f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f49150f.setHintTextColor(k6.w0(null, k6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f49150f;
        int i13 = k6.G6;
        editTextBoldCursor2.setTextColor(k6.w0(null, i13, false));
        this.f49150f.setBackgroundDrawable(null);
        this.f49150f.setMaxLines(1);
        this.f49150f.setLines(1);
        this.f49150f.setPadding(0, 0, 0, 0);
        this.f49150f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f49150f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f49150f.setInputType(180224);
        this.f49150f.setImeOptions(6);
        this.f49150f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f49150f.setCursorColor(k6.w0(null, i13, false));
        this.f49150f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f49150f.setCursorWidth(1.5f);
        this.f49150f.setOnEditorActionListener(new mh.j(this, 1));
        this.f49150f.addTextChangedListener(new eh.c(this, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f49149e = frameLayout2;
        frameLayout2.addView(this.f49150f, c6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f49149e;
        int i14 = k6.f21661d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(k6.f21662d7));
        FrameLayout frameLayout4 = this.f49149e;
        View view2 = this.h;
        float f10 = 1.0f / AndroidUtilities.density;
        boolean z4 = LocaleController.isRTL;
        int i15 = 21;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 21;
        }
        float f11 = i11;
        if (!z4) {
            i15 = 0;
        }
        frameLayout4.addView(view2, c6.d(-1, f10, 87, f11, 0.0f, i15, 0.0f));
        h51 h51Var = new h51(context, 10);
        this.f49151n = h51Var;
        h51Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f49152r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f49152r.setTextSize(1, 14.0f);
        TextView textView2 = this.f49152r;
        int i16 = k6.f22055z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f49151n.addView(this.f49152r, c6.e(-2, -2, 17));
        this.f49153s = new ImageView(context);
        x6 x6Var = new x6(getThemedColor(i16));
        this.f49153s.setScaleType(ImageView.ScaleType.CENTER);
        this.f49153s.setImageDrawable(x6Var);
        this.f49151n.addView(this.f49153s, c6.e(-2, -2, 17));
        this.f49153s.setAlpha(0.0f);
        this.f49153s.setTranslationY(AndroidUtilities.dp(8.0f));
        uf.k1 k1Var = new uf.k1(true);
        this.d = k1Var;
        k1Var.f48654a = new org.telegram.ui.Cells.f1(this, 24);
        v vVar = new v(this, new g0(this, 3));
        this.v = vVar;
        TL_account.TL_connectedBot tL_connectedBot = this.E;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        vVar.i(tL_businessBotRecipients);
        h61 h61Var = new h61(this, new c4(this, 19), new i0(this, 3), null);
        this.f49148c = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.f49148c;
        h61Var2.V2.f32651r = false;
        frameLayout.addView(h61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49148c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (Z()) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new i0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new i0(this, 1));
                showDialog(alertDialog$Builder.f21168a);
                return false;
            }
        } else if (this.J != null || Z() || (this.d.d.isEmpty() && this.d.f48657e.isEmpty())) {
            return super.onBackPressed(z4);
        } else {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new i0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f21168a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.P && !this.Q) {
            this.P = true;
            f.a(this.currentAccount).c(new org.telegram.ui.web.d1(this, 19));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f49148c.setPadding(0, 0, 0, i13);
        this.f49148c.setClipToPadding(false);
    }
}
