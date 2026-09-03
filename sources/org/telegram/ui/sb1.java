package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class sb1 extends org.telegram.ui.Components.rl0 {
    public final Context f41125c;
    public boolean d = true;
    public final ThemeActivity f41126e;

    public sb1(ThemeActivity themeActivity, Context context) {
        this.f41126e = themeActivity;
        this.f41125c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41126e.G0;
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
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ThemeActivity themeActivity = this.f41126e;
        if (i10 != themeActivity.X && i10 != themeActivity.H && i10 != themeActivity.Y && i10 != themeActivity.V && i10 != themeActivity.M && i10 != themeActivity.N && i10 != themeActivity.J && i10 != themeActivity.I) {
            if (i10 != themeActivity.f34875c0 && i10 != themeActivity.W && i10 != themeActivity.f34895s0 && i10 != themeActivity.f34902x0 && i10 != themeActivity.D0) {
                if (i10 != themeActivity.f34889o0 && i10 != themeActivity.S && i10 != themeActivity.Z && i10 != themeActivity.L && i10 != themeActivity.f34878e0 && i10 != themeActivity.f34885k0 && i10 != themeActivity.f34882h0 && i10 != themeActivity.G && i10 != themeActivity.F0 && i10 != themeActivity.f34900w0 && i10 != themeActivity.f34904y0 && i10 != themeActivity.f34905z0 && i10 != themeActivity.A0) {
                    if (i10 != themeActivity.O && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.R) {
                        if (i10 != themeActivity.T && i10 != themeActivity.f34871a0 && i10 != themeActivity.f34876d0 && i10 != themeActivity.f34901x && i10 != themeActivity.f34880f0 && i10 != themeActivity.f34899w && i10 != themeActivity.f34883i0 && i10 != themeActivity.f34881g0 && i10 != themeActivity.f34891q0 && i10 != themeActivity.f34896t0 && i10 != themeActivity.E0 && i10 != themeActivity.B0 && i10 != themeActivity.C0) {
                            if (i10 == themeActivity.f34873b0) {
                                return 6;
                            }
                            if (i10 != themeActivity.U && i10 != themeActivity.D && i10 != themeActivity.B) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f34903y && i10 != themeActivity.f34890p0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.C) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.f34884j0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f34886l0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f34888n0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f34898v0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f34893r0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f34897u0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.m0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i10 != themeActivity.E && i10 != themeActivity.F) {
                                                                                        i23 = themeActivity.appIconSelectorRow;
                                                                                        if (i10 != i23) {
                                                                                            i24 = themeActivity.changeUserColor;
                                                                                            if (i10 == i24) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        String string;
        String string2;
        boolean z4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String string3;
        String string4;
        int i24 = m1Var.f5879f;
        View view = m1Var.f5875a;
        ThemeActivity themeActivity = this.f41126e;
        boolean z10 = false;
        boolean z11 = true;
        if (i24 != 1) {
            if (i24 != 2) {
                if (i24 != 4) {
                    if (i24 != 5) {
                        if (i24 != 6) {
                            if (i24 != 7) {
                                if (i24 != 14) {
                                    if (i24 != 17) {
                                        if (i24 != 19) {
                                            if (i24 != 21) {
                                                switch (i24) {
                                                    case 10:
                                                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                j5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.k6.f21852o != 0) {
                                                            z10 = true;
                                                        }
                                                        if (z10) {
                                                            string3 = org.telegram.ui.ActionBar.k6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z10) {
                                                            int i25 = org.telegram.ui.ActionBar.k6.f21852o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = android.support.v4.media.a.z(string4, " ", string3);
                                                        }
                                                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f34874c.w1(themeActivity.f34872b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
                                                        ub1 ub1Var = (ub1) sl0Var.getAdapter();
                                                        ub1Var.l();
                                                        int indexOf = ub1Var.f41794e.indexOf(ub1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = ub1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((f2.j0) sl0Var.getLayoutManager()).h1(indexOf, (themeActivity.f34872b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((so0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                                        if (i10 == themeActivity.E) {
                                            i6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            i6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((dv) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                                o8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    o8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.k6.f21896q6;
                                    o8Var.e(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z10 = true;
                                    }
                                    o8Var.m(i27, string5, z10);
                                    return;
                                } else if (i10 != themeActivity.f34898v0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                o8Var.e(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                                o8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                o8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                o8Var.f23319s = 64;
                                                o8Var.v = 60;
                                                o8Var.f23320w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        o8Var.e(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                        o8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        o8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        o8Var.v = 60;
                                        o8Var.f23319s = 64;
                                        o8Var.f23320w = 20;
                                        return;
                                    }
                                    o8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.k6.f21896q6;
                                    o8Var.e(i28, i28);
                                    o8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    o8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.k6.f21896q6;
                                    o8Var.e(i29, i29);
                                    o8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (i10 == themeActivity.U) {
                                s8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.k6.f21870p, true);
                                return;
                            } else if (i10 == themeActivity.K) {
                                s8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.D) {
                                s8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.B) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    s8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.C) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            s8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f34903y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                s8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f34890p0) {
                                                s8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            s8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    s8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    s8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                s8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.k6.f21889q);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (i10 == themeActivity.T) {
                        m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f34871a0) {
                        m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f34876d0) {
                        m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f34901x) {
                        m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f34880f0) {
                        if (themeActivity.f34879f == 3) {
                            m4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f34899w) {
                        m4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f34883i0) {
                        m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f34881g0) {
                        m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f34891q0) {
                        m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f34896t0) {
                        m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        m4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.C0) {
                        m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.B0) {
                        m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                if (i10 == themeActivity.O) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.k6.f21852o == 0) {
                        z10 = true;
                    }
                    faVar.a(string6, z10, true);
                    return;
                } else if (i10 == themeActivity.P) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.k6.f21852o == 1) {
                        z10 = true;
                    }
                    faVar.a(string7, z10, true);
                    return;
                } else if (i10 == themeActivity.Q) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.k6.f21852o == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (themeActivity.R != -1) {
                        z10 = true;
                    }
                    faVar.a(string8, z4, z10);
                    return;
                } else if (i10 == themeActivity.R) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.k6.f21852o != 3) {
                        z11 = false;
                    }
                    faVar.a(string9, z11, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i10 == themeActivity.f34875c0) {
                a9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.f21889q * 100.0f))));
                return;
            } else if (i10 == themeActivity.W) {
                a9Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f34895s0) {
                a9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.D0) {
                a9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.k6.f21852o != 0 && org.telegram.ui.ActionBar.k6.J != null) {
                aaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.k6.z0(), false, false);
            } else {
                aaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.X) {
            int i30 = org.telegram.ui.ActionBar.k6.f21907r;
            int i31 = i30 / 60;
            aaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.Y) {
            int i32 = org.telegram.ui.ActionBar.k6.f21924s;
            int i33 = i32 / 60;
            aaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.V) {
            aaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.f21993w, false, false);
        } else if (i10 == themeActivity.N) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            aaVar.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.M) {
            aaVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
        } else if (i10 == themeActivity.H) {
            int i35 = SharedConfig.distanceSystemType;
            if (i35 == 0) {
                string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
            } else if (i35 == 1) {
                string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
            } else {
                string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
            }
            String string10 = LocaleController.getString("DistanceUnits", R.string.DistanceUnits);
            boolean z12 = themeActivity.L0;
            if (themeActivity.A0 < 0) {
                z11 = false;
            }
            aaVar.c(string10, string, z12, z11);
            themeActivity.L0 = false;
        } else if (i10 == themeActivity.I) {
            aaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.m1.a().f42601a, themeActivity.M0, false);
        } else if (i10 == themeActivity.J) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            aaVar.c(string11, LocaleController.getString(i12), themeActivity.K0, false);
            themeActivity.K0 = false;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ?? frameLayout;
        int i11;
        int i12;
        float f10;
        float f11;
        boolean z4;
        int i13;
        boolean z10;
        int i14;
        qb1 j5Var;
        int i15;
        org.telegram.ui.ActionBar.f5 f5Var;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.f41126e;
        Context context = this.f41125c;
        switch (i10) {
            case 1:
                j5Var = new org.telegram.ui.Cells.aa(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f22821a = textView;
                b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i20 = i12 | 48;
                if (z11) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (z11) {
                    f11 = 21.0f;
                } else {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, k7.c6.d(-1, -1.0f, i20, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f22822b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, k7.c6.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = frameLayout;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new nb1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                j5Var = new tb1(themeActivity, context);
                break;
            case 9:
                frameLayout = new ob1(context);
                frameLayout.f39651b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.x0[]) frameLayout.f39651b;
                    if (i21 >= r32.length) {
                        j5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f24390c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f24389b = z4;
                        if (z4) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(frameLayout2, context);
                        frameLayout2.f24388a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(w0Var, k7.c6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z4 && SharedConfig.useThreeLinesLayout) || (!z4 && !SharedConfig.useThreeLinesLayout)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w0Var.a(z10, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) frameLayout.f39651b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(x0Var, k7.c6.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f39651b)[i21].setOnClickListener(new oh.b2(3, frameLayout, z4));
                        i21++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.f41125c, null, true);
                break;
            case 11:
                this.d = true;
                pb1 pb1Var = new pb1(this, this.f41125c, themeActivity, themeActivity.f34879f, themeActivity.f34877e, themeActivity.d);
                themeActivity.f34874c = pb1Var;
                pb1Var.setDrawDivider(themeActivity.v);
                themeActivity.f34874c.setFocusable(false);
                View view = themeActivity.f34874c;
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                qb1 qb1Var = new qb1(context, 0, null);
                qb1Var.setFocusable(false);
                qb1Var.setItemAnimator(null);
                qb1Var.setLayoutAnimation(null);
                qb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                qb1Var.setClipToPadding(false);
                f2.j0 j0Var = new f2.j0();
                j0Var.j1(0);
                qb1Var.setLayoutManager(j0Var);
                ub1 ub1Var = new ub1(themeActivity, context);
                qb1Var.setAdapter(ub1Var);
                qb1Var.setOnItemClickListener(new lb1(this, ub1Var, qb1Var, 0));
                qb1Var.setOnItemLongClickListener(new vl0(21, this, ub1Var));
                qb1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(62.0f)));
                j5Var = qb1Var;
                break;
            case 13:
                j5Var = new ib1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.o8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f32848a = paint;
                frameLayout3.f32849b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f32850c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.f32851e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f32853n = r15;
                frameLayout3.f32854r = new org.telegram.ui.Components.hj0[6];
                frameLayout3.v = new org.telegram.ui.Components.kj0[2];
                float f12 = 1.0f;
                frameLayout3.f32857x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.k6.f21646c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.f21664d9};
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(frameLayout3, context);
                frameLayout3.f32852f = vy0Var;
                vy0Var.setMinValue(0);
                vy0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i15).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i18 = 5;
                }
                vy0Var.setMaxValue(i18);
                if (isEmpty) {
                    i22 = 5;
                }
                vy0Var.setAllItemsCount(i22);
                vy0Var.setWrapSelectorWheel(true);
                vy0Var.setFormatter(new org.telegram.ui.Components.uy0(frameLayout3));
                vy0Var.setOnValueChangedListener(new org.telegram.ui.Components.uy0(frameLayout3));
                vy0Var.setImportantForAccessibility(2);
                vy0Var.setValue(SharedConfig.getChatSwipeAction(i15));
                frameLayout3.addView(vy0Var, k7.c6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f32855s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], k7.c6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.hj0 a2 = frameLayout3.a(frameLayout3.f32852f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.K(a2.f27524e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f32852f.getValue() != 5) {
                    f12 = 0.0f;
                }
                frameLayout3.f32856w = f12;
                frameLayout3.C = frameLayout3.f32852f.getValue();
                j5Var = frameLayout3;
                break;
            case 16:
                f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
                View eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 0);
                eaVar.setImportantForAccessibility(4);
                j5Var = eaVar;
                break;
            case 17:
                View dvVar = new dv(themeActivity.f34879f, context, themeActivity);
                dvVar.setFocusable(false);
                dvVar.setLayoutParams(new f2.x0(-1, -2));
                j5Var = dvVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? sl0Var = new org.telegram.ui.Components.sl0(context, null);
                sl0Var.U2 = new ArrayList();
                sl0Var.W2 = i16;
                sl0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                sl0Var.setFocusable(false);
                sl0Var.setItemAnimator(null);
                sl0Var.setLayoutAnimation(null);
                f2.j0 j0Var2 = new f2.j0(0, false);
                sl0Var.V2 = j0Var2;
                sl0Var.setLayoutManager(j0Var2);
                sl0Var.setAdapter(new y7(sl0Var, 1));
                sl0Var.i(new hg.e2(sl0Var, 1));
                sl0Var.setOnItemClickListener(new oh.d0(sl0Var, themeActivity, context, 1));
                sl0Var.v1();
                j5Var = sl0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                frameLayout = new so0(i17, 0L, this.f41125c, themeActivity.getResourceProvider());
                j5Var = frameLayout;
                break;
        }
        return new f2.m1(j5Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        if (m1Var.f5879f == 4) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) m1Var.f5875a;
            if (m1Var.b() == org.telegram.ui.ActionBar.k6.f21852o) {
                z4 = true;
            } else {
                z4 = false;
            }
            faVar.setTypeChecked(z4);
        }
    }
}
