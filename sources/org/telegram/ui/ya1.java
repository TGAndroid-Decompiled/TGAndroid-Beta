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
public final class ya1 extends org.telegram.ui.Components.il0 {
    public final Context f44824c;
    public boolean d = true;
    public final ThemeActivity f44825e;

    public ya1(ThemeActivity themeActivity, Context context) {
        this.f44825e = themeActivity;
        this.f44824c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44825e.F0;
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
        ThemeActivity themeActivity = this.f44825e;
        if (i10 != themeActivity.W && i10 != themeActivity.G && i10 != themeActivity.X && i10 != themeActivity.U && i10 != themeActivity.L && i10 != themeActivity.M && i10 != themeActivity.I && i10 != themeActivity.H) {
            if (i10 != themeActivity.f36293b0 && i10 != themeActivity.V && i10 != themeActivity.f36313r0 && i10 != themeActivity.f36320w0 && i10 != themeActivity.C0) {
                if (i10 != themeActivity.f36308n0 && i10 != themeActivity.R && i10 != themeActivity.Y && i10 != themeActivity.K && i10 != themeActivity.f36296d0 && i10 != themeActivity.f36304j0 && i10 != themeActivity.f36301g0 && i10 != themeActivity.F && i10 != themeActivity.E0 && i10 != themeActivity.f36318v0 && i10 != themeActivity.f36322x0 && i10 != themeActivity.f36324y0 && i10 != themeActivity.f36325z0) {
                    if (i10 != themeActivity.N && i10 != themeActivity.O && i10 != themeActivity.P && i10 != themeActivity.Q) {
                        if (i10 != themeActivity.S && i10 != themeActivity.Z && i10 != themeActivity.f36295c0 && i10 != themeActivity.f36321x && i10 != themeActivity.f36298e0 && i10 != themeActivity.f36319w && i10 != themeActivity.f36302h0 && i10 != themeActivity.f36300f0 && i10 != themeActivity.f36310p0 && i10 != themeActivity.f36315s0 && i10 != themeActivity.D0 && i10 != themeActivity.A0 && i10 != themeActivity.B0) {
                            if (i10 == themeActivity.f36291a0) {
                                return 6;
                            }
                            if (i10 != themeActivity.T && i10 != themeActivity.C && i10 != themeActivity.A) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f36323y && i10 != themeActivity.f36309o0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.B) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.f36303i0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f36305k0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.m0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f36317u0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f36311q0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f36316t0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f36306l0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i10 != themeActivity.D && i10 != themeActivity.E) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        String string;
        String string2;
        boolean z10;
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
        int i24 = n1Var.f6436f;
        View view = n1Var.f6432a;
        ThemeActivity themeActivity = this.f44825e;
        boolean z11 = false;
        boolean z12 = true;
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
                                                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                h5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.g6.f23253o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.g6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.g6.f23253o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = a4.w.y(string4, " ", string3);
                                                        }
                                                        h5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f36294c.x1(themeActivity.f36292b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) view;
                                                        ab1 ab1Var = (ab1) jl0Var.getAdapter();
                                                        ab1Var.l();
                                                        int indexOf = ab1Var.f36503e.indexOf(ab1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = ab1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((f2.j0) jl0Var.getLayoutManager()).h1(indexOf, (themeActivity.f36292b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((go0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                                        if (i10 == themeActivity.D) {
                                            g6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            g6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((uu) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                                m8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    m8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.g6.q6;
                                    m8Var.e(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z11 = true;
                                    }
                                    m8Var.m(i27, string5, z11);
                                    return;
                                } else if (i10 != themeActivity.f36317u0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                m8Var.e(org.telegram.ui.ActionBar.g6.J5, org.telegram.ui.ActionBar.g6.G6);
                                                m8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                m8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                m8Var.f24715s = 64;
                                                m8Var.v = 60;
                                                m8Var.f24716w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        m8Var.e(org.telegram.ui.ActionBar.g6.J5, org.telegram.ui.ActionBar.g6.G6);
                                        m8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        m8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        m8Var.v = 60;
                                        m8Var.f24715s = 64;
                                        m8Var.f24716w = 20;
                                        return;
                                    }
                                    m8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.g6.q6;
                                    m8Var.e(i28, i28);
                                    m8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    m8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.g6.q6;
                                    m8Var.e(i29, i29);
                                    m8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (i10 == themeActivity.T) {
                                q8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.g6.f23271p, true);
                                return;
                            } else if (i10 == themeActivity.J) {
                                q8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.C) {
                                q8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.A) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    q8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.B) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            q8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f36323y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                q8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f36309o0) {
                                                q8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            q8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    q8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    q8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                q8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.g6.f23288q);
                        return;
                    }
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    if (i10 == themeActivity.S) {
                        k4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.Z) {
                        k4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f36295c0) {
                        k4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f36321x) {
                        k4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f36298e0) {
                        if (themeActivity.f36299f == 3) {
                            k4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            k4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f36319w) {
                        k4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f36302h0) {
                        k4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f36300f0) {
                        k4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f36310p0) {
                        k4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f36315s0) {
                        k4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.D0) {
                        k4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.B0) {
                        k4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.A0) {
                        k4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) view;
                if (i10 == themeActivity.N) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.g6.f23253o == 0) {
                        z11 = true;
                    }
                    daVar.a(string6, z11, true);
                    return;
                } else if (i10 == themeActivity.O) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.g6.f23253o == 1) {
                        z11 = true;
                    }
                    daVar.a(string7, z11, true);
                    return;
                } else if (i10 == themeActivity.P) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.g6.f23253o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.Q != -1) {
                        z11 = true;
                    }
                    daVar.a(string8, z10, z11);
                    return;
                } else if (i10 == themeActivity.Q) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.g6.f23253o != 3) {
                        z12 = false;
                    }
                    daVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i10 == themeActivity.f36293b0) {
                y8Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.g6.f23288q * 100.0f))));
                return;
            } else if (i10 == themeActivity.V) {
                y8Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f36313r0) {
                y8Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.C0) {
                y8Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.g6.f23253o != 0 && org.telegram.ui.ActionBar.g6.J != null) {
                y9Var.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.g6.z0(), false, false);
            } else {
                y9Var.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.W) {
            int i30 = org.telegram.ui.ActionBar.g6.f23304r;
            int i31 = i30 / 60;
            y9Var.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.X) {
            int i32 = org.telegram.ui.ActionBar.g6.f23320s;
            int i33 = i32 / 60;
            y9Var.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.U) {
            y9Var.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.f23394w, false, false);
        } else if (i10 == themeActivity.M) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            y9Var.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.L) {
            y9Var.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
        } else if (i10 == themeActivity.G) {
            int i35 = SharedConfig.distanceSystemType;
            if (i35 == 0) {
                string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
            } else if (i35 == 1) {
                string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
            } else {
                string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
            }
            String string10 = LocaleController.getString("DistanceUnits", R.string.DistanceUnits);
            boolean z13 = themeActivity.K0;
            if (themeActivity.f36325z0 < 0) {
                z12 = false;
            }
            y9Var.c(string10, string, z13, z12);
            themeActivity.K0 = false;
        } else if (i10 == themeActivity.H) {
            y9Var.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.k1.a().f44088a, themeActivity.L0, false);
        } else if (i10 == themeActivity.I) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            y9Var.c(string11, LocaleController.getString(i12), themeActivity.J0, false);
            themeActivity.J0 = false;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ?? frameLayout;
        int i11;
        int i12;
        float f9;
        float f10;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        wa1 h5Var;
        int i15;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.f44825e;
        Context context = this.f44824c;
        switch (i10) {
            case 1:
                h5Var = new org.telegram.ui.Cells.y9(context);
                break;
            case 2:
                h5Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                h5Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f24244a = textView;
                b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i20 = i12 | 48;
                if (z12) {
                    f9 = 71.0f;
                } else {
                    f9 = 21.0f;
                }
                if (z12) {
                    f10 = 21.0f;
                } else {
                    f10 = 23.0f;
                }
                frameLayout.addView(textView, i7.f6.d(-1, -1.0f, i20, f9, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f24245b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, i7.f6.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                h5Var = frameLayout;
                break;
            case 5:
                h5Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 6:
                h5Var = new ta1(this, context);
                break;
            case 7:
                h5Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                h5Var = new za1(themeActivity, context);
                break;
            case 9:
                frameLayout = new ua1(context);
                frameLayout.f43211b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.x0[]) frameLayout.f43211b;
                    if (i21 >= r32.length) {
                        h5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f25909c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f25908b = z10;
                        if (z10) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(frameLayout2, context);
                        frameLayout2.f25907a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(w0Var, i7.f6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w0Var.a(z11, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) frameLayout.f43211b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(x0Var, i7.f6.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f43211b)[i21].setOnClickListener(new lh.z1(3, frameLayout, z10));
                        i21++;
                    }
                }
                break;
            case 10:
                h5Var = new org.telegram.ui.Cells.h5(21, 60, this.f44824c, null, true);
                break;
            case 11:
                this.d = true;
                va1 va1Var = new va1(this, this.f44824c, themeActivity, themeActivity.f36299f, themeActivity.f36297e, themeActivity.d);
                themeActivity.f36294c = va1Var;
                va1Var.setDrawDivider(themeActivity.v);
                themeActivity.f36294c.setFocusable(false);
                View view = themeActivity.f36294c;
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(148.0f)));
                h5Var = view;
                break;
            case 12:
                wa1 wa1Var = new wa1(context, 0, null);
                wa1Var.setFocusable(false);
                wa1Var.setItemAnimator(null);
                wa1Var.setLayoutAnimation(null);
                wa1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                wa1Var.setClipToPadding(false);
                f2.j0 j0Var = new f2.j0();
                j0Var.j1(0);
                wa1Var.setLayoutManager(j0Var);
                ab1 ab1Var = new ab1(themeActivity, context);
                wa1Var.setAdapter(ab1Var);
                wa1Var.setOnItemClickListener(new ra1(this, ab1Var, wa1Var, 0));
                wa1Var.setOnItemLongClickListener(new kl0(22, this, ab1Var));
                wa1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(62.0f)));
                h5Var = wa1Var;
                break;
            case 13:
                h5Var = new oa1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                h5Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f30461a = paint;
                frameLayout3.f30462b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f30463c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.f30464e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f30466n = r15;
                frameLayout3.f30467r = new org.telegram.ui.Components.xi0[6];
                frameLayout3.v = new org.telegram.ui.Components.aj0[2];
                float f11 = 1.0f;
                frameLayout3.f30470x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.g6.f23047c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.g6.Y5, org.telegram.ui.ActionBar.g6.f23065d9};
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
                org.telegram.ui.Components.ky0 ky0Var = new org.telegram.ui.Components.ky0(frameLayout3, context);
                frameLayout3.f30465f = ky0Var;
                ky0Var.setMinValue(0);
                ky0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i15).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i18 = 5;
                }
                ky0Var.setMaxValue(i18);
                if (isEmpty) {
                    i22 = 5;
                }
                ky0Var.setAllItemsCount(i22);
                ky0Var.setWrapSelectorWheel(true);
                ky0Var.setFormatter(new org.telegram.ui.Components.jy0(frameLayout3));
                ky0Var.setOnValueChangedListener(new org.telegram.ui.Components.jy0(frameLayout3));
                ky0Var.setImportantForAccessibility(2);
                ky0Var.setValue(SharedConfig.getChatSwipeAction(i15));
                frameLayout3.addView(ky0Var, i7.f6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f30468s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], i7.f6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.xi0 a2 = frameLayout3.a(frameLayout3.f30465f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.K(a2.f34737e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f30465f.getValue() != 5) {
                    f11 = 0.0f;
                }
                frameLayout3.f30469w = f11;
                frameLayout3.B = frameLayout3.f30465f.getValue();
                h5Var = frameLayout3;
                break;
            case 16:
                b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                View caVar = new org.telegram.ui.Cells.ca(context, b5Var, 0);
                caVar.setImportantForAccessibility(4);
                h5Var = caVar;
                break;
            case 17:
                View uuVar = new uu(themeActivity.f36299f, context, themeActivity);
                uuVar.setFocusable(false);
                uuVar.setLayoutParams(new f2.x0(-1, -2));
                h5Var = uuVar;
                break;
            case 19:
                h5Var = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                ?? jl0Var = new org.telegram.ui.Components.jl0(context, null);
                jl0Var.T2 = new ArrayList();
                jl0Var.V2 = i16;
                jl0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                jl0Var.setFocusable(false);
                jl0Var.setItemAnimator(null);
                jl0Var.setLayoutAnimation(null);
                f2.j0 j0Var2 = new f2.j0(0, false);
                jl0Var.U2 = j0Var2;
                jl0Var.setLayoutManager(j0Var2);
                jl0Var.setAdapter(new u7(jl0Var, 1));
                jl0Var.i(new eg.f2(jl0Var, 2));
                jl0Var.setOnItemClickListener(new lh.d0(jl0Var, themeActivity, context, 3));
                jl0Var.w1();
                h5Var = jl0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                frameLayout = new go0(i17, 0L, this.f44824c, themeActivity.getResourceProvider());
                h5Var = frameLayout;
                break;
        }
        return new f2.n1(h5Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean z10;
        if (n1Var.f6436f == 4) {
            org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) n1Var.f6432a;
            if (n1Var.b() == org.telegram.ui.ActionBar.g6.f23253o) {
                z10 = true;
            } else {
                z10 = false;
            }
            daVar.setTypeChecked(z10);
        }
    }
}
