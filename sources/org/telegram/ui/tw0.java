package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class tw0 extends org.telegram.ui.Components.il0 {
    public final Context f43107c;
    public final PrivacyControlActivity d;

    public tw0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f43107c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = n1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.X) {
            i16 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.V) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f35938a0 && b10 != privacyControlActivity.f35951j0 && b10 != privacyControlActivity.f35952k0 && b10 != privacyControlActivity.f35953l0 && b10 != privacyControlActivity.f35950i0 && b10 != privacyControlActivity.f35949h0) {
                        if (privacyControlActivity.f35968x != 12 || !privacyControlActivity.u0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.K && b10 != privacyControlActivity.f35942c0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.P && b10 != privacyControlActivity.O) {
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
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i10 += chat.participants_count;
                }
            }
        }
        return i10;
    }

    @Override
    public final int h() {
        return this.d.f35955n0;
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
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 != privacyControlActivity.O && i10 != privacyControlActivity.P && i10 != privacyControlActivity.X && i10 != privacyControlActivity.f35938a0) {
            if (i10 != privacyControlActivity.Q && i10 != privacyControlActivity.L && i10 != privacyControlActivity.M && i10 != privacyControlActivity.f35947f0 && i10 != privacyControlActivity.Y && i10 != privacyControlActivity.V && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.f35940b0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f35948g0 && i10 != privacyControlActivity.m0) {
                    if (i10 != privacyControlActivity.J && i10 != privacyControlActivity.f35943d0 && i10 != privacyControlActivity.N && i10 != privacyControlActivity.W && i10 != privacyControlActivity.R) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.K) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f35942c0 && i10 != privacyControlActivity.S && i10 != privacyControlActivity.T) {
                                    if (i10 == privacyControlActivity.I) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.U) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.f35951j0 && i10 != privacyControlActivity.f35952k0 && i10 != privacyControlActivity.f35953l0 && i10 != privacyControlActivity.f35949h0 && i10 != privacyControlActivity.f35950i0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f35945e0) {
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
    public final void v(f2.n1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tw0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        View view;
        Context context = this.f43107c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
                y9Var.setCanDisable(true);
                view = y9Var;
                break;
            case 1:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.k4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.h6(context, null);
                break;
            case 4:
                view = privacyControlActivity.f35944e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35958q0 = m8Var;
                if (privacyControlActivity.f35963t0 == null) {
                    m8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    m8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f35958q0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                privacyControlActivity.f35958q0.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                int i13 = R.raw.camera_outline;
                privacyControlActivity.f35957p0 = new org.telegram.ui.Components.xi0(i13, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f35958q0.f24711e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.f35958q0.f24711e.setAnimation(privacyControlActivity.f35957p0);
                view = privacyControlActivity.f35958q0;
                break;
            case 7:
                privacyControlActivity.f35960r0 = new org.telegram.ui.Components.t9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35962s0 = new fs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f35963t0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f35964u0;
                    if (photo != null) {
                        org.telegram.ui.Components.t9 t9Var = privacyControlActivity.f35960r0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        t9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.t9 t9Var2 = privacyControlActivity.f35960r0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        t9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f35962s0.addView(privacyControlActivity.f35960r0, i7.f6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f35962s0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f35962s0.getImageView().setVisibility(0);
                privacyControlActivity.f35962s0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                fs fsVar = privacyControlActivity.f35962s0;
                int i14 = org.telegram.ui.ActionBar.g6.f23279p7;
                fsVar.e(i14, i14);
                view = privacyControlActivity.f35962s0;
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.q8(context, c6Var);
                break;
            case 9:
                c6Var2 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.v7(context, c6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                c6Var3 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                nh.d dVar = new nh.d(context, c6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new t50(this, 25));
                frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new f2.n1(view);
    }
}
