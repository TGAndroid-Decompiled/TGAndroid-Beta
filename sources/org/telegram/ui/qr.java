package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;
public final class qr extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.w30 {
    public org.telegram.ui.Cells.n8 E;
    public or F;
    public org.telegram.ui.Cells.n8 G;
    public org.telegram.messenger.uo H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public pr P;
    public final org.telegram.ui.Components.x30 Q;
    public TLRPC.FileLocation R;
    public int S;
    public int T;
    public TLRPC.Photo U;
    public org.telegram.ui.Components.q9 V;
    public FrameLayout W;
    public org.telegram.ui.Components.h51 X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.c5 f51331a;
    public org.telegram.messenger.fj f51332a0;
    public org.telegram.ui.Cells.l3 f51333b;
    public org.telegram.ui.Cells.l3 f51334c;
    public org.telegram.ui.Cells.l3 d;
    public org.telegram.ui.Components.q9 f51335e;
    public TextView f51336f;
    public TextView h;
    public org.telegram.ui.Components.b9 f51337n;
    public final org.telegram.ui.ActionBar.h6 f51338r;
    public RadialProgressView f51339s;
    public hi.l5 f51340w;
    public AnimatorSet f51341x;
    public org.telegram.ui.Cells.n8 f51342y;

    public qr(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new org.telegram.ui.Components.x30(0, true, true);
    }

