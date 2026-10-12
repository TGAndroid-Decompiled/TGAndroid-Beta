package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class qq extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public int B0;
    public int C0;
    public int D0;
    public final boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public float J;
    public int J0;
    public boolean K;
    public int K0;
    public final boolean L;
    public int L0;
    public final TLRPC.TL_chatAdminRights M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public TLRPC.TL_chatBannedRights O;
    public boolean O0;
    public final TLRPC.TL_chatBannedRights P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final String R;
    public int R0;
    public String S;
    public int S0;
    public final String T;
    public boolean T0;
    public final boolean U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public nq X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public pq f41387a;
    public int f41388a0;
    public final boolean f41389a1;
    public ai.w0 f41390b;
    public int f41391b0;
    public ValueAnimator f41392b1;
    public gg.a0 f41393c;
    public int f41394c0;
    public ValueAnimator f41395c1;
    public FrameLayout d;
    public int f41396d0;
    public FrameLayout f41397e;
    public int f41398e0;
    public org.telegram.ui.Components.r6 f41399f;
    public int f41400f0;
    public int f41401g0;
    public org.telegram.ui.Components.is h;
    public int f41402h0;
    public int f41403i0;
    public int f41404j0;
    public int f41405k0;
    public int f41406l0;
    public int m0;
    public long f41407n;
    public int f41408n0;
    public int f41409o0;
    public int f41410p0;
    public int f41411q0;
    public boolean f41412r;
    public int f41413r0;
    public long f41414s;
    public int f41415s0;
    public int f41416t0;
    public int f41417u0;
    public final TLRPC.User v;
    public int f41418v0;
    public TLRPC.Chat f41419w;
    public int f41420w0;
    public TLRPC.ChatFull f41421x;
    public int f41422x0;
    public final int f41423y;
    public int f41424y0;
    public int f41425z0;

    public qq(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        boolean z15;
        boolean z16;
        TLRPC.UserFull userFull;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        TLRPC.Chat chat;
        boolean z36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z11;
        this.f41414s = j10;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        this.v = user;
        this.f41423y = i10;
        this.I = z10;
        boolean z37 = true;
        boolean z38 = !z10;
        this.T0 = z38;
        this.O0 = z38;
        this.Y0 = str2;
        this.f41419w = getMessagesController().getChat(Long.valueOf(this.f41414s));
        this.f41421x = getMessagesController().getChatFull(this.f41414s);
        if (user != null && user.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.U = z12;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = ChatObject.isCommunity(this.f41419w);
        TLRPC.Chat chat2 = this.f41419w;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f41419w.megagroup) {
                z36 = true;
            } else {
                z36 = false;
            }
            this.E = z36;
            this.G = ChatObject.isForum(this.f41419w);
            this.N = this.f41419w.admin_rights;
        }
        if (this.N == null) {
            if (i10 == 2 && ((chat = this.f41419w) == null || !chat.creator)) {
                z35 = false;
            } else {
                z35 = true;
            }
            this.N = o0(z35);
        }
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.P = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.P = tL_chatBannedRights3;
                    tL_chatBannedRights3.view_messages = false;
                    tL_chatBannedRights3.send_media = false;
                    tL_chatBannedRights3.send_messages = false;
                    tL_chatBannedRights3.embed_links = false;
                    tL_chatBannedRights3.send_stickers = false;
                    tL_chatBannedRights3.send_gifs = false;
                    tL_chatBannedRights3.send_games = false;
                    tL_chatBannedRights3.send_inline = false;
                    tL_chatBannedRights3.send_polls = false;
                    tL_chatBannedRights3.invite_users = false;
                    tL_chatBannedRights3.change_info = false;
                    tL_chatBannedRights3.pin_messages = false;
                    tL_chatBannedRights3.manage_topics = false;
                    tL_chatBannedRights3.send_plain = false;
                    tL_chatBannedRights3.send_videos = false;
                    tL_chatBannedRights3.send_photos = false;
                    tL_chatBannedRights3.send_audios = false;
                    tL_chatBannedRights3.send_docs = false;
                    tL_chatBannedRights3.send_voices = false;
                    tL_chatBannedRights3.send_roundvideos = false;
                    tL_chatBannedRights3.edit_rank = false;
                    tL_chatBannedRights3.send_reactions = false;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.O = tL_chatBannedRights4;
                if (tL_chatBannedRights2 == null) {
                    tL_chatBannedRights4.view_messages = false;
                    tL_chatBannedRights4.send_media = false;
                    tL_chatBannedRights4.send_messages = false;
                    tL_chatBannedRights4.embed_links = false;
                    tL_chatBannedRights4.send_stickers = false;
                    tL_chatBannedRights4.send_gifs = false;
                    tL_chatBannedRights4.send_games = false;
                    tL_chatBannedRights4.send_inline = false;
                    tL_chatBannedRights4.send_polls = false;
                    tL_chatBannedRights4.invite_users = false;
                    tL_chatBannedRights4.change_info = false;
                    tL_chatBannedRights4.pin_messages = false;
                    tL_chatBannedRights4.manage_topics = false;
                    tL_chatBannedRights4.edit_rank = false;
                    tL_chatBannedRights4.send_reactions = false;
                } else {
                    tL_chatBannedRights4.view_messages = tL_chatBannedRights2.view_messages;
                    tL_chatBannedRights4.send_messages = tL_chatBannedRights2.send_messages;
                    tL_chatBannedRights4.send_media = tL_chatBannedRights2.send_media;
                    tL_chatBannedRights4.send_stickers = tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights4.send_gifs = tL_chatBannedRights2.send_gifs;
                    tL_chatBannedRights4.send_games = tL_chatBannedRights2.send_games;
                    tL_chatBannedRights4.send_inline = tL_chatBannedRights2.send_inline;
                    tL_chatBannedRights4.embed_links = tL_chatBannedRights2.embed_links;
                    tL_chatBannedRights4.send_polls = tL_chatBannedRights2.send_polls;
                    tL_chatBannedRights4.invite_users = tL_chatBannedRights2.invite_users;
                    tL_chatBannedRights4.change_info = tL_chatBannedRights2.change_info;
                    tL_chatBannedRights4.pin_messages = tL_chatBannedRights2.pin_messages;
                    tL_chatBannedRights4.until_date = tL_chatBannedRights2.until_date;
                    tL_chatBannedRights4.manage_topics = tL_chatBannedRights2.manage_topics;
                    tL_chatBannedRights4.send_photos = tL_chatBannedRights2.send_photos;
                    tL_chatBannedRights4.send_videos = tL_chatBannedRights2.send_videos;
                    tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                    tL_chatBannedRights4.send_audios = tL_chatBannedRights2.send_audios;
                    tL_chatBannedRights4.send_voices = tL_chatBannedRights2.send_voices;
                    tL_chatBannedRights4.send_docs = tL_chatBannedRights2.send_docs;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.O;
                    tL_chatBannedRights5.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights5.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights5.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.P;
                if (tL_chatBannedRights6.view_messages) {
                    this.O.view_messages = true;
                }
                if (tL_chatBannedRights6.send_messages) {
                    this.O.send_messages = true;
                }
                if (tL_chatBannedRights6.send_media) {
                    this.O.send_media = true;
                }
                if (tL_chatBannedRights6.send_stickers) {
                    this.O.send_stickers = true;
                }
                if (tL_chatBannedRights6.send_gifs) {
                    this.O.send_gifs = true;
                }
                if (tL_chatBannedRights6.send_games) {
                    this.O.send_games = true;
                }
                if (tL_chatBannedRights6.send_inline) {
                    this.O.send_inline = true;
                }
                if (tL_chatBannedRights6.embed_links) {
                    this.O.embed_links = true;
                }
                if (tL_chatBannedRights6.send_polls) {
                    this.O.send_polls = true;
                }
                if (tL_chatBannedRights6.invite_users) {
                    this.O.invite_users = true;
                }
                if (tL_chatBannedRights6.change_info) {
                    this.O.change_info = true;
                }
                if (tL_chatBannedRights6.pin_messages) {
                    this.O.pin_messages = true;
                }
                if (tL_chatBannedRights6.edit_rank) {
                    this.O.edit_rank = true;
                }
                if (tL_chatBannedRights6.send_reactions) {
                    this.O.send_reactions = true;
                }
                if (tL_chatBannedRights6.manage_topics) {
                    this.O.manage_topics = true;
                }
                if (tL_chatBannedRights6.send_photos) {
                    this.O.send_photos = true;
                }
                if (tL_chatBannedRights6.send_videos) {
                    this.O.send_videos = true;
                }
                if (tL_chatBannedRights6.send_audios) {
                    this.O.send_audios = true;
                }
                if (tL_chatBannedRights6.send_docs) {
                    this.O.send_docs = true;
                }
                if (tL_chatBannedRights6.send_voices) {
                    this.O.send_voices = true;
                }
                if (tL_chatBannedRights6.send_roundvideos) {
                    this.O.send_roundvideos = true;
                }
                if (tL_chatBannedRights6.send_plain) {
                    this.O.send_plain = true;
                }
                this.R = ChatObject.getBannedRightsString(this.O);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z37 = false;
                }
                this.f41389a1 = z37;
            }
            z16 = false;
        } else {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j3)) != null) {
                if (this.E) {
                    tL_chatAdminRights2 = userFull.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = userFull.bot_group_admin_rights;
                }
                if (tL_chatAdminRights2 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights2;
                    } else {
                        if (!tL_chatAdminRights3.ban_users && !tL_chatAdminRights2.ban_users) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights3.ban_users = z17;
                        if (!tL_chatAdminRights3.add_admins && !tL_chatAdminRights2.add_admins) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights3.add_admins = z18;
                        if (!tL_chatAdminRights3.post_messages && !tL_chatAdminRights2.post_messages) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights3.post_messages = z19;
                        if (!tL_chatAdminRights3.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights3.pin_messages = z20;
                        if (!tL_chatAdminRights3.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        tL_chatAdminRights3.manage_ranks = z21;
                        if (!tL_chatAdminRights3.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        tL_chatAdminRights3.delete_messages = z22;
                        if (!tL_chatAdminRights3.change_info && !tL_chatAdminRights2.change_info) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        tL_chatAdminRights3.change_info = z23;
                        if (!tL_chatAdminRights3.anonymous && !tL_chatAdminRights2.anonymous) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        tL_chatAdminRights3.anonymous = z24;
                        if (!tL_chatAdminRights3.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        tL_chatAdminRights3.edit_messages = z25;
                        if (!tL_chatAdminRights3.manage_call && !tL_chatAdminRights2.manage_call) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        tL_chatAdminRights3.manage_call = z26;
                        if (!tL_chatAdminRights3.manage_topics && !tL_chatAdminRights2.manage_topics) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        tL_chatAdminRights3.manage_topics = z27;
                        if (!tL_chatAdminRights3.post_stories && !tL_chatAdminRights2.post_stories) {
                            z28 = false;
                        } else {
                            z28 = true;
                        }
                        tL_chatAdminRights3.post_stories = z28;
                        if (!tL_chatAdminRights3.edit_stories && !tL_chatAdminRights2.edit_stories) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        tL_chatAdminRights3.edit_stories = z29;
                        if (!tL_chatAdminRights3.delete_stories && !tL_chatAdminRights2.delete_stories) {
                            z30 = false;
                        } else {
                            z30 = true;
                        }
                        tL_chatAdminRights3.delete_stories = z30;
                        if (!tL_chatAdminRights3.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
                            z31 = false;
                        } else {
                            z31 = true;
                        }
                        tL_chatAdminRights3.manage_direct_messages = z31;
                        if (!tL_chatAdminRights3.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
                            z32 = false;
                        } else {
                            z32 = true;
                        }
                        tL_chatAdminRights3.manage_welcome_messages = z32;
                        if (!tL_chatAdminRights3.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
                            z33 = false;
                        } else {
                            z33 = true;
                        }
                        tL_chatAdminRights3.manage_linked_peers = z33;
                        if (!tL_chatAdminRights3.other && !tL_chatAdminRights2.other) {
                            z34 = false;
                        } else {
                            z34 = true;
                        }
                        tL_chatAdminRights3.other = z34;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.L = false;
                if (i10 == 2) {
                    this.M = o0(false);
                    boolean z39 = this.E;
                    this.K = z39;
                    this.J = z39 ? 1.0f : 0.0f;
                    this.f41389a1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.M = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.N;
                    tL_chatAdminRights4.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights4.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights4.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights4.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights4.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights4.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights4.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights4.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights4.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights4.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights4.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights4.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights4.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights4.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights4.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights4.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights4.other = tL_chatAdminRights5.other;
                    this.f41389a1 = false;
                }
            } else {
                this.L = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.M = tL_chatAdminRights6;
                boolean z40 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z40;
                boolean z41 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z41;
                boolean z42 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z42;
                boolean z43 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z43;
                boolean z44 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z44;
                boolean z45 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z45;
                boolean z46 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z46;
                boolean z47 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z47;
                boolean z48 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z48;
                boolean z49 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z49;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z50 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z50;
                boolean z51 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z51;
                boolean z52 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z52;
                boolean z53 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z53;
                boolean z54 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z54;
                boolean z55 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z55;
                if (!z40 && !z41 && !z50 && !z51 && !z42 && !z43 && !z45 && !z46 && !z52 && !z47 && !z48 && !z53 && !z44 && !z54 && !z49 && !z55) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f41389a1 = z13;
                if (i10 == 2) {
                    if (!this.E && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.K = z14;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    this.J = f7;
                    this.f41389a1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f41419w;
            if (chat3 != null) {
                this.P = chat3.default_banned_rights;
            }
            if (this.P == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights7;
                tL_chatBannedRights7.view_messages = false;
                tL_chatBannedRights7.send_media = false;
                tL_chatBannedRights7.send_messages = false;
                tL_chatBannedRights7.embed_links = false;
                tL_chatBannedRights7.send_stickers = false;
                tL_chatBannedRights7.send_gifs = false;
                tL_chatBannedRights7.send_games = false;
                tL_chatBannedRights7.send_inline = false;
                tL_chatBannedRights7.send_polls = false;
                tL_chatBannedRights7.invite_users = false;
                tL_chatBannedRights7.change_info = false;
                tL_chatBannedRights7.pin_messages = false;
                tL_chatBannedRights7.manage_topics = false;
                tL_chatBannedRights7.send_plain = false;
                tL_chatBannedRights7.send_videos = false;
                tL_chatBannedRights7.send_photos = false;
                tL_chatBannedRights7.send_audios = false;
                tL_chatBannedRights7.send_docs = false;
                tL_chatBannedRights7.send_voices = false;
                tL_chatBannedRights7.send_roundvideos = false;
                tL_chatBannedRights7.edit_rank = false;
                tL_chatBannedRights7.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
            if (!tL_chatBannedRights8.change_info && !this.E) {
                z15 = true;
                this.M.change_info = true;
            } else {
                z15 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.M.pin_messages = z15;
            }
            z16 = false;
        }
        u0(z16);
    }

    public static void U(qq qqVar, long j3) {
        if (j3 != 0) {
            qqVar.f41414s = j3;
            qqVar.f41419w = MessagesController.getInstance(qqVar.currentAccount).getChat(Long.valueOf(j3));
            qqVar.r0(true);
        }
    }

    public static void V(qq qqVar, org.telegram.ui.ActionBar.z2 z2Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(qqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                                        final qq qqVar2 = qq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i10, i11, i12);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(qqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                                    qq qqVar3 = qq.this;
                                                    qqVar3.O.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    qqVar3.f41387a.m(qqVar3.M0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            qqVar2.showDialog(timePickerDialog);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                }, calendar.get(1), calendar.get(2), calendar.get(5));
                                DatePicker datePicker = datePickerDialog.getDatePicker();
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(System.currentTimeMillis());
                                calendar2.set(11, calendar2.getMinimum(11));
                                calendar2.set(12, calendar2.getMinimum(12));
                                calendar2.set(13, calendar2.getMinimum(13));
                                calendar2.set(14, calendar2.getMinimum(14));
                                datePicker.setMinDate(calendar2.getTimeInMillis());
                                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                                calendar2.set(11, calendar2.getMaximum(11));
                                calendar2.set(12, calendar2.getMaximum(12));
                                calendar2.set(13, calendar2.getMaximum(13));
                                calendar2.set(14, calendar2.getMaximum(14));
                                datePicker.setMaxDate(calendar2.getTimeInMillis());
                                datePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), datePickerDialog);
                                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new lq(0, datePicker));
                                qqVar.showDialog(datePickerDialog);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                        }
                    } else {
                        qqVar.O.until_date = ConnectionsManager.getInstance(qqVar.currentAccount).getCurrentTime() + 2592000;
                        qqVar.f41387a.m(qqVar.M0);
                    }
                } else {
                    qqVar.O.until_date = ConnectionsManager.getInstance(qqVar.currentAccount).getCurrentTime() + 604800;
                    qqVar.f41387a.m(qqVar.M0);
                }
            } else {
                qqVar.O.until_date = ConnectionsManager.getInstance(qqVar.currentAccount).getCurrentTime() + 86400;
                qqVar.f41387a.m(qqVar.M0);
            }
        } else {
            qqVar.O.until_date = 0;
            qqVar.f41387a.m(qqVar.M0);
        }
        runnable = z2Var.f21485a.dismissRunnable;
        runnable.run();
    }

    public static boolean W(qq qqVar, TLRPC.TL_error tL_error) {
        qqVar.t0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(qqVar.f41419w)) {
                rg.j0 j0Var = new rg.j0(11, qqVar.currentAccount, qqVar.getParentActivity(), qqVar, qqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(qqVar.v);
                j0Var.J1(qqVar.f41419w, arrayList, null, null, null);
                j0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void X(org.telegram.ui.qq r23, android.content.Context r24, android.view.View r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq.X(org.telegram.ui.qq, android.content.Context, android.view.View, int):void");
    }

    public static void Y(qq qqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        boolean z10 = qqVar.E;
        TLRPC.User user = qqVar.v;
        if (tL_error != null) {
            if (qqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar.getParentActivity());
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        if (z10) {
                            a2Var.R = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            a2Var.R = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, qqVar.f41419w.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new fq(qqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qqVar.showDialog(a2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(qqVar.currentAccount).sendRequest(new TL_account.getPassword(), new so(2, qqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (qqVar.getParentActivity() != null && !AccountInstance.getInstance(qqVar.currentAccount).getUserConfig().isPremium()) {
                            qqVar.showDialog(new rg.j0(5, qqVar.currentAccount, qqVar.getParentActivity(), qqVar, null));
                        } else {
                            qqVar.presentFragment(new we1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.g5.g0(tL_error, qqVar, z10, qqVar.F, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                    a2Var2.R = string;
                    LinearLayout linearLayout = new LinearLayout(qqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(qqVar.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.h6.f20668j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (z10) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
                    } else {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
                    }
                    linearLayout.addView(textView, w7.w5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(qqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(qqVar.getParentActivity());
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i11, dp3, dp, 0);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(qqVar.getParentActivity());
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.w5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.w5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.w5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.w5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(qqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(qqVar.getParentActivity());
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i13 = AndroidUtilities.dp(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i13, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i17, false), mode));
                    TextView textView3 = new TextView(qqVar.getParentActivity());
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.w5.n(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.w5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.w5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.w5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new fq(qqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(qqVar.getParentActivity());
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    qqVar.showDialog(a2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            qqVar.X0.a(user);
            qqVar.removeSelfFromStack();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Z(qq qqVar, long j3) {
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = qqVar.f41421x;
        if (chatFull != null) {
            j10 = chatFull.guard_bot_id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            user = qqVar.getMessagesController().getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j3 != 0 && user2.f19950id != j3) {
            new org.telegram.ui.Components.q40(qqVar.getParentActivity(), qqVar.resourceProvider, user2, qqVar.v, new gq(qqVar, j3, 0)).show();
            return;
        }
        qqVar.f41407n = j3;
        qqVar.f41412r = true;
        qqVar.n0();
    }

    public static void a0(qq qqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            qqVar.f41414s = j3;
            qqVar.f41419w = MessagesController.getInstance(qqVar.currentAccount).getChat(Long.valueOf(j3));
            qqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(qq qqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = qqVar.S;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                m4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.h5 textView2 = m4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.h6.f20781p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.h6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            m4Var.setText2("");
        }
    }

    public static boolean l0(qq qqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.P;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_chatAdminRights o0(boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z10;
        tL_chatAdminRights.manage_ranks = z10;
        tL_chatAdminRights.manage_welcome_messages = z10;
        tL_chatAdminRights.manage_direct_messages = z10;
        tL_chatAdminRights.delete_stories = z10;
        tL_chatAdminRights.edit_stories = z10;
        tL_chatAdminRights.post_stories = z10;
        tL_chatAdminRights.manage_topics = z10;
        tL_chatAdminRights.manage_call = z10;
        tL_chatAdminRights.add_admins = z10;
        tL_chatAdminRights.pin_messages = z10;
        tL_chatAdminRights.invite_users = z10;
        tL_chatAdminRights.ban_users = z10;
        tL_chatAdminRights.delete_messages = z10;
        tL_chatAdminRights.edit_messages = z10;
        tL_chatAdminRights.post_messages = z10;
        tL_chatAdminRights.change_info = z10;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights s0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z26 = true;
        if (!tL_chatAdminRights.change_info && !tL_chatAdminRights2.change_info) {
            z10 = false;
        } else {
            z10 = true;
        }
        tL_chatAdminRights3.change_info = z10;
        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
            z11 = false;
        } else {
            z11 = true;
        }
        tL_chatAdminRights3.post_messages = z11;
        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
            z12 = false;
        } else {
            z12 = true;
        }
        tL_chatAdminRights3.edit_messages = z12;
        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
            z13 = false;
        } else {
            z13 = true;
        }
        tL_chatAdminRights3.delete_messages = z13;
        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
            z14 = false;
        } else {
            z14 = true;
        }
        tL_chatAdminRights3.ban_users = z14;
        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
            z15 = false;
        } else {
            z15 = true;
        }
        tL_chatAdminRights3.invite_users = z15;
        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
            z16 = false;
        } else {
            z16 = true;
        }
        tL_chatAdminRights3.pin_messages = z16;
        if (!tL_chatAdminRights.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
            z17 = false;
        } else {
            z17 = true;
        }
        tL_chatAdminRights3.manage_ranks = z17;
        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
            z18 = false;
        } else {
            z18 = true;
        }
        tL_chatAdminRights3.add_admins = z18;
        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
            z19 = false;
        } else {
            z19 = true;
        }
        tL_chatAdminRights3.manage_call = z19;
        if (!tL_chatAdminRights.manage_topics && !tL_chatAdminRights2.manage_topics) {
            z20 = false;
        } else {
            z20 = true;
        }
        tL_chatAdminRights3.manage_topics = z20;
        if (!tL_chatAdminRights.post_stories && !tL_chatAdminRights2.post_stories) {
            z21 = false;
        } else {
            z21 = true;
        }
        tL_chatAdminRights3.post_stories = z21;
        if (!tL_chatAdminRights.edit_stories && !tL_chatAdminRights2.edit_stories) {
            z22 = false;
        } else {
            z22 = true;
        }
        tL_chatAdminRights3.edit_stories = z22;
        if (!tL_chatAdminRights.delete_stories && !tL_chatAdminRights2.delete_stories) {
            z23 = false;
        } else {
            z23 = true;
        }
        tL_chatAdminRights3.delete_stories = z23;
        if (!tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
            z24 = false;
        } else {
            z24 = true;
        }
        tL_chatAdminRights3.manage_direct_messages = z24;
        if (!tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
            z25 = false;
        } else {
            z25 = true;
        }
        tL_chatAdminRights3.manage_welcome_messages = z25;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z26 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z26;
        return tL_chatAdminRights3;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f41423y;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 5));
        if (this.I || (!this.E && this.f41419w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.h6.f20895v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.is(mutate, new org.telegram.ui.Components.lq(org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
            p5.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            p5.k(1).setIcon(this.h);
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        ai.w0 w0Var = new ai.w0(this, context, 8);
        this.f41390b = w0Var;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0Var.setClipChildren(z10);
        gg.a0 a0Var = new gg.a0(1, false, 5);
        this.f41393c = a0Var;
        a0Var.E = 100;
        this.f41390b.setLayoutManager(a0Var);
        ai.w0 w0Var2 = this.f41390b;
        pq pqVar = new pq(this, context);
        this.f41387a = pqVar;
        w0Var2.setAdapter(pqVar);
        s4.j jVar = new s4.j();
        if (i11 == 2) {
            this.f41390b.setResetSelectorOnChanged(false);
        }
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.js.h);
        jVar.n(350L);
        this.f41390b.setItemAnimator(jVar);
        ai.w0 w0Var3 = this.f41390b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        w0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f41390b, w7.w5.d(-1.0f, -1));
        this.f41390b.p1();
        this.actionBar.setAdaptiveBackground(this.f41390b);
        this.f41390b.setOnScrollListener(new i3(this, 6));
        this.f41390b.setOnItemClickListener(new ai.o6(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f41419w;
            if (chat != null && chatFull.f19804id == chat.f19803id) {
                this.f41421x = chatFull;
                n0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f41414s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 16, new Class[]{org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.c9.class, org.telegram.ui.Cells.d6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.f20781p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20725m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f20964z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f20946y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f20745n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41390b, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.h6.f20813r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.u2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20668j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.u2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20799q5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8192, new Class[]{org.telegram.ui.Cells.u2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 16384, new Class[]{org.telegram.ui.Cells.u2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z10) {
        boolean equals;
        int i10 = this.f41423y;
        if (i10 != 2) {
            if (i10 == 1) {
                equals = this.R.equals(ChatObject.getBannedRightsString(this.O));
            } else {
                equals = this.T.equals(this.S);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.R = string;
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f41414s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new fq(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new fq(this, 4));
                    showDialog(a2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z10;
        TLRPC.User user;
        long j3;
        int i10 = this.f41405k0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) this.f41393c.m(i10);
            if (v8Var != null) {
                TLRPC.ChatFull chatFull = this.f41421x;
                if (chatFull != null && (user = this.v) != null) {
                    if (this.f41412r) {
                        j3 = this.f41407n;
                    } else {
                        j3 = chatFull.guard_bot_id;
                    }
                    if (j3 == user.f19950id) {
                        z10 = true;
                        v8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                v8Var.setChecked(z10);
                return;
            }
            this.f41387a.m(this.f41405k0);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return m0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        pq pqVar = this.f41387a;
        if (pqVar != null) {
            pqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f41419w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f41414s, this, new d7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f41419w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f41419w;
            tL_inputChannel.channel_id = chat.f19803id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        if (inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.v);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new ai.q3(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 6));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.G;
        if (!z10 || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || ((z11 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous)) {
            if (!z10 && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks) {
                if ((!z11 || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void r0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq.r0(boolean):void");
    }

    public final void t0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f41392b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = z10;
        this.actionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.Components.is isVar = this.h;
        if (isVar != null) {
            float f10 = isVar.f27268c;
            if (this.H) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f41392b1 = ofFloat;
            ofFloat.addUpdateListener(new hq(this, 0));
            this.f41392b1.addListener(new w4(this, 24));
            this.f41392b1.setDuration(Math.abs(this.h.f27268c - (this.H ? 1.0f : 0.0f)) * 150.0f);
            this.f41392b1.start();
        }
    }

    public final void u0(boolean z10) {
        int i10;
        int min = Math.min(this.f41415s0, this.f41416t0);
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f41388a0 = -1;
        this.f41391b0 = -1;
        this.f41394c0 = -1;
        this.f41396d0 = -1;
        this.f41398e0 = -1;
        this.f41400f0 = -1;
        this.f41401g0 = -1;
        this.f41402h0 = -1;
        this.f41403i0 = -1;
        this.f41404j0 = -1;
        this.f41405k0 = -1;
        this.f41406l0 = -1;
        this.f41409o0 = -1;
        this.f41410p0 = -1;
        this.f41411q0 = -1;
        this.f41413r0 = -1;
        this.f41415s0 = -1;
        this.f41416t0 = -1;
        this.f41417u0 = -1;
        this.f41418v0 = -1;
        this.f41420w0 = -1;
        this.f41424y0 = -1;
        this.f41425z0 = -1;
        this.N0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.f41422x0 = -1;
        this.m0 = -1;
        this.f41408n0 = -1;
        this.V = 3;
        boolean z11 = this.F;
        boolean z12 = this.E;
        boolean z13 = this.G;
        int i11 = this.f41423y;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f41424y0 = 3;
                this.V = 5;
                this.f41425z0 = 4;
                if (this.A0) {
                    this.B0 = 5;
                    this.C0 = 6;
                    this.E0 = 7;
                    this.D0 = 8;
                    this.F0 = 9;
                    this.G0 = 10;
                    this.H0 = 11;
                    this.I0 = 12;
                    this.J0 = 13;
                    this.V = 15;
                    this.f41404j0 = 14;
                }
                int i12 = this.V;
                this.f41401g0 = i12;
                this.f41402h0 = i12 + 1;
                this.f41403i0 = i12 + 2;
                int i13 = i12 + 4;
                this.V = i13;
                this.X = i12 + 3;
                if (z13) {
                    this.V = i12 + 5;
                    this.m0 = i13;
                }
                int i14 = this.V;
                this.L0 = i14;
                this.V = i14 + 2;
                this.M0 = i14 + 1;
            }
        } else if (z11) {
            this.X = 3;
            this.f41408n0 = 4;
            this.f41396d0 = 5;
            this.V = 7;
            this.f41400f0 = 6;
        } else if (z12) {
            this.X = 3;
            this.V = 5;
            this.N0 = 4;
            if (this.O0) {
                this.P0 = 5;
                this.Q0 = 6;
                this.V = 8;
                this.R0 = 7;
            }
            int i15 = this.V;
            int i16 = i15 + 1;
            this.V = i16;
            this.S0 = i15;
            if (this.T0) {
                this.U0 = i16;
                this.V0 = i15 + 2;
                this.V = i15 + 4;
                this.W0 = i15 + 3;
            }
            int i17 = this.V;
            this.Z = i17;
            this.f41388a0 = i17 + 1;
            this.f41401g0 = i17 + 2;
            this.K0 = i17 + 3;
            this.f41396d0 = i17 + 4;
            this.V = i17 + 6;
            this.f41400f0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.V = 4;
                this.W = 3;
            }
            int i18 = this.V;
            this.X = i18;
            this.f41394c0 = i18 + 1;
            this.f41400f0 = i18 + 2;
            this.f41401g0 = i18 + 3;
            int i19 = i18 + 5;
            this.V = i19;
            this.f41402h0 = i18 + 4;
            if (i11 != 2) {
                this.V = i18 + 6;
                this.f41403i0 = i19;
            }
            if (ChatObject.isChannel(this.f41419w)) {
                int i20 = this.V;
                int i21 = i20 + 1;
                this.V = i21;
                this.S0 = i20;
                if (this.T0) {
                    this.U0 = i21;
                    this.V0 = i20 + 2;
                    this.V = i20 + 4;
                    this.W0 = i20 + 3;
                }
            }
            int i22 = this.V;
            this.f41388a0 = i22;
            this.K0 = i22 + 1;
            this.f41396d0 = i22 + 2;
            int i23 = i22 + 4;
            this.V = i23;
            this.f41398e0 = i22 + 3;
            if (z13) {
                this.V = i22 + 5;
                this.m0 = i23;
            }
            if (this.U) {
                int i24 = this.V;
                this.f41405k0 = i24;
                this.V = i24 + 2;
                this.f41406l0 = i24 + 1;
            }
        }
        boolean z14 = this.I;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.K) || i11 == 1))) {
                int i25 = this.V;
                this.f41409o0 = i25;
                this.f41418v0 = i25 + 1;
                this.V = i25 + 3;
                this.f41420w0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f41419w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.f41409o0;
                        if (i26 == -1) {
                            int i27 = this.V;
                            this.V = i27 + 1;
                            this.f41415s0 = i27;
                        }
                        int i28 = this.V;
                        int i29 = i28 + 1;
                        this.V = i29;
                        this.f41416t0 = i28;
                        if (i26 != -1) {
                            this.V = i28 + 2;
                            this.f41415s0 = i29;
                        }
                    }
                }
            }
            if (this.f41389a1) {
                if (this.f41409o0 == -1) {
                    int i30 = this.V;
                    this.V = i30 + 1;
                    this.f41409o0 = i30;
                }
                int i31 = this.V;
                this.f41410p0 = i31;
                this.V = i31 + 2;
                this.f41411q0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z12 && (!this.S.isEmpty() || (this.f41419w.creator && UserObject.isUserSelf(user)))) {
                int i32 = this.V;
                this.f41409o0 = i32;
                this.V = i32 + 2;
                this.f41418v0 = i32 + 1;
                if (this.f41419w.creator && UserObject.isUserSelf(user)) {
                    int i33 = this.V;
                    this.V = i33 + 1;
                    this.f41420w0 = i33;
                } else {
                    int i34 = this.V;
                    this.V = i34 + 1;
                    this.f41413r0 = i34;
                }
            } else {
                int i35 = this.V;
                this.V = i35 + 1;
                this.f41413r0 = i35;
            }
        } else {
            int i36 = this.V;
            this.V = i36 + 1;
            this.f41409o0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.V;
            this.V = i37 + 1;
            this.f41422x0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.f41415s0) != -1) {
                this.f41387a.s(Math.min(i10, this.f41416t0), 2);
            } else if (min != -1 && this.f41415s0 == -1) {
                this.f41387a.t(min, 2);
            }
        }
    }
}
