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
public final class z00 extends og.b {
    public final Context d;
    public final c10 e;

    public z00(c10 c10Var, Context context) {
        this.e = c10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.P.size();
    }

    @Override
    public final int j(int i10) {
        t00 t00Var = (t00) this.e.P.get(i10);
        if (t00Var == null) {
            return 3;
        }
        return t00Var.f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.P;
        t00 t00Var = (t00) arrayList.get(i10);
        if (t00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((t00) arrayList.get(i14)).f15508a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f42630f;
            View view = c1Var.f42627a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.f9) view).setText(t00Var.d);
                                return;
                            case 7:
                                ((v00) view).e(t00Var.f37484m, z10);
                                return;
                            case 8:
                                j00 j00Var = (j00) view;
                                if (j00Var.f34296c != z10) {
                                    j00Var.f34296c = z10;
                                    j00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                q00 q00Var = (q00) view;
                                c10Var.I = q00Var;
                                q00Var.e(org.telegram.ui.Components.z5.cloneSpans(c10Var.f32226w, -1, q00Var.f36234s.getPaint().getFontMetricsInt(), 0.5f), false);
                                q00 q00Var2 = c10Var.I;
                                if (c10Var.getUserConfig().isPremium()) {
                                    i16 = c10Var.E;
                                }
                                q00Var2.d(i16, false);
                                c10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                rp0 rp0Var = (rp0) view;
                                rp0Var.setCloseAsLock(!c10Var.getUserConfig().isPremium());
                                if (c10Var.getUserConfig().isPremium()) {
                                    i16 = c10Var.E;
                                }
                                rp0Var.a(i16, false);
                                rp0Var.setOnColorClick(new dt(3, this, rp0Var));
                                return;
                            case 11:
                                r00 r00Var = (r00) view;
                                c10Var.J = r00Var;
                                r00Var.setText(t00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = r00Var.f36649r;
                                u3Var.setText(t00Var.e);
                                u3Var.setOnClickListener(t00Var.f37477c);
                                return;
                            default:
                                return;
                        }
                    }
                    h00 h00Var = (h00) view;
                    boolean z12 = t00Var.f37483l;
                    ImageView imageView = h00Var.f33695a;
                    TextView textView = h00Var.f33696b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.h6.f19026q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f18990o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.h6.f19008p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.h6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    int i17 = t00Var.f37482k;
                    CharSequence charSequence = t00Var.d;
                    ImageView imageView2 = h00Var.f33695a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f7);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = h00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        h00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (h00Var.f33697c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    h00Var.d = z10;
                    h00Var.setWillNotDraw(!z10);
                    h00Var.f33697c = i17;
                    return;
                }
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                String str = t00Var.f37480i;
                if (str != null) {
                    bbVar.d(str, t00Var.d, null, z10);
                    return;
                }
                long j3 = t00Var.h;
                if (j3 > 0) {
                    TLRPC.User user = c10Var.getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        bbVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = c10Var.getMessagesController().getChat(Long.valueOf(-j3));
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
                    bbVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (t00Var.f37478f) {
                m4Var.setText(c10.x0(0, t00Var.d, false));
            } else {
                m4Var.setText(t00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.bb bbVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        Context context = this.d;
        c10 c10Var = this.e;
        switch (i10) {
            case 0:
                bbVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.bb bbVar2 = new org.telegram.ui.Cells.bb(context, 6, 0, false);
                bbVar2.setSelfAsSavedMessages(true);
                bbVar = bbVar2;
                break;
            case 2:
                org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) c10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, pv0Var, string, false, 12, d6Var);
                c10Var.K = f3Var;
                f3Var.f20030n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f20027b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(c10Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(c10Var.f32226w);
                i11 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, c10Var.f32227x);
                org.telegram.ui.Components.cu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new x00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                bbVar = f3Var;
                break;
            case 3:
                bbVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f33695a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.x5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f33696b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                int i17 = 24;
                if (z10) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z10) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (LocaleController.isRTL) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                bbVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f37095a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                bbVar = frameLayout2;
                break;
            case 6:
            default:
                bbVar = new org.telegram.ui.Cells.f9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                bbVar = new y00(this, this.d, c10Var, i14, c10Var.f32224r.f15577id);
                break;
            case 8:
                bbVar = new j00(context);
                break;
            case 9:
                bbVar = new q00(c10Var, context);
                break;
            case 10:
                Activity parentActivity = c10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                bbVar = new rp0(2, i15, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                bbVar = new r00(context, d6Var3);
                break;
        }
        return new s4.c1(bbVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 2 && i10 == 9) {
            c10 c10Var = this.e;
            ((q00) c1Var.f42627a).e(org.telegram.ui.Components.z5.cloneSpans(c10Var.f32226w, -1, c10Var.I.f36234s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f42630f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) c1Var.f42627a;
            f3Var.f20027b.k(true);
            f3Var.f20027b.d();
        }
    }
}
