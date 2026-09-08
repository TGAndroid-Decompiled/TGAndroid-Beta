package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class vk0 extends org.telegram.ui.Components.kl0 {
    public final Context f41611c;
    public final NotificationsSettingsActivity d;

    public vk0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.f41611c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (b10 != notificationsSettingsActivity.f33520x && b10 != notificationsSettingsActivity.f33521y && b10 != notificationsSettingsActivity.E && b10 != notificationsSettingsActivity.K && b10 != notificationsSettingsActivity.M && b10 != notificationsSettingsActivity.S && b10 != notificationsSettingsActivity.N && b10 != notificationsSettingsActivity.L && b10 != notificationsSettingsActivity.R && b10 != notificationsSettingsActivity.F && b10 != notificationsSettingsActivity.G && b10 != notificationsSettingsActivity.O && b10 != notificationsSettingsActivity.f33517r && b10 != notificationsSettingsActivity.f33518s && b10 != notificationsSettingsActivity.T && b10 != notificationsSettingsActivity.J) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.U;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i10 != notificationsSettingsActivity.K && i10 != notificationsSettingsActivity.M && i10 != notificationsSettingsActivity.S && i10 != notificationsSettingsActivity.G && i10 != notificationsSettingsActivity.N && i10 != notificationsSettingsActivity.E && i10 != notificationsSettingsActivity.f33520x && i10 != notificationsSettingsActivity.f33517r) {
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i10 != i11) {
                i12 = notificationsSettingsActivity.inappVibrateRow;
                if (i10 != i12 && i10 != notificationsSettingsActivity.f33519w) {
                    i13 = notificationsSettingsActivity.inappPreviewRow;
                    if (i10 != i13) {
                        i14 = notificationsSettingsActivity.contactJoinedRow;
                        if (i10 != i14) {
                            i15 = notificationsSettingsActivity.pinnedMessageRow;
                            if (i10 != i15 && i10 != notificationsSettingsActivity.v) {
                                i16 = notificationsSettingsActivity.badgeNumberMutedRow;
                                if (i10 != i16) {
                                    i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                    if (i10 != i17) {
                                        i18 = notificationsSettingsActivity.badgeNumberShowRow;
                                        if (i10 != i18) {
                                            i19 = notificationsSettingsActivity.inappPriorityRow;
                                            if (i10 != i19) {
                                                i20 = notificationsSettingsActivity.inchatSoundRow;
                                                if (i10 != i20 && i10 != notificationsSettingsActivity.P) {
                                                    i21 = notificationsSettingsActivity.accountsAllRow;
                                                    if (i10 != i21) {
                                                        i22 = notificationsSettingsActivity.resetNotificationsRow;
                                                        if (i10 != i22) {
                                                            i23 = notificationsSettingsActivity.privateRow;
                                                            if (i10 != i23) {
                                                                i24 = notificationsSettingsActivity.groupRow;
                                                                if (i10 != i24) {
                                                                    i25 = notificationsSettingsActivity.channelsRow;
                                                                    if (i10 != i25) {
                                                                        i26 = notificationsSettingsActivity.storiesRow;
                                                                        if (i10 != i26) {
                                                                            i27 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i10 != i27) {
                                                                                if (i10 != notificationsSettingsActivity.J && i10 != notificationsSettingsActivity.f33521y && i10 != notificationsSettingsActivity.L && i10 != notificationsSettingsActivity.R && i10 != notificationsSettingsActivity.F && i10 != notificationsSettingsActivity.O && i10 != notificationsSettingsActivity.T) {
                                                                                    if (i10 == notificationsSettingsActivity.f33518s) {
                                                                                        return 6;
                                                                                    }
                                                                                    return 5;
                                                                                }
                                                                                return 4;
                                                                            }
                                                                            return 3;
                                                                        }
                                                                        return 3;
                                                                    }
                                                                    return 3;
                                                                }
                                                                return 3;
                                                            }
                                                            return 3;
                                                        }
                                                        return 2;
                                                    }
                                                    return 1;
                                                }
                                                return 1;
                                            }
                                            return 1;
                                        }
                                        return 1;
                                    }
                                    return 1;
                                }
                                return 1;
                            }
                            return 1;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vk0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.f41611c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
        } else if (i10 == 1) {
            f6Var2 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.w8(context, f6Var2);
        } else if (i10 != 2) {
            if (i10 == 3) {
                f6Var3 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.f41611c, f6Var3, true);
            } else if (i10 != 4) {
                if (i10 != 5) {
                    f6Var5 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
                    l4Var = new org.telegram.ui.Cells.e9(context, f6Var5);
                } else {
                    f6Var4 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
                    l4Var = new org.telegram.ui.Cells.ea(context, 0, f6Var4);
                }
            } else {
                l4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
        } else {
            l4Var = new org.telegram.ui.Cells.d9(context);
        }
        return new s4.c1(l4Var);
    }
}
