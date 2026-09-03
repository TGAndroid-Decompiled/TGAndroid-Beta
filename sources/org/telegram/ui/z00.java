package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z00 extends bg.c {
    public final Context d;
    public final c10 e;

    public z00(c10 c10Var, Context context) {
        this.e = c10Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.M.size();
    }

    @Override
    public final int j(int i10) {
        t00 t00Var = (t00) this.e.M.get(i10);
        if (t00Var == null) {
            return 3;
        }
        return t00Var.f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.M;
        t00 t00Var = (t00) arrayList.get(i10);
        if (t00Var != null) {
            int i14 = i10 + 1;
            boolean z10 = false;
            if (i14 < arrayList.size() && (i13 = ((t00) arrayList.get(i14)).f1830a) != 3 && i13 != 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i15 = l1Var.f5777f;
            View view = l1Var.f5774a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.z8) view).setText(t00Var.d);
                                return;
                            case 7:
                                ((v00) view).e(t00Var.f38350m, z4);
                                return;
                            case 8:
                                k00 k00Var = (k00) view;
                                if (k00Var.f35397c != z4) {
                                    k00Var.f35397c = z4;
                                    k00Var.setWillNotDraw(!z4);
                                    return;
                                }
                                return;
                            case 9:
                                q00 q00Var = (q00) view;
                                c10Var.F = q00Var;
                                q00Var.e(org.telegram.ui.Components.u5.cloneSpans(c10Var.f32983w, -1, q00Var.f37266s.getPaint().getFontMetricsInt(), 0.5f), false);
                                q00 q00Var2 = c10Var.F;
                                if (c10Var.getUserConfig().isPremium()) {
                                    i16 = c10Var.B;
                                }
                                q00Var2.d(i16, false);
                                c10Var.F.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                kp0 kp0Var = (kp0) view;
                                kp0Var.setCloseAsLock(!c10Var.getUserConfig().isPremium());
                                if (c10Var.getUserConfig().isPremium()) {
                                    i16 = c10Var.B;
                                }
                                kp0Var.a(i16, false);
                                kp0Var.setOnColorClick(new org.telegram.ui.Components.vk(13, this, kp0Var));
                                return;
                            case 11:
                                r00 r00Var = (r00) view;
                                c10Var.G = r00Var;
                                r00Var.setText(t00Var.d);
                                org.telegram.ui.Cells.s3 s3Var = r00Var.f37671r;
                                s3Var.setText(t00Var.e);
                                s3Var.setOnClickListener(t00Var.f38343c);
                                return;
                            default:
                                return;
                        }
                    }
                    i00 i00Var = (i00) view;
                    boolean z11 = t00Var.f38349l;
                    ImageView imageView = i00Var.f34786a;
                    TextView textView = i00Var.f34787b;
                    if (z11) {
                        i11 = org.telegram.ui.ActionBar.j6.f20116q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20078o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z11) {
                        i12 = org.telegram.ui.ActionBar.j6.f20097p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.j6.f20115q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    int i17 = t00Var.f38348k;
                    CharSequence charSequence = t00Var.d;
                    ImageView imageView2 = i00Var.f34786a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f10 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f10);
                    }
                    textView.setText(charSequence);
                    if (!z4 && i17 != 0) {
                        z10 = true;
                    }
                    Boolean bool = i00Var.e;
                    if (bool == null || bool.booleanValue() != z10) {
                        i00Var.e = Boolean.valueOf(z10);
                        float f11 = 0.0f;
                        if (i00Var.f34788c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z10) {
                                f11 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                        } else {
                            if (z10) {
                                f11 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    i00Var.d = z4;
                    i00Var.setWillNotDraw(!z4);
                    i00Var.f34788c = i17;
                    return;
                }
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                String str = t00Var.f38346i;
                if (str != null) {
                    uaVar.d(str, t00Var.d, null, z4);
                    return;
                }
                long j10 = t00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = c10Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        uaVar.d(user, null, string2, z4);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = c10Var.getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        string = LocaleController.getString(R.string.Community);
                    } else if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                        } else {
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                        }
                    } else if (!ChatObject.isPublic(chat)) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            string = LocaleController.getString(R.string.ChannelPrivate);
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate);
                        }
                    } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ChannelPublic);
                    } else {
                        string = LocaleController.getString(R.string.MegaPublic);
                    }
                    uaVar.d(chat, null, string, z4);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (t00Var.f38344f) {
                l4Var.setText(c10.x0(0, t00Var.d, false));
            } else {
                l4Var.setText(t00Var.d);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ua uaVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        c10 c10Var = this.e;
        switch (i10) {
            case 0:
                uaVar = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ua uaVar2 = new org.telegram.ui.Cells.ua(context, 6, 0, false);
                uaVar2.setSelfAsSavedMessages(true);
                uaVar = uaVar2;
                break;
            case 2:
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) c10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                ?? e3Var = new org.telegram.ui.Cells.e3(this.d, qv0Var, string, false, 12, f6Var);
                c10Var.H = e3Var;
                e3Var.f20989n = false;
                org.telegram.ui.Cells.c3 c3Var = e3Var.f20986b;
                c3Var.getEditText().setEmojiColor(Integer.valueOf(c10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                c3Var.setEmojiViewCacheType(25);
                c3Var.setText(c10Var.f32983w);
                i11 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                org.telegram.ui.Components.l5.s(i11, c10Var.f32984x);
                org.telegram.ui.Components.ut editText = c3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.g3());
                editText.addTextChangedListener(new x00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                c3Var.getEditText().setImeOptions(268435462);
                uaVar = e3Var;
                break;
            case 3:
                uaVar = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f34786a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, k7.b6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f34787b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z4 = LocaleController.isRTL;
                int i17 = 24;
                if (z4) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z4) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (LocaleController.isRTL) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z10 = LocaleController.isRTL;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 72.0f;
                }
                if (z10) {
                    f11 = 72.0f;
                } else {
                    f11 = 0.0f;
                }
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                uaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f38082a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, k7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                uaVar = frameLayout2;
                break;
            case 6:
            default:
                uaVar = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                uaVar = new y00(this, this.d, c10Var, i14, c10Var.f32981r.f16649id);
                break;
            case 8:
                uaVar = new k00(context);
                break;
            case 9:
                uaVar = new q00(c10Var, context);
                break;
            case 10:
                Activity parentActivity = c10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                uaVar = new kp0(2, i15, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                uaVar = new r00(context, f6Var3);
                break;
        }
        return new f2.l1(uaVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 2 && i10 == 9) {
            c10 c10Var = this.e;
            ((q00) l1Var.f5774a).e(org.telegram.ui.Components.u5.cloneSpans(c10Var.f32983w, -1, c10Var.F.f37266s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        if (l1Var.f5777f == 2) {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) l1Var.f5774a;
            e3Var.f20986b.k(true);
            e3Var.f20986b.d();
        }
    }
}
