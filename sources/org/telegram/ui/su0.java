package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class su0 extends org.telegram.ui.Components.sk0 {
    public final Context f41649c;
    public final PrivacyControlActivity d;

    public su0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f41649c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f33725a0) {
            i16 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.i5.r(i16).t(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.Y) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f33730d0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f33741n0 && b10 != privacyControlActivity.f33742o0 && b10 != privacyControlActivity.f33739l0 && b10 != privacyControlActivity.f33738k0) {
                        if (privacyControlActivity.f33754x != 12 || !privacyControlActivity.y0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.N && b10 != privacyControlActivity.f33733f0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.S && b10 != privacyControlActivity.R) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final int E(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (longValue > 0) {
                i10++;
            } else {
                TLRPC.Chat L0 = this.d.getMessagesController().L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    i10 += L0.participants_count;
                }
            }
        }
        return i10;
    }

    @Override
    public final int b() {
        return this.d.f33744q0;
    }

    @Override
    public final int d(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 != privacyControlActivity.R && i10 != privacyControlActivity.S && i10 != privacyControlActivity.f33725a0 && i10 != privacyControlActivity.f33730d0) {
            if (i10 != privacyControlActivity.T && i10 != privacyControlActivity.O && i10 != privacyControlActivity.P && i10 != privacyControlActivity.f33736i0 && i10 != privacyControlActivity.f33727b0 && i10 != privacyControlActivity.Y && i10 != privacyControlActivity.f33729c0 && i10 != privacyControlActivity.f33731e0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f33737j0 && i10 != privacyControlActivity.f33743p0) {
                    if (i10 != privacyControlActivity.M && i10 != privacyControlActivity.f33734g0 && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.U) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.N) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f33733f0 && i10 != privacyControlActivity.V && i10 != privacyControlActivity.W) {
                                    if (i10 == privacyControlActivity.L) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.X) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.m0 && i10 != privacyControlActivity.f33741n0 && i10 != privacyControlActivity.f33742o0 && i10 != privacyControlActivity.f33738k0 && i10 != privacyControlActivity.f33739l0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f33735h0) {
                                                            return 10;
                                                        }
                                                        return 0;
                                                    }
                                                    return 8;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 3;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.su0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.Cells.x9 x9Var;
        org.telegram.ui.ActionBar.p6 p6Var3;
        Context context = this.f41649c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                x9Var2.setCanDisable(true);
                x9Var = x9Var2;
                b9Var = x9Var;
                break;
            case 1:
                b9Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                b9Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 3:
                b9Var = new org.telegram.ui.Cells.m6(context, null);
                break;
            case 4:
                b9Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                b9Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f33749t0 = p8Var;
                if (privacyControlActivity.f33753w0 == null) {
                    p8Var.o(2131232046, org.telegram.messenger.cd.a0(null, null, 2131745534, new Object[0]), false);
                } else {
                    p8Var.o(2131232046, org.telegram.messenger.cd.a0("UpdatePhotoForRest", null, 2131743843, new Object[0]), true);
                }
                privacyControlActivity.f33749t0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                privacyControlActivity.f33749t0.g(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
                privacyControlActivity.f33748s0 = new org.telegram.ui.Components.bi0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                privacyControlActivity.f33749t0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                privacyControlActivity.f33749t0.e.setAnimation(privacyControlActivity.f33748s0);
                b9Var = privacyControlActivity.f33749t0;
                break;
            case 7:
                privacyControlActivity.f33750u0 = new org.telegram.ui.Components.g9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f33751v0 = new ls(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f33753w0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f33755x0;
                    if (photo != null) {
                        org.telegram.ui.Components.g9 g9Var = privacyControlActivity.f33750u0;
                        org.telegram.messenger.ic i13 = org.telegram.messenger.ic.i(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
                        g9Var.j(i13, "50_50", null, org.telegram.messenger.d20.i(i12).f());
                    } else {
                        org.telegram.ui.Components.g9 g9Var2 = privacyControlActivity.f33750u0;
                        org.telegram.messenger.ic e = org.telegram.messenger.ic.e(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
                        g9Var2.j(e, "50_50", null, org.telegram.messenger.d20.i(i11).f());
                    }
                }
                privacyControlActivity.f33751v0.addView(privacyControlActivity.f33750u0, w7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f33751v0.k(org.telegram.messenger.cd.L0(2131746304, null), false);
                privacyControlActivity.f33751v0.getImageView().setVisibility(0);
                privacyControlActivity.f33751v0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                ls lsVar = privacyControlActivity.f33751v0;
                int i14 = org.telegram.ui.ActionBar.t6.f21153p7;
                lsVar.g(i14, i14);
                b9Var = privacyControlActivity.f33751v0;
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                b9Var = new org.telegram.ui.Cells.t8(context, p6Var);
                break;
            case 9:
                p6Var2 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                b9Var = new org.telegram.ui.Cells.x7(context, p6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                p6Var3 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                vh.d dVar = new vh.d(context, p6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232242, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131746767, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new f50(this, 26));
                frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                x9Var = frameLayout;
                b9Var = x9Var;
                break;
        }
        return new s4.c1(b9Var);
    }
}
