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
public final class uw0 extends org.telegram.ui.Components.vk0 {
    public final Context f43328c;
    public final PrivacyControlActivity d;

    public uw0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f43328c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = q1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.X) {
            i15 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i15).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i9 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i9 && b10 != privacyControlActivity.V) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f35872a0 && b10 != privacyControlActivity.f35885j0 && b10 != privacyControlActivity.f35886k0 && b10 != privacyControlActivity.f35887l0 && b10 != privacyControlActivity.f35884i0 && b10 != privacyControlActivity.f35883h0) {
                        if (privacyControlActivity.f35902x != 12 || !privacyControlActivity.t0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.K && b10 != privacyControlActivity.f35876c0) {
                                i14 = privacyControlActivity.everybodyRow;
                                if (b10 != i14 && b10 != privacyControlActivity.P && b10 != privacyControlActivity.O) {
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
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i9++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i9 += chat.participants_count;
                }
            }
        }
        return i9;
    }

    @Override
    public final int h() {
        return this.d.f35889n0;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i9 != privacyControlActivity.O && i9 != privacyControlActivity.P && i9 != privacyControlActivity.X && i9 != privacyControlActivity.f35872a0) {
            if (i9 != privacyControlActivity.Q && i9 != privacyControlActivity.L && i9 != privacyControlActivity.M && i9 != privacyControlActivity.f35881f0 && i9 != privacyControlActivity.Y && i9 != privacyControlActivity.V && i9 != privacyControlActivity.Z && i9 != privacyControlActivity.f35874b0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i9 != i10 && i9 != privacyControlActivity.f35882g0 && i9 != privacyControlActivity.m0) {
                    if (i9 != privacyControlActivity.J && i9 != privacyControlActivity.f35877d0 && i9 != privacyControlActivity.N && i9 != privacyControlActivity.W && i9 != privacyControlActivity.R) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i9 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i9 != i12 && i9 != privacyControlActivity.K) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i9 != i13 && i9 != privacyControlActivity.f35876c0 && i9 != privacyControlActivity.S && i9 != privacyControlActivity.T) {
                                    if (i9 == privacyControlActivity.I) {
                                        return 4;
                                    }
                                    if (i9 != privacyControlActivity.U) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i9 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i9 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i9 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i9 != i17 && i9 != privacyControlActivity.f35885j0 && i9 != privacyControlActivity.f35886k0 && i9 != privacyControlActivity.f35887l0 && i9 != privacyControlActivity.f35883h0 && i9 != privacyControlActivity.f35884i0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i9 == i18) {
                                                            return 9;
                                                        }
                                                        if (i9 == privacyControlActivity.f35879e0) {
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
    public final void v(f2.q1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        View view;
        Context context = this.f43328c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i9) {
            case 0:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setCanDisable(true);
                view = baVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                view = privacyControlActivity.f35878e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35892q0 = p8Var;
                if (privacyControlActivity.f35897t0 == null) {
                    p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f35892q0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                privacyControlActivity.f35892q0.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                int i12 = R.raw.camera_outline;
                privacyControlActivity.f35891p0 = new org.telegram.ui.Components.mi0(i12, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f35892q0.f24875e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.f35892q0.f24875e.setAnimation(privacyControlActivity.f35891p0);
                view = privacyControlActivity.f35892q0;
                break;
            case 7:
                privacyControlActivity.f35894r0 = new org.telegram.ui.Components.o9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35896s0 = new gs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f35897t0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f35898u0;
                    if (photo != null) {
                        org.telegram.ui.Components.o9 o9Var = privacyControlActivity.f35894r0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        o9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.o9 o9Var2 = privacyControlActivity.f35894r0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        o9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i10).getCurrentUser());
                    }
                }
                privacyControlActivity.f35896s0.addView(privacyControlActivity.f35894r0, g7.e6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f35896s0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f35896s0.getImageView().setVisibility(0);
                privacyControlActivity.f35896s0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                gs gsVar = privacyControlActivity.f35896s0;
                int i13 = org.telegram.ui.ActionBar.f6.f23212p7;
                gsVar.e(i13, i13);
                view = privacyControlActivity.f35896s0;
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.t8(context, b6Var);
                break;
            case 9:
                b6Var2 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x7(context, b6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                b6Var3 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                kh.d dVar = new kh.d(context, b6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new q50(this, 25));
                frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new f2.q1(view);
    }
}
