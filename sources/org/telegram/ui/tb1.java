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
public final class tb1 extends org.telegram.ui.Components.ql0 {
    public final Context f38452c;
    public boolean d = true;
    public final ThemeActivity e;

    public tb1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f38452c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.G0;
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
        ThemeActivity themeActivity = this.e;
        if (i10 != themeActivity.X && i10 != themeActivity.H && i10 != themeActivity.Y && i10 != themeActivity.V && i10 != themeActivity.M && i10 != themeActivity.N && i10 != themeActivity.J && i10 != themeActivity.I) {
            if (i10 != themeActivity.f32310c0 && i10 != themeActivity.W && i10 != themeActivity.f32329s0 && i10 != themeActivity.f32336x0 && i10 != themeActivity.D0) {
                if (i10 != themeActivity.f32323o0 && i10 != themeActivity.S && i10 != themeActivity.Z && i10 != themeActivity.L && i10 != themeActivity.f32312e0 && i10 != themeActivity.f32319k0 && i10 != themeActivity.f32316h0 && i10 != themeActivity.G && i10 != themeActivity.F0 && i10 != themeActivity.f32334w0 && i10 != themeActivity.f32338y0 && i10 != themeActivity.f32339z0 && i10 != themeActivity.A0) {
                    if (i10 != themeActivity.O && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.R) {
                        if (i10 != themeActivity.T && i10 != themeActivity.f32306a0 && i10 != themeActivity.f32311d0 && i10 != themeActivity.f32335x && i10 != themeActivity.f32314f0 && i10 != themeActivity.f32333w && i10 != themeActivity.f32317i0 && i10 != themeActivity.f32315g0 && i10 != themeActivity.f32325q0 && i10 != themeActivity.f32330t0 && i10 != themeActivity.E0 && i10 != themeActivity.B0 && i10 != themeActivity.C0) {
                            if (i10 == themeActivity.f32308b0) {
                                return 6;
                            }
                            if (i10 != themeActivity.U && i10 != themeActivity.D && i10 != themeActivity.B) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f32337y && i10 != themeActivity.f32324p0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.C) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.f32318j0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f32320l0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f32322n0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f32332v0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f32327r0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f32331u0) {
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
    public final void v(f2.l1 l1Var, int i10) {
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
        int i24 = l1Var.f5777f;
        View view = l1Var.f5774a;
        ThemeActivity themeActivity = this.e;
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
                                                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                i5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.j6.f20071o != 0) {
                                                            z10 = true;
                                                        }
                                                        if (z10) {
                                                            string3 = org.telegram.ui.ActionBar.j6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z10) {
                                                            int i25 = org.telegram.ui.ActionBar.j6.f20071o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = android.support.v4.media.a.z(string4, " ", string3);
                                                        }
                                                        i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f32309c.w1(themeActivity.f32307b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) view;
                                                        vb1 vb1Var = (vb1) rl0Var.getAdapter();
                                                        vb1Var.l();
                                                        int indexOf = vb1Var.e.indexOf(vb1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = vb1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((f2.i0) rl0Var.getLayoutManager()).h1(indexOf, (themeActivity.f32307b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
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
                                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                                        if (i10 == themeActivity.E) {
                                            h6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            h6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((ev) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                                n8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    n8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.j6.f20115q6;
                                    n8Var.e(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z10 = true;
                                    }
                                    n8Var.m(i27, string5, z10);
                                    return;
                                } else if (i10 != themeActivity.f32332v0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                n8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                                n8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                n8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                n8Var.f21443s = 64;
                                                n8Var.v = 60;
                                                n8Var.f21444w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        n8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                        n8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        n8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        n8Var.v = 60;
                                        n8Var.f21443s = 64;
                                        n8Var.f21444w = 20;
                                        return;
                                    }
                                    n8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.j6.f20115q6;
                                    n8Var.e(i28, i28);
                                    n8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    n8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.j6.f20115q6;
                                    n8Var.e(i29, i29);
                                    n8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (i10 == themeActivity.U) {
                                r8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.j6.f20089p, true);
                                return;
                            } else if (i10 == themeActivity.K) {
                                r8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.D) {
                                r8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.B) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    r8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.C) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            r8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f32337y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                r8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f32324p0) {
                                                r8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            r8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    r8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    r8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                r8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.j6.f20108q);
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (i10 == themeActivity.T) {
                        l4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f32306a0) {
                        l4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f32311d0) {
                        l4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f32335x) {
                        l4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f32314f0) {
                        if (themeActivity.f32313f == 3) {
                            l4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            l4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f32333w) {
                        l4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f32317i0) {
                        l4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f32315g0) {
                        l4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f32325q0) {
                        l4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f32330t0) {
                        l4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        l4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.C0) {
                        l4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.B0) {
                        l4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                if (i10 == themeActivity.O) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.j6.f20071o == 0) {
                        z10 = true;
                    }
                    eaVar.a(string6, z10, true);
                    return;
                } else if (i10 == themeActivity.P) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.j6.f20071o == 1) {
                        z10 = true;
                    }
                    eaVar.a(string7, z10, true);
                    return;
                } else if (i10 == themeActivity.Q) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.j6.f20071o == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (themeActivity.R != -1) {
                        z10 = true;
                    }
                    eaVar.a(string8, z4, z10);
                    return;
                } else if (i10 == themeActivity.R) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.j6.f20071o != 3) {
                        z11 = false;
                    }
                    eaVar.a(string9, z11, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i10 == themeActivity.f32310c0) {
                z8Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f20108q * 100.0f))));
                return;
            } else if (i10 == themeActivity.W) {
                z8Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f32329s0) {
                z8Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.D0) {
                z8Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.j6.f20071o != 0 && org.telegram.ui.ActionBar.j6.J != null) {
                z9Var.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.j6.z0(), false, false);
            } else {
                z9Var.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.X) {
            int i30 = org.telegram.ui.ActionBar.j6.f20125r;
            int i31 = i30 / 60;
            z9Var.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.Y) {
            int i32 = org.telegram.ui.ActionBar.j6.f20143s;
            int i33 = i32 / 60;
            z9Var.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.V) {
            z9Var.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f20212w, false, false);
        } else if (i10 == themeActivity.N) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            z9Var.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.M) {
            z9Var.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
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
            z9Var.c(string10, string, z12, z11);
            themeActivity.L0 = false;
        } else if (i10 == themeActivity.I) {
            z9Var.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.n1.a().f39536a, themeActivity.M0, false);
        } else if (i10 == themeActivity.J) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            z9Var.c(string11, LocaleController.getString(i12), themeActivity.K0, false);
            themeActivity.K0 = false;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ?? frameLayout;
        int i11;
        int i12;
        float f10;
        float f11;
        boolean z4;
        int i13;
        boolean z10;
        int i14;
        rb1 i5Var;
        int i15;
        org.telegram.ui.ActionBar.e5 e5Var;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.e;
        Context context = this.f38452c;
        switch (i10) {
            case 1:
                i5Var = new org.telegram.ui.Cells.z9(context);
                break;
            case 2:
                i5Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                i5Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f21009a = textView;
                b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                frameLayout.addView(textView, k7.b6.d(-1, -1.0f, i20, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f21010b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, k7.b6.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                i5Var = frameLayout;
                break;
            case 5:
                i5Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 6:
                i5Var = new ob1(this, context);
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                i5Var = new ub1(themeActivity, context);
                break;
            case 9:
                frameLayout = new pb1(context);
                frameLayout.f37071b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.x0[]) frameLayout.f37071b;
                    if (i21 >= r32.length) {
                        i5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f22535c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f22534b = z4;
                        if (z4) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(frameLayout2, context);
                        frameLayout2.f22533a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(w0Var, k7.b6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z4 && SharedConfig.useThreeLinesLayout) || (!z4 && !SharedConfig.useThreeLinesLayout)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w0Var.a(z10, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) frameLayout.f37071b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(x0Var, k7.b6.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f37071b)[i21].setOnClickListener(new nh.a2(3, frameLayout, z4));
                        i21++;
                    }
                }
                break;
            case 10:
                i5Var = new org.telegram.ui.Cells.i5(21, 60, this.f38452c, null, true);
                break;
            case 11:
                this.d = true;
                qb1 qb1Var = new qb1(this, this.f38452c, themeActivity, themeActivity.f32313f, themeActivity.e, themeActivity.d);
                themeActivity.f32309c = qb1Var;
                qb1Var.setDrawDivider(themeActivity.v);
                themeActivity.f32309c.setFocusable(false);
                View view = themeActivity.f32309c;
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(148.0f)));
                i5Var = view;
                break;
            case 12:
                rb1 rb1Var = new rb1(context, 0, null);
                rb1Var.setFocusable(false);
                rb1Var.setItemAnimator(null);
                rb1Var.setLayoutAnimation(null);
                rb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                rb1Var.setClipToPadding(false);
                f2.i0 i0Var = new f2.i0();
                i0Var.j1(0);
                rb1Var.setLayoutManager(i0Var);
                vb1 vb1Var = new vb1(themeActivity, context);
                rb1Var.setAdapter(vb1Var);
                rb1Var.setOnItemClickListener(new mb1(this, vb1Var, rb1Var, 0));
                rb1Var.setOnItemLongClickListener(new vl0(21, this, vb1Var));
                rb1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(62.0f)));
                i5Var = rb1Var;
                break;
            case 13:
                i5Var = new jb1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                i5Var = new org.telegram.ui.Cells.n8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f30377a = paint;
                frameLayout3.f30378b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f30379c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f30381n = r15;
                frameLayout3.f30382r = new org.telegram.ui.Components.gj0[6];
                frameLayout3.v = new org.telegram.ui.Components.jj0[2];
                float f12 = 1.0f;
                frameLayout3.f30385x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.j6.f19866c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.f19884d9};
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
                frameLayout3.f30380f = vy0Var;
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
                frameLayout3.addView(vy0Var, k7.b6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f30383s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], k7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.gj0 a2 = frameLayout3.a(frameLayout3.f30380f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.K(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f30380f.getValue() != 5) {
                    f12 = 0.0f;
                }
                frameLayout3.f30384w = f12;
                frameLayout3.C = frameLayout3.f30380f.getValue();
                i5Var = frameLayout3;
                break;
            case 16:
                e5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
                View daVar = new org.telegram.ui.Cells.da(context, e5Var, 0);
                daVar.setImportantForAccessibility(4);
                i5Var = daVar;
                break;
            case 17:
                View evVar = new ev(themeActivity.f32313f, context, themeActivity);
                evVar.setFocusable(false);
                evVar.setLayoutParams(new f2.w0(-1, -2));
                i5Var = evVar;
                break;
            case 19:
                i5Var = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? rl0Var = new org.telegram.ui.Components.rl0(context, null);
                rl0Var.U2 = new ArrayList();
                rl0Var.W2 = i16;
                rl0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                rl0Var.setFocusable(false);
                rl0Var.setItemAnimator(null);
                rl0Var.setLayoutAnimation(null);
                f2.i0 i0Var2 = new f2.i0(0, false);
                rl0Var.V2 = i0Var2;
                rl0Var.setLayoutManager(i0Var2);
                rl0Var.setAdapter(new a8(rl0Var, 1));
                rl0Var.i(new gg.e2(rl0Var, 1));
                rl0Var.setOnItemClickListener(new nh.e0(rl0Var, themeActivity, context, 1));
                rl0Var.v1();
                i5Var = rl0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                frameLayout = new so0(i17, 0L, this.f38452c, themeActivity.getResourceProvider());
                i5Var = frameLayout;
                break;
        }
        return new f2.l1(i5Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean z4;
        if (l1Var.f5777f == 4) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) l1Var.f5774a;
            if (l1Var.b() == org.telegram.ui.ActionBar.j6.f20071o) {
                z4 = true;
            } else {
                z4 = false;
            }
            eaVar.setTypeChecked(z4);
        }
    }
}
