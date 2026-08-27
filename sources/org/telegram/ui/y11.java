package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class y11 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public t11 A;
    public org.telegram.ui.Components.ri0 B;
    public ImageView C;
    public Bitmap D;
    public Bitmap E;
    public org.telegram.ui.ActionBar.b4 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public int K;
    public boolean L;
    public i0.c M;

    public final i6 f44666a;

    public final org.telegram.ui.ActionBar.b4 f44667b;

    public final Rect f44668c;
    public final a0.f d;

    public int[] f44669e;

    public x11 f44670f;
    public org.telegram.ui.Components.nb0 h;

    public org.telegram.ui.Components.nb0 f44671n;

    public org.telegram.ui.Components.nb0 f44672r;

    public ValueAnimator f44673s;
    public ValueAnimator v;

    public aj0 f44674w;

    public ag.y1 f44675x;

    public org.telegram.ui.Components.n9 f44676y;

    static {
        a0.f fVar = new a0.f(0);
        N = fVar;
        fVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        fVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        fVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        fVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        fVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        fVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        fVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        fVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        fVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        fVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        fVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        fVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        fVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        fVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        fVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        fVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        fVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        fVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        P = true;
    }

    public y11(Bundle bundle) {
        super(bundle);
        this.f44666a = new i6(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.f22783e = "🏠";
        b4Var.f22782c = of.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22783e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f22710a = org.telegram.ui.ActionBar.g6.N0("Blue");
        a4Var.f22713e = 99;
        b4Var.f22784f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f22710a = org.telegram.ui.ActionBar.g6.N0("Dark Blue");
        a4Var2.f22713e = 0;
        b4Var.f22784f.add(a4Var2);
        this.f44667b = b4Var;
        this.f44668c = new Rect();
        this.d = new a0.f(0);
        this.f44669e = null;
        this.h = new org.telegram.ui.Components.nb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.c.f10488e;
    }

    public static void U(y11 y11Var) {
        if (y11Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || y11Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(y11Var);
        } else {
            y11Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static void V(y11 y11Var) {
        P = false;
        List list = O;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(y11Var.currentAccount).requestAllChatThemes(new o11(y11Var), true);
        } else {
            y11Var.c0(O);
        }
    }

    public static void W(y11 y11Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        i6 i6Var = y11Var.f44666a;
        if (z10) {
            i6Var.f38984b = b4Var.b(((y11) i6Var.f38985c).currentAccount, y11Var.G ? 1 : 0);
        } else {
            i6Var.f38984b = y11Var.F.b(((y11) i6Var.f38985c).currentAccount, y11Var.G ? 1 : 0);
        }
        a5Var.h = new l11(y11Var, 3);
        ((ActionBarLayout) y11Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = y11Var.f44670f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.b.k(org.telegram.ui.ActionBar.w5.b(y11Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static void X(y11 y11Var) {
        y11Var.f44667b.n(y11Var.currentAccount);
        View view = y11Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new l11(y11Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.n2 n2Var) {
        t9.e0(n2Var.getParentActivity(), 1, new p11(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (!z10) {
            return this.D;
        }
        String str = b4Var.f22783e;
        a0.f fVar = this.d;
        Bitmap bitmapCreateBitmap = (Bitmap) fVar.get(str);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(this.D.getWidth(), this.D.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int[] iArr = (int[]) N.get(b4Var.f22783e + "n");
            if (iArr != null) {
                if (this.f44672r == null) {
                    this.f44672r = new org.telegram.ui.Components.nb0(true, 0, 0, 0, 0);
                }
                this.f44672r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.f44672r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.f44672r.draw(canvas);
            }
            canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(b4Var.f22783e, bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    public final void c0(List list) {
        if (list == null || list.isEmpty() || this.f44670f == null) {
            return;
        }
        list.set(0, this.f44667b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(b4Var);
            boolean z10 = this.G;
            zoVar.f35318c = z10 ? 1 : 0;
            zoVar.f35319e = b0(b4Var, z10);
            arrayList.add(zoVar);
        }
        org.telegram.ui.Components.yo yoVar = this.f44670f.f44248b;
        yoVar.d = arrayList;
        yoVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (of.b.a(((org.telegram.ui.Components.zo) arrayList.get(i11)).f35316a.f22782c, this.F.f22782c)) {
                    this.f44670f.G = (org.telegram.ui.Components.zo) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f44670f.b(i11);
        }
        x11 x11Var = this.f44670f;
        v11 v11Var = x11Var.B;
        v11Var.setAlpha(0.0f);
        v11Var.animate().alpha(1.0f).setDuration(150L).start();
        v11Var.setVisibility(0);
        org.telegram.ui.Components.h00 h00Var = x11Var.f44253r;
        h00Var.animate().alpha(0.0f).setListener(new go(h00Var)).setDuration(150L).start();
        org.telegram.ui.Components.zk0 zk0Var = x11Var.f44257y;
        zk0Var.setAlpha(0.0f);
        zk0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public final View createView(Context context) {
        long j10;
        String publicUsername;
        String userName;
        ImageLocation forChat;
        ImageLocation imageLocation;
        org.telegram.ui.Components.y8 y8Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation forUser;
        org.telegram.ui.Components.y8 y8Var2;
        ImageLocation forUser2;
        char c10;
        String strConcat;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.G = org.telegram.ui.ActionBar.g6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.D(-1, false);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(this, context, 2);
        aj0 aj0Var = new aj0(this, context, 6);
        this.f44674w = aj0Var;
        q0Var.addView(aj0Var);
        long j11 = 0;
        if (this.H != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            if (user != null) {
                publicUsername = UserObject.getPublicUsername(user);
                if (publicUsername == null) {
                    userName = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j10 = 0;
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < privacyRules.size()) {
                                TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                                j10 = j11;
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    c10 = 0;
                                    break;
                                }
                                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                        c10 = 1;
                                        break;
                                    }
                                    i12++;
                                    j11 = j10;
                                }
                            } else {
                                j10 = j11;
                            }
                            c10 = 2;
                            break;
                        }
                        if (c10 != 2) {
                            if (c10 != 0 || c10 == 1) {
                                strConcat = user.phone;
                                if (strConcat != null && !strConcat.startsWith("+")) {
                                    strConcat = "+".concat(strConcat);
                                }
                                publicUsername = strConcat;
                                z10 = true;
                            }
                            y8Var2 = new org.telegram.ui.Components.y8(0, user);
                            forUser2 = ImageLocation.getForUser(this.currentAccount, user, 1);
                            forUser = ImageLocation.getForUser(this.currentAccount, user, 0);
                        } else {
                            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
                            if (privacyRules2 != null && privacyRules2.size() != 0) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < privacyRules2.size()) {
                                        TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i13);
                                        if (!(privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                            if (!(privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) && !(privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                                i13++;
                                            }
                                        }
                                    } else if (c10 != 0) {
                                    }
                                }
                            }
                            strConcat = user.phone;
                            if (strConcat != null) {
                                strConcat = "+".concat(strConcat);
                            }
                            publicUsername = strConcat;
                            z10 = true;
                        }
                    }
                    z10 = false;
                    z11 = true;
                    y8Var2 = new org.telegram.ui.Components.y8(0, user);
                    forUser2 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    forUser = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j10 = 0;
                    userName = null;
                    z10 = false;
                }
                z11 = false;
                y8Var2 = new org.telegram.ui.Components.y8(0, user);
                forUser2 = ImageLocation.getForUser(this.currentAccount, user, 1);
                forUser = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                forUser = null;
                publicUsername = null;
                userName = null;
                y8Var2 = null;
                forUser2 = null;
                z10 = false;
                z11 = false;
            }
            forChat = forUser;
            y8Var = y8Var2;
            imageLocation = forUser2;
        } else {
            j10 = 0;
            if (this.I == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.I))) == null) {
                publicUsername = null;
                userName = null;
                forChat = null;
                imageLocation = null;
                y8Var = null;
            } else {
                publicUsername = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.y8 y8Var3 = new org.telegram.ui.Components.y8(chat);
                ImageLocation forChat2 = ImageLocation.getForChat(this.currentAccount, chat, 1);
                userName = null;
                forChat = ImageLocation.getForChat(this.currentAccount, chat, 0);
                y8Var = y8Var3;
                imageLocation = forChat2;
            }
            z10 = false;
            z11 = false;
        }
        t11 t11Var = new t11(context);
        this.A = t11Var;
        t11Var.f42753a.n(-9324972, -13856649, -6636738, -9915042);
        t11Var.invalidate();
        String strN = publicUsername != null ? a9.p.n(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://")) : null;
        t11 t11Var2 = this.A;
        if (userName != null) {
            publicUsername = userName;
        }
        t11Var2.c(strN, publicUsername, z10, z11);
        t11 t11Var3 = this.A;
        t11Var3.f42756e = new k11(this);
        q0Var.addView(t11Var3);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.B = ri0Var;
        ri0Var.setAutoRepeat(true);
        this.B.f(R.raw.plane_logo_plain, 60, 60, null);
        this.B.d();
        q0Var.addView(this.B);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f44676y = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.f44676y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        q0Var.addView(this.f44676y, h7.z5.e(84, 84, 51));
        this.f44676y.m(forChat, "84_84", imageLocation, "50_50", y8Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.C = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.C.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.C.setImageResource(R.drawable.ic_ab_back);
        this.C.setScaleType(ImageView.ScaleType.CENTER);
        this.C.setOnClickListener(new View.OnClickListener(this) {

            public final y11 f40641b;

            {
                this.f40641b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f40641b.finishFragment();
                        break;
                    case 1:
                        y11 y11Var = this.f40641b;
                        y11Var.f44670f.f44254s.setClickable(false);
                        y11Var.g0();
                        break;
                    default:
                        y11.U(this.f40641b);
                        break;
                }
            }
        });
        q0Var.addView(this.C, h7.z5.c(34.0f, 34));
        this.D = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.D);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.D.getWidth(), this.D.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
        canvas.drawBitmap(bitmapDecodeResource, (this.D.getWidth() - bitmapDecodeResource.getWidth()) * 0.5f, (this.D.getHeight() - bitmapDecodeResource.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        x11 x11Var = new x11(this, this, getParentActivity().getWindow());
        this.f44670f = x11Var;
        this.f44675x = x11Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(x11Var, NotificationCenter.emojiLoaded);
        x11 x11Var2 = this.f44670f;
        x11Var2.F = new k11(this);
        x11Var2.f44252n.setText(LocaleController.getString(R.string.QrCode));
        this.f44670f.f44253r.setViewType(17);
        this.f44670f.f44254s.setOnClickListener(new View.OnClickListener(this) {

            public final y11 f40641b;

            {
                this.f40641b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f40641b.finishFragment();
                        break;
                    case 1:
                        y11 y11Var = this.f40641b;
                        y11Var.f44670f.f44254s.setClickable(false);
                        y11Var.g0();
                        break;
                    default:
                        y11.U(this.f40641b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f44670f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {

                public final y11 f40641b;

                {
                    this.f40641b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.f40641b.finishFragment();
                            break;
                        case 1:
                            y11 y11Var = this.f40641b;
                            y11Var.f44670f.f44254s.setClickable(false);
                            y11Var.g0();
                            break;
                        default:
                            y11.U(this.f40641b);
                            break;
                    }
                }
            });
        }
        q0Var.addView(this.f44675x, h7.z5.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = q0Var;
        Utilities.themeQueue.postRunnable(new l11(this, 4), 25L);
        this.fragmentView.postDelayed(new l11(this, 5), P ? 250L : j10);
        this.J = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
        View view = this.fragmentView;
        k11 k11Var = new k11(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(view, k11Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float fMax;
        this.K = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.F;
        final boolean z11 = this.G;
        this.F = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f22784f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f44673s;
        if (valueAnimator != null) {
            fMax = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f44673s.cancel();
        } else {
            fMax = 1.0f;
        }
        org.telegram.ui.Components.nb0 nb0Var = this.h;
        this.f44671n = nb0Var;
        nb0Var.q(false);
        this.f44671n.setAlpha(255);
        org.telegram.ui.Components.nb0 nb0Var2 = new org.telegram.ui.Components.nb0();
        this.h = nb0Var2;
        nb0Var2.setCallback(this.f44674w);
        this.h.n(a4Var.f22718k, a4Var.f22719l, a4Var.f22720m, a4Var.f22721n);
        this.h.r(this.f44674w);
        this.h.s(1.0f);
        org.telegram.ui.Components.nb0 nb0Var3 = this.h;
        nb0Var3.N = true;
        org.telegram.ui.Components.nb0 nb0Var4 = this.f44671n;
        if (nb0Var4 != null) {
            nb0Var3.h = nb0Var4.h;
        }
        this.A.f42753a.h = nb0Var3.h;
        TLRPC.WallPaper wallPaperK = this.F.k(z11 ? 1 : 0);
        int i11 = 2;
        if (wallPaperK != null) {
            org.telegram.ui.Components.nb0 nb0Var5 = this.h;
            nb0Var5.t(nb0Var5.f30939u, wallPaperK.settings.intensity);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    y11 y11Var = this.f40287a;
                    long jI = y11Var.F.i(z11 ? 1 : 0);
                    if (pair == null || jI == 0) {
                        return;
                    }
                    long jLongValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((mf.a) pair.second).f18037b;
                    if (jLongValue != jI || bitmap == null) {
                        return;
                    }
                    y11Var.e0(y11Var.h.f30935q, bitmap, SystemClock.elapsedRealtime() - jElapsedRealtime > 150);
                }

                @Override
                public final void onError(Throwable th) {
                    org.telegram.tgnet.k.a(this, th);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new l11(this, i11), 35L);
        }
        org.telegram.ui.Components.nb0 nb0Var6 = this.h;
        nb0Var6.u(nb0Var6.f());
        a0.f fVar = N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.f22783e);
        sb2.append(z11 ? "n" : "d");
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f44669e == null) {
                int[] iArr2 = new int[4];
                this.f44669e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.nb0 nb0Var7 = this.h;
            nb0Var7.K = 0.0f;
            nb0Var7.i();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f44673s = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.t2(20, this, iArr));
            this.f44673s.addListener(new org.telegram.ui.Components.fk0(12, this, iArr));
            this.f44673s.setDuration((int) (fMax * 250.0f));
            this.f44673s.start();
        } else {
            if (iArr != null) {
                t11 t11Var = this.A;
                t11Var.f42753a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                t11Var.invalidate();
                System.arraycopy(iArr, 0, this.f44669e, 0, 4);
            }
            this.f44671n = null;
            this.f44674w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.G ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()).U, this.G, !z10);
        a5Var.f22727f = false;
        a5Var.f22726e = true;
        a5Var.f22733m = this.f44666a;
        a5Var.f22732l = (int) (fMax * 250.0f);
        AndroidUtilities.runOnUIThread(new cg.c(this, z10, b4Var2, a5Var, 24));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z10) {
                this.h.s(1.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new w01(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        float f10 = iMin;
        if ((iMax * 1.0f) / f10 > 1.92f) {
            iMax = (int) (f10 * 1.92f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.f44675x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.B.getAnimatedDrawable();
        t11 t11Var = this.A;
        if (t11Var != null) {
            t11Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
        this.fragmentView.layout(0, 0, iMin, iMax);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
        if (this.E != null) {
            canvas.drawBitmap(this.E, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f44675x.setVisibility(0);
        this.C.setVisibility(0);
        this.B.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        t11 t11Var2 = this.A;
        if (t11Var2 != null) {
            t11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(bitmapCreateBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e9) {
                e9.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new l11(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23973c;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f44666a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        x11 x11Var = this.f44670f;
        x11Var.getClass();
        w11 w11Var = new w11(x11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = x11Var.f44247a;
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{x11Var.f44251f}, w11Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x11Var.f44252n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x11Var.f44257y, 16, new Class[]{org.telegram.ui.Components.b11.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23143i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).f23525o = x11Var.d.f44666a;
        }
        themeDescriptions.addAll(arrayList);
        sx0 sx0Var = new sx0(3, this);
        TextView textView = this.f44670f.f44254s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, sx0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f44670f.f44254s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f44670f.f44255w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, sx0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f44670f.f44256x, 8, null, null, null, sx0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.f23525o = this.f44666a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        x11 x11Var = this.f44670f;
        x11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(x11Var, NotificationCenter.emojiLoaded);
        this.f44670f = null;
        this.D.recycle();
        this.D = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f28c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i10++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
