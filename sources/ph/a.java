package ph;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f44292s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f44293w("FILES", R.raw.tab_files_reverse),
    f44294x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f44295y("LOCATION", R.raw.tab_location_reverse),
    E("STICKER", R.raw.tab_sticker_reverse),
    F("EMOJI", R.raw.tab_emoji_reverse),
    G("MODELS", R.raw.tab_models_reverse),
    H("MUSIC", R.raw.tab_music_reverse),
    I("POLL", R.raw.tab_poll_reverse),
    J("SYMBOLS", R.raw.tab_symbols_reverse),
    K("REPLIES", R.raw.tab_reply_reverse),
    EF0("WALLET", R.raw.tab_wallet_reverse),
    L,
    M("ARTICLE", R.raw.tab_article_reverse),
    N("GRAM", R.raw.gram_reverse),
    BOOSTS(R.raw.boosts, 25, 49),
    MONETIZATION(R.raw.monetize, 19, 45);
    
    public final int f44296a;
    public final int f44297b;
    public final int f44298c;
    public final int d;
    public final int e;

    a(int i10, int i11, int i12) {
        this.f44296a = i10;
        this.f44297b = i10;
        this.d = i11;
        this.e = i12;
        this.f44298c = -1;
    }

    a(int i10) {
        this.f44298c = i10;
        this.f44296a = -1;
        this.f44297b = -1;
        this.d = -1;
        this.e = -1;
    }

    a(int i10) {
        this.f44296a = i10;
        this.f44297b = i10;
        this.d = -1;
        this.e = -1;
        this.f44298c = -1;
    }

    a(String str, int i10) {
        this.f44296a = r2;
        this.f44297b = i10;
        this.d = -1;
        this.e = -1;
        this.f44298c = -1;
    }
}
