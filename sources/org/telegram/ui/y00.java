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
public final class y00 extends cg.c {
    public final Context d;
    public final b10 f43511e;

    public y00(b10 b10Var, Context context) {
        this.f43511e = b10Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43511e.M.size();
    }

    @Override
    public final int j(int i10) {
        s00 s00Var = (s00) this.f43511e.M.get(i10);
        if (s00Var == null) {
            return 3;
        }
        return s00Var.f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        b10 b10Var = this.f43511e;
        ArrayList arrayList = b10Var.M;
        s00 s00Var = (s00) arrayList.get(i10);
        if (s00Var != null) {
            int i14 = i10 + 1;
            boolean z10 = false;
            if (i14 < arrayList.size() && (i13 = ((s00) arrayList.get(i14)).f2505a) != 3 && i13 != 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i15 = m1Var.f5879f;
            View view = m1Var.f5875a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.a9) view).setText(s00Var.d);
                                return;
                            case 7:
                                ((u00) view).e(s00Var.f41093m, z4);
                                return;
                            case 8:
                                j00 j00Var = (j00) view;
                                if (j00Var.f37967c != z4) {
                                    j00Var.f37967c = z4;
                                    j00Var.setWillNotDraw(!z4);
                                    return;
                                }
                                return;
                            case 9:
                                p00 p00Var = (p00) view;
                                b10Var.F = p00Var;
                                p00Var.e(org.telegram.ui.Components.u5.cloneSpans(b10Var.f35297w, -1, p00Var.f39888s.getPaint().getFontMetricsInt(), 0.5f), false);
                                p00 p00Var2 = b10Var.F;
                                if (b10Var.getUserConfig().isPremium()) {
                                    i16 = b10Var.B;
                                }
                                p00Var2.d(i16, false);
                                b10Var.F.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                gp0 gp0Var = (gp0) view;
                                gp0Var.setCloseAsLock(!b10Var.getUserConfig().isPremium());
                                if (b10Var.getUserConfig().isPremium()) {
                                    i16 = b10Var.B;
                                }
                                gp0Var.a(i16, false);
                                gp0Var.setOnColorClick(new org.telegram.ui.Components.xk(13, this, gp0Var));
                                return;
                            case 11:
                                q00 q00Var = (q00) view;
                                b10Var.G = q00Var;
                                q00Var.setText(s00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = q00Var.f40315r;
                                t3Var.setText(s00Var.f41086e);
                                t3Var.setOnClickListener(s00Var.f41085c);
                                return;
                            default:
                                return;
                        }
                    }
                    h00 h00Var = (h00) view;
                    boolean z11 = s00Var.f41092l;
                    ImageView imageView = h00Var.f37299a;
                    TextView textView = h00Var.f37300b;
                    if (z11) {
                        i11 = org.telegram.ui.ActionBar.k6.f21895q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21857o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z11) {
                        i12 = org.telegram.ui.ActionBar.k6.f21876p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.k6.f21894q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    int i17 = s00Var.f41091k;
                    CharSequence charSequence = s00Var.d;
                    ImageView imageView2 = h00Var.f37299a;
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
                    Boolean bool = h00Var.f37302e;
                    if (bool == null || bool.booleanValue() != z10) {
                        h00Var.f37302e = Boolean.valueOf(z10);
                        float f11 = 0.0f;
                        if (h00Var.f37301c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z10) {
                                f11 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        } else {
                            if (z10) {
                                f11 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    h00Var.d = z4;
                    h00Var.setWillNotDraw(!z4);
                    h00Var.f37301c = i17;
                    return;
                }
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                String str = s00Var.f41089i;
                if (str != null) {
                    vaVar.d(str, s00Var.d, null, z4);
                    return;
                }
                long j10 = s00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = b10Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        vaVar.d(user, null, string2, z4);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = b10Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    vaVar.d(chat, null, string, z4);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (s00Var.f41087f) {
                m4Var.setText(b10.x0(0, s00Var.d, false));
            } else {
                m4Var.setText(s00Var.d);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.va vaVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context = this.d;
        b10 b10Var = this.f43511e;
        switch (i10) {
            case 0:
                vaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar2 = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar2.setSelfAsSavedMessages(true);
                vaVar = vaVar2;
                break;
            case 2:
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) b10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                g6Var = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, qv0Var, string, false, 12, g6Var);
                b10Var.H = f3Var;
                f3Var.f22797n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f22793b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(b10Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(b10Var.f35297w);
                i11 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                org.telegram.ui.Components.l5.s(i11, b10Var.f35298x);
                org.telegram.ui.Components.xt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new w00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                vaVar = f3Var;
                break;
            case 3:
                vaVar = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f37302e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f37299a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, k7.c6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f37300b = textView;
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
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                vaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f40736a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, k7.c6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                vaVar = frameLayout2;
                break;
            case 6:
            default:
                vaVar = new org.telegram.ui.Cells.a9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                vaVar = new x00(this, this.d, b10Var, i14, b10Var.f35295r.f18055id);
                break;
            case 8:
                vaVar = new j00(context);
                break;
            case 9:
                vaVar = new p00(b10Var, context);
                break;
            case 10:
                Activity parentActivity = b10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                g6Var2 = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                vaVar = new gp0(2, i15, parentActivity, g6Var2);
                break;
            case 11:
                g6Var3 = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                vaVar = new q00(context, g6Var3);
                break;
        }
        return new f2.m1(vaVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 2 && i10 == 9) {
            b10 b10Var = this.f43511e;
            ((p00) m1Var.f5875a).e(org.telegram.ui.Components.u5.cloneSpans(b10Var.f35297w, -1, b10Var.F.f39888s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) m1Var.f5875a;
            f3Var.f22793b.k(true);
            f3Var.f22793b.d();
        }
    }
}
