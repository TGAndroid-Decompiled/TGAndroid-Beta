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
public final class yx0 extends org.telegram.ui.Components.pm0 {
    public final Context f44426c;
    public final PrivacyControlActivity d;

    public yx0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f44426c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = d1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f34164b0) {
            i16 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.Z) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f34169e0 && b10 != privacyControlActivity.f34179n0 && b10 != privacyControlActivity.f34180o0 && b10 != privacyControlActivity.f34181p0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f34177l0) {
                        if (privacyControlActivity.f34192x != 12 || !privacyControlActivity.u0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.O && b10 != privacyControlActivity.f34172g0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.T && b10 != privacyControlActivity.S) {
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
        return this.d.f34184r0;
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
        if (i10 != privacyControlActivity.S && i10 != privacyControlActivity.T && i10 != privacyControlActivity.f34164b0 && i10 != privacyControlActivity.f34169e0) {
            if (i10 != privacyControlActivity.U && i10 != privacyControlActivity.P && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.f34175j0 && i10 != privacyControlActivity.f34166c0 && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.f34167d0 && i10 != privacyControlActivity.f34171f0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f34176k0 && i10 != privacyControlActivity.f34182q0) {
                    if (i10 != privacyControlActivity.N && i10 != privacyControlActivity.f34173h0 && i10 != privacyControlActivity.R && i10 != privacyControlActivity.f34162a0 && i10 != privacyControlActivity.V) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.O) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f34172g0 && i10 != privacyControlActivity.W && i10 != privacyControlActivity.X) {
                                    if (i10 == privacyControlActivity.M) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.Y) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.f34179n0 && i10 != privacyControlActivity.f34180o0 && i10 != privacyControlActivity.f34181p0 && i10 != privacyControlActivity.f34177l0 && i10 != privacyControlActivity.m0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f34174i0) {
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
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        View view;
        Context context = this.f44426c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.setCanDisable(true);
                view = caVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.k6(context, null);
                break;
            case 4:
                view = privacyControlActivity.f34168e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f34188u0 = r8Var;
                if (privacyControlActivity.f34193x0 == null) {
                    r8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    r8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f34188u0.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                privacyControlActivity.f34188u0.e(org.telegram.ui.ActionBar.i6.f21128v6, org.telegram.ui.ActionBar.i6.f21110u6);
                privacyControlActivity.f34187t0 = new org.telegram.ui.Components.ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f34188u0.f22720e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.f34188u0.f22720e.setAnimation(privacyControlActivity.f34187t0);
                view = privacyControlActivity.f34188u0;
                break;
            case 7:
                privacyControlActivity.f34189v0 = new org.telegram.ui.Components.y9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f34191w0 = new os(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f34193x0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f34195y0;
                    if (photo != null) {
                        org.telegram.ui.Components.y9 y9Var = privacyControlActivity.f34189v0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        y9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.y9 y9Var2 = privacyControlActivity.f34189v0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        y9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f34191w0.addView(privacyControlActivity.f34189v0, w7.x5.a(30.0f, 21.0f, 0.0f, 21.0f, 0.0f, 30, 16));
                privacyControlActivity.f34191w0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f34191w0.getImageView().setVisibility(0);
                privacyControlActivity.f34191w0.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                os osVar = privacyControlActivity.f34191w0;
                int i13 = org.telegram.ui.ActionBar.i6.f21018p7;
                osVar.e(i13, i13);
                view = privacyControlActivity.f34191w0;
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.w8(context, e6Var);
                break;
            case 9:
                e6Var2 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.z7(context, e6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                e6Var3 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                ci.d dVar = new ci.d(context, e6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new m60(this, 23));
                frameLayout.addView(dVar, w7.x5.a(48.0f, 18.0f, 0.0f, 18.0f, 16.0f, -1, 119));
                view = frameLayout;
                break;
        }
        return new s4.d1(view);
    }
}
