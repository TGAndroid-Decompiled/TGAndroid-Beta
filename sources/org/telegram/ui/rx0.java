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
public final class rx0 extends org.telegram.ui.Components.ll0 {
    public final Context f36951c;
    public final PrivacyControlActivity d;

    public rx0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f36951c = context;
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
        if (b10 == privacyControlActivity.f31164b0) {
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
                    if (b10 != i13 && b10 != privacyControlActivity.f31168e0 && b10 != privacyControlActivity.f31178n0 && b10 != privacyControlActivity.f31179o0 && b10 != privacyControlActivity.f31180p0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f31176l0) {
                        if (privacyControlActivity.f31191x != 12 || !privacyControlActivity.u0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.O && b10 != privacyControlActivity.f31171g0) {
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
        return this.d.f31183r0;
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
        if (i10 != privacyControlActivity.S && i10 != privacyControlActivity.T && i10 != privacyControlActivity.f31164b0 && i10 != privacyControlActivity.f31168e0) {
            if (i10 != privacyControlActivity.U && i10 != privacyControlActivity.P && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.f31174j0 && i10 != privacyControlActivity.f31166c0 && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.f31167d0 && i10 != privacyControlActivity.f31170f0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f31175k0 && i10 != privacyControlActivity.f31181q0) {
                    if (i10 != privacyControlActivity.N && i10 != privacyControlActivity.f31172h0 && i10 != privacyControlActivity.R && i10 != privacyControlActivity.f31162a0 && i10 != privacyControlActivity.V) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.O) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f31171g0 && i10 != privacyControlActivity.W && i10 != privacyControlActivity.X) {
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
                                                    if (i10 != i18 && i10 != privacyControlActivity.f31178n0 && i10 != privacyControlActivity.f31179o0 && i10 != privacyControlActivity.f31180p0 && i10 != privacyControlActivity.f31176l0 && i10 != privacyControlActivity.m0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f31173i0) {
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
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rx0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        View view;
        Context context = this.f36951c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
                faVar.setCanDisable(true);
                view = faVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.k6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f31187u0 = s8Var;
                if (privacyControlActivity.f31192x0 == null) {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f31187u0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                privacyControlActivity.f31187u0.e(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
                privacyControlActivity.f31186t0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f31187u0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.f31187u0.e.setAnimation(privacyControlActivity.f31186t0);
                view = privacyControlActivity.f31187u0;
                break;
            case 7:
                privacyControlActivity.f31188v0 = new org.telegram.ui.Components.w9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f31190w0 = new ls(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f31192x0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f31194y0;
                    if (photo != null) {
                        org.telegram.ui.Components.w9 w9Var = privacyControlActivity.f31188v0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        w9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.w9 w9Var2 = privacyControlActivity.f31188v0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        w9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f31190w0.addView(privacyControlActivity.f31188v0, w7.x5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f31190w0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f31190w0.getImageView().setVisibility(0);
                privacyControlActivity.f31190w0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                ls lsVar = privacyControlActivity.f31190w0;
                int i13 = org.telegram.ui.ActionBar.h6.f19008p7;
                lsVar.e(i13, i13);
                view = privacyControlActivity.f31190w0;
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x8(context, d6Var);
                break;
            case 9:
                d6Var2 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.a8(context, d6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                d6Var3 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                ci.d dVar = new ci.d(context, d6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new h60(this, 24));
                frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new s4.c1(view);
    }
}