    public static void Z(qr qrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f28575id = qrVar.getMessagesController().q1(qrVar.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(qrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(qrVar, 5));
    }

    public static void a0(qr qrVar, TLRPC.User user) {
        qrVar.R = null;
        qrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
        c22.photo.personal = false;
        TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(qrVar.currentAccount).d2(qrVar.I);
        if (d2 != null) {
            d2.personal_photo = null;
            d2.flags &= -2097153;
            qrVar.getMessagesStorage().j2(d2, true);
        }
        TLRPC.Photo photo = qrVar.U;
        if (photo != null) {
            c22.photo.photo_id = photo.f28455id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null) {
                c22.photo.photo_small = w10.location;
            }
            if (w11 != null) {
                c22.photo.photo_big = w11.location;
            }
        } else {
            c22.photo = null;
            c22.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        qrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        qrVar.k0();
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25121c0, new Object[0]);
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25205r, 2);
    }

    public static void b0(qr qrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.x30 x30Var = qrVar.Q;
        if (x30Var.U) {
            return;
        }
        int i7 = qrVar.T;
        if (i7 == 2) {
            qrVar.R = photoSize.location;
        } else if (i7 == 1 && qrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.r4 parentLayout = qrVar.getParentLayout();
            org.telegram.ui.ActionBar.g2 lastFragment = qrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    org.telegram.ui.ActionBar.g2 g2Var2 = lastFragment;
                    if (bnVar.a() == qrVar.I && bnVar.f46032g4 == 0) {
                        bnVar.Ab(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            if (arrayList.get(size2) != g2Var3) {
                                ((org.telegram.ui.ActionBar.g2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            g2Var2 = g2Var3;
                        }
                        g2Var2.finishFragment();
                    } else {
                        lastFragment = g2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.g2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            qrVar.f51335e.j(org.telegram.messenger.fc.e(qrVar.R), "50_50", qrVar.f51337n, qrVar.getMessagesController().c2(Long.valueOf(qrVar.I)));
            if (qrVar.T == 2) {
                qrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.zy.C(qrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.zy.E();
                tL_messageService.dialog_id = qrVar.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = qrVar.getUserConfig().j();
                tL_messageService.f28452id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = qrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = qrVar.I;
                tL_messageService.date = qrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(qrVar.currentAccount, tL_messageService, false, false);
                qrVar.f51332a0 = fjVar;
                arrayList2.add(fjVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.mp.u1(qrVar.currentAccount).x5(0, qrVar.I, arrayList2);
                qrVar.getMessagesController().E7.put(tL_messageService.local_id, x30Var);
            }
        } else {
            TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
            if (qrVar.f51332a0 == null && c22 != null) {
                if (inputFile2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                c22.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(c22);
                qrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25121c0, new Object[0]);
                org.telegram.messenger.ks notificationCenter = qrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.mp.I8;
                notificationCenter.k(org.telegram.messenger.ks.f25205r, 2);
            }
            qrVar.h0(qrVar.R, photoSize2.location, inputFile, inputFile2, videoSize, d, qrVar.T);
            qrVar.i0(false, true);
        }
        qrVar.k0();
    }

    public static void c0(qr qrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (qrVar.f51332a0 == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(qrVar.currentAccount).d2(qrVar.I);
                if (d2 != null) {
                    d2.personal_photo = tL_photos_photo.photo;
                    d2.flags |= 2097152;
                    qrVar.getMessagesStorage().j2(d2, true);
                }
                if (c22 != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
                    if (w10 != null && fileLocation != null) {
                        org.telegram.messenger.w7.G(qrVar.currentAccount);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(qrVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.fc.l(qrVar.currentAccount, 1, c22));
                    }
                    if (w11 != null && fileLocation2 != null) {
                        org.telegram.messenger.w7.G(qrVar.currentAccount);
                        File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                        org.telegram.messenger.w7.G(qrVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
                    }
                    bg.n0.a(tL_photos_photo.photo, c22, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c22);
                    qrVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    qrVar.getMessagesController().W0(qrVar.I);
                    qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25121c0, new Object[0]);
                    qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25205r, 2);
                    if (qrVar.getParentActivity() != null) {
                        if (i7 == 2) {
                            org.telegram.ui.Components.lc.b0(qrVar).V(arrayList2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("UserCustomPhotoSeted", null, 2131743500, c22.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.lc.b0(qrVar).V(arrayList2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("UserCustomPhotoSeted", null, 2131743500, c22.first_name)), null, null).j();
                        }
                    }
                }
                qrVar.R = null;
                qrVar.k0();
            }
        }
    }

    public static void d0(qr qrVar) {
        if (qrVar.f51332a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(qrVar.f51332a0.e1()));
            org.telegram.messenger.ks.f(qrVar.currentAccount).k(org.telegram.messenger.ks.f25238w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.f51339s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f51339s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U() {
        org.telegram.messenger.g0.g3(new gr(this, 0));
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() {
            @Override
            public final void run() {
                qr.b0(qr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29525l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29507k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        float f12;
        float f13;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (this.J) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748090, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751270, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mr(this));
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (this.J) {
            i7 = 2131751741;
        } else {
            i7 = 2131745750;
        }
        this.f51331a = z4Var.s(org.telegram.messenger.gd.N0(i7, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.m6.f29378d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f51338r;
        org.telegram.ui.ActionBar.t6.h(i16, frameLayout2, h6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f51335e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        FrameLayout frameLayout3 = this.W;
        org.telegram.ui.Components.q9 q9Var2 = this.f51335e;
        int i17 = 3;
        if (org.telegram.messenger.gd.f24241a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(q9Var2, c8.ma.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.l5 l5Var = new hi.l5(this, context, paint, 10);
        this.f51340w = l5Var;
        FrameLayout frameLayout4 = this.W;
        if (org.telegram.messenger.gd.f24241a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(l5Var, c8.ma.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f51339s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.f51339s.setProgressColor(-1);
        this.f51339s.setNoProgress(false);
        FrameLayout frameLayout5 = this.W;
        RadialProgressView radialProgressView2 = this.f51339s;
        if (org.telegram.messenger.gd.f24241a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, c8.ma.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f51336f = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.f51336f.setTextSize(1, 18.0f);
        this.f51336f.setLines(1);
        this.f51336f.setMaxLines(1);
        this.f51336f.setSingleLine(true);
        TextView textView2 = this.f51336f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f51336f;
        if (org.telegram.messenger.gd.f24241a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f51336f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout6 = this.W;
        TextView textView4 = this.f51336f;
        boolean z10 = org.telegram.messenger.gd.f24241a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 94.0f;
        }
        if (z10) {
            f11 = 94.0f;
        } else {
            f11 = 0.0f;
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout6, textView4, c8.ma.d(-2, -2.0f, i18, f10, 25.66f, f11, 0.0f), context);
        this.h = m10;
        org.telegram.ui.ActionBar.t6.U(m10, org.telegram.ui.ActionBar.m6.A6, h6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.gd.f24241a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.W;
        TextView textView6 = this.h;
        boolean z11 = org.telegram.messenger.gd.f24241a0;
        if (z11) {
            i17 = 5;
        }
        int i19 = i17 | 48;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 94.0f;
        }
        if (z11) {
            f13 = 94.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout7.addView(textView6, c8.ma.d(-2, -2.0f, i19, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131750677, null), false, false, -1, this.f51338r);
        this.f51333b = l3Var;
        l3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.t6.h(i16, this.f51333b, h6Var);
        this.f51333b.setDivider(true);
        this.f51333b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qr f49376b;

            {
                this.f49376b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            qr qrVar = this.f49376b;
                            qrVar.f51334c.d.requestFocus();
                            org.telegram.ui.Cells.j3 j3Var = qrVar.f51334c.d;
                            j3Var.setSelection(j3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        qr qrVar2 = this.f49376b;
                        if (i20 == 6) {
                            qrVar2.f51331a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            qrVar2.d.d.requestFocus();
                            qrVar2.d.d.setSelection(qrVar2.f51334c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        qr qrVar3 = this.f49376b;
                        if (i20 == 6) {
                            qrVar3.f51331a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        this.f51333b.d.setOnFocusChangeListener(new Object());
        this.f51333b.setText(this.N);
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131748839, null), false, false, -1, this.f51338r);
        this.f51334c = l3Var2;
        l3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.t6.h(i16, this.f51334c, h6Var);
        this.f51334c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qr f49376b;

            {
                this.f49376b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            qr qrVar = this.f49376b;
                            qrVar.f51334c.d.requestFocus();
                            org.telegram.ui.Cells.j3 j3Var = qrVar.f51334c.d;
                            j3Var.setSelection(j3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        qr qrVar2 = this.f49376b;
                        if (i20 == 6) {
                            qrVar2.f51331a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            qrVar2.d.d.requestFocus();
                            qrVar2.d.d.setSelection(qrVar2.f51334c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        qr qrVar3 = this.f49376b;
                        if (i20 == 6) {
                            qrVar3.f51331a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        this.f51334c.setText(this.O);
        org.telegram.ui.Cells.l3 l3Var3 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754392, null), true, true, ((org.telegram.messenger.j0) getMessagesController().A7.D.f15505b).f24792c, this.f51338r);
        this.d = l3Var3;
        org.telegram.ui.ActionBar.t6.G(l3Var3.d, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.t6.h(i16, this.d, h6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qr f49376b;

            {
                this.f49376b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            qr qrVar = this.f49376b;
                            qrVar.f51334c.d.requestFocus();
                            org.telegram.ui.Cells.j3 j3Var = qrVar.f51334c.d;
                            j3Var.setSelection(j3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        qr qrVar2 = this.f49376b;
                        if (i20 == 6) {
                            qrVar2.f51331a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            qrVar2.d.d.requestFocus();
                            qrVar2.d.d.setSelection(qrVar2.f51334c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        qr qrVar3 = this.f49376b;
                        if (i20 == 6) {
                            qrVar3.f51331a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, h6Var);
            this.f51342y = n8Var;
            n8Var.o(2131232049, org.telegram.messenger.gd.a0(null, null, 2131744157, c22.first_name), true);
            this.f51342y.setBackground(org.telegram.ui.ActionBar.m6.M0(h6Var, true));
            org.telegram.ui.Cells.n8 n8Var2 = this.f51342y;
            int i20 = org.telegram.ui.ActionBar.m6.f29713v6;
            int i21 = org.telegram.ui.ActionBar.m6.f29694u6;
            n8Var2.g(i20, i21);
            final org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624133, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.f51342y.f31165e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.f51342y.f31165e.setAnimation(oh0Var);
            this.f51342y.setOnClickListener(new View.OnClickListener(this) {
                public final qr f49693b;

                {
                    this.f49693b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final qr qrVar = this.f49693b;
                            boolean z13 = true;
                            qrVar.S = 1;
                            org.telegram.ui.Components.x30 x30Var = qrVar.Q;
                            TLRPC.User user = c22;
                            x30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
                            final org.telegram.ui.Components.oh0 oh0Var2 = oh0Var;
                            x30Var.n(z13, j2Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            qr qrVar2 = qrVar;
                                            boolean g10 = qrVar2.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var3 = oh0Var2;
                                            if (!g10) {
                                                oh0Var3.P(86);
                                                qrVar2.E.f31165e.d();
                                                return;
                                            }
                                            oh0Var3.N(0, false, false);
                                            return;
                                        default:
                                            qr qrVar3 = qrVar;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var4 = oh0Var2;
                                            if (!g11) {
                                                oh0Var4.P(85);
                                                qrVar3.f51342y.f31165e.d();
                                                return;
                                            }
                                            oh0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            oh0Var2.M(0);
                            oh0Var2.P(43);
                            qrVar.f51342y.f31165e.d();
                            return;
                        default:
                            final qr qrVar2 = this.f49693b;
                            qrVar2.S = 2;
                            org.telegram.ui.Components.x30 x30Var2 = qrVar2.Q;
                            TLRPC.User user2 = c22;
                            x30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(0);
                            final org.telegram.ui.Components.oh0 oh0Var3 = oh0Var;
                            x30Var2.n(z12, j2Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            qr qrVar22 = qrVar2;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var32 = oh0Var3;
                                            if (!g10) {
                                                oh0Var32.P(86);
                                                qrVar22.E.f31165e.d();
                                                return;
                                            }
                                            oh0Var32.N(0, false, false);
                                            return;
                                        default:
                                            qr qrVar3 = qrVar2;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var4 = oh0Var3;
                                            if (!g11) {
                                                oh0Var4.P(85);
                                                qrVar3.f51342y.f31165e.d();
                                                return;
                                            }
                                            oh0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            oh0Var3.M(0);
                            oh0Var3.P(43);
                            qrVar2.E.f31165e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(context, h6Var);
            this.E = n8Var3;
            n8Var3.o(2131232049, org.telegram.messenger.gd.a0(null, null, 2131743436, c22.first_name), false);
            this.E.setBackground(org.telegram.ui.ActionBar.m6.M0(h6Var, true));
            this.E.g(i20, i21);
            final org.telegram.ui.Components.oh0 oh0Var2 = new org.telegram.ui.Components.oh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.E.f31165e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.E.f31165e.setAnimation(oh0Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final qr f49693b;

                {
                    this.f49693b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final qr qrVar = this.f49693b;
                            boolean z13 = true;
                            qrVar.S = 1;
                            org.telegram.ui.Components.x30 x30Var = qrVar.Q;
                            TLRPC.User user = c22;
                            x30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
                            final org.telegram.ui.Components.oh0 oh0Var22 = oh0Var2;
                            x30Var.n(z13, j2Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            qr qrVar22 = qrVar;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var32 = oh0Var22;
                                            if (!g10) {
                                                oh0Var32.P(86);
                                                qrVar22.E.f31165e.d();
                                                return;
                                            }
                                            oh0Var32.N(0, false, false);
                                            return;
                                        default:
                                            qr qrVar3 = qrVar;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var4 = oh0Var22;
                                            if (!g11) {
                                                oh0Var4.P(85);
                                                qrVar3.f51342y.f31165e.d();
                                                return;
                                            }
                                            oh0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            oh0Var22.M(0);
                            oh0Var22.P(43);
                            qrVar.f51342y.f31165e.d();
                            return;
                        default:
                            final qr qrVar2 = this.f49693b;
                            qrVar2.S = 2;
                            org.telegram.ui.Components.x30 x30Var2 = qrVar2.Q;
                            TLRPC.User user2 = c22;
                            x30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(0);
                            final org.telegram.ui.Components.oh0 oh0Var3 = oh0Var2;
                            x30Var2.n(z12, j2Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            qr qrVar22 = qrVar2;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var32 = oh0Var3;
                                            if (!g10) {
                                                oh0Var32.P(86);
                                                qrVar22.E.f31165e.d();
                                                return;
                                            }
                                            oh0Var32.N(0, false, false);
                                            return;
                                        default:
                                            qr qrVar3 = qrVar2;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.oh0 oh0Var4 = oh0Var3;
                                            if (!g11) {
                                                oh0Var4.P(85);
                                                qrVar3.f51342y.f31165e.d();
                                                return;
                                            }
                                            oh0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            oh0Var3.M(0);
                            oh0Var3.P(43);
                            qrVar2.E.f31165e.d();
                            return;
                    }
                }
            });
            this.V = new org.telegram.ui.Components.q9(context);
            this.F = new or(this, context, h6Var);
            if (this.f51337n == null) {
                this.f51337n = new org.telegram.ui.Components.b9(0, c22);
            }
            this.V.f(c22.photo, this.f51337n);
            this.F.addView(this.V, c8.ma.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(org.telegram.messenger.gd.N0(2131745892, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(org.telegram.ui.ActionBar.m6.M0(h6Var, true));
            this.F.g(i20, i21);
            this.F.setOnClickListener(new y(this, context, c22, 10));
            org.telegram.ui.Cells.n8 n8Var4 = new org.telegram.ui.Cells.n8(context, h6Var);
            this.G = n8Var4;
            n8Var4.o(2131231768, org.telegram.messenger.gd.a0(null, null, 2131743435, new Object[0]), false);
            this.G.setBackground(org.telegram.ui.ActionBar.m6.M0(h6Var, true));
            this.G.g(i20, i21);
            this.G.setNeedDivider(true);
            this.G.f31165e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.G.setOnClickListener(new org.telegram.ui.Components.q31(7, this, c22));
            TLRPC.UserFull d2 = getMessagesController().d2(this.I);
            if (d2 != null) {
                TLRPC.Photo photo = d2.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = d2.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(this, new a5(this, 7), new w0(this, 29), null);
        this.X = h51Var;
        h51Var.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bi.h6(6, this, frameLayout));
        frameLayout.addView(this.X, c8.ma.e(-1, -1, 119));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.f35796g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.uo uoVar;
        if (i7 == org.telegram.messenger.ks.f25205r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i7 == org.telegram.messenger.ks.f25147g3 && (uoVar = (org.telegram.messenger.uo) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(uoVar.f27227b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.T != 1) {
            return true;
        }
        return false;
    }

    public final String g0() {
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
        if (c22 != null && !TextUtils.isEmpty(c22.phone)) {
            return c22.phone;
        }
        return this.M;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.f51338r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i7) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().q1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i7 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new bg.l0(this, fileLocation, inputFile2, fileLocation2, i7, 9));
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f51339s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f51341x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f51341x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f51341x = animatorSet2;
            if (z10) {
                this.f51339s.setVisibility(0);
                this.f51340w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f51341x;
                RadialProgressView radialProgressView = this.f51339s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f51340w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f51339s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f51340w, property2, 0.0f));
            }
            this.f51341x.setDuration(180L);
            this.f51341x.addListener(new on(28, this, z10));
            this.f51341x.start();
        } else if (z10) {
            this.f51339s.setAlpha(1.0f);
            this.f51339s.setVisibility(0);
            this.f51340w.setAlpha(1.0f);
            this.f51340w.setVisibility(0);
        } else {
            this.f51339s.setAlpha(0.0f);
            this.f51339s.setVisibility(4);
            this.f51340w.setAlpha(0.0f);
            this.f51340w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User c22;
        if (this.f51336f != null && (c22 = getMessagesController().c2(Long.valueOf(this.I))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f51336f.setText(org.telegram.messenger.gd.N0(2131748217, null));
            } else {
                TextView textView = this.f51336f;
                pf.b c10 = pf.b.c();
                textView.setText(c10.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.gd.d0(this.currentAccount, c22, null, null));
            if (this.R == null) {
                org.telegram.ui.Components.q9 q9Var = this.f51335e;
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(0, c22);
                this.f51337n = b9Var;
                q9Var.f(c22, b9Var);
            }
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.j(org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.f51337n, null);
        }
        if (this.f51337n == null) {
            this.f51337n = new org.telegram.ui.Components.b9(0, c22);
        }
        TLRPC.FileLocation fileLocation = this.R;
        if (fileLocation == null) {
            this.f51335e.f(c22, this.f51337n);
        } else {
            this.f51335e.j(org.telegram.messenger.fc.e(fileLocation), "50_50", this.f51337n, getMessagesController().c2(Long.valueOf(this.I)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25205r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25147g3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.currentAccount).f25686g7;
        this.L = sharedPreferences.getBoolean("dialog_bar_exception" + this.I, false);
        if (this.I != 0) {
            user = getMessagesController().c2(Long.valueOf(this.I));
        } else {
            user = null;
        }
        org.telegram.ui.Components.x30 x30Var = this.Q;
        if (x30Var != null) {
            x30Var.f41966a = this;
            x30Var.f41967b = this;
        }
        this.H = org.telegram.messenger.mp.u1(this.currentAccount).W0(this.I);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25205r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25147g3);
        org.telegram.ui.Components.x30 x30Var = this.Q;
        if (x30Var != null) {
            x30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User c22;
        try {
            super.onThemeColorsChanged();
            if (this.f51335e != null && (c22 = getMessagesController().c2(Long.valueOf(this.I))) != null) {
                this.f51337n.r(c22);
                this.f51335e.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public qr(Bundle bundle, org.telegram.ui.ActionBar.h6 h6Var) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.f51338r = h6Var;
        this.Q = new org.telegram.ui.Components.x30(0, true, true);
    }
}
