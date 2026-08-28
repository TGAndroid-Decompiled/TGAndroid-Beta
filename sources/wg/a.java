package wg;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f48820s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f48821w("FILES", R.raw.tab_files_reverse),
    f48822x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f48823y("LOCATION", R.raw.tab_location_reverse),
    A("STICKER", R.raw.tab_sticker_reverse),
    B("EMOJI", R.raw.tab_emoji_reverse),
    C("MODELS", R.raw.tab_models_reverse),
    D("MUSIC", R.raw.tab_music_reverse),
    E("POLL", R.raw.tab_poll_reverse),
    F("SYMBOLS", R.raw.tab_symbols_reverse),
    G("REPLIES", R.raw.tab_reply_reverse),
    EF0("WALLET", R.raw.tab_wallet_reverse),
    H,
    I("ARTICLE", R.raw.tab_article_reverse),
    BOOSTS(R.raw.boosts, 25, 49),
    MONETIZATION(R.raw.monetize, 19, 45);
    
    public final int f48824a;
    public final int f48825b;
    public final int f48826c;
    public final int d;
    public final int f48827e;

    a(int i9, int i10, int i11) {
        this.f48824a = i9;
        this.f48825b = i9;
        this.d = i10;
        this.f48827e = i11;
        this.f48826c = -1;
    }

    a(int i9) {
        this.f48826c = i9;
        this.f48824a = -1;
        this.f48825b = -1;
        this.d = -1;
        this.f48827e = -1;
    }

    a(int i9) {
        this.f48824a = i9;
        this.f48825b = i9;
        this.d = -1;
        this.f48827e = -1;
        this.f48826c = -1;
    }

    a(String str, int i9) {
        this.f48824a = r2;
        this.f48825b = i9;
        this.d = -1;
        this.f48827e = -1;
        this.f48826c = -1;
    }
}
