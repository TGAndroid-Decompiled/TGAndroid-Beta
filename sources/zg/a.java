package zg;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f50851s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f50852w("FILES", R.raw.tab_files_reverse),
    f50853x("GALLERY", R.raw.tab_gallery_reverse),
    EF7("GIFT", R.raw.tab_gift_reverse),
    f50854y("LOCATION", R.raw.tab_location_reverse),
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
    
    public final int f50855a;
    public final int f50856b;
    public final int f50857c;
    public final int d;
    public final int f50858e;

    a(int i10, int i11, int i12) {
        this.f50855a = i10;
        this.f50856b = i10;
        this.d = i11;
        this.f50858e = i12;
        this.f50857c = -1;
    }

    a(int i10) {
        this.f50857c = i10;
        this.f50855a = -1;
        this.f50856b = -1;
        this.d = -1;
        this.f50858e = -1;
    }

    a(int i10) {
        this.f50855a = i10;
        this.f50856b = i10;
        this.d = -1;
        this.f50858e = -1;
        this.f50857c = -1;
    }

    a(String str, int i10) {
        this.f50855a = r2;
        this.f50856b = i10;
        this.d = -1;
        this.f50858e = -1;
        this.f50857c = -1;
    }
}
