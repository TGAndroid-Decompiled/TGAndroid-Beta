package s3;

import a8.ga;
import c8.ca;
import e2.q0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a extends ca {
    public static final Pattern f54781c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f54782a = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder f54783b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f54783b;
        CharsetDecoder charsetDecoder2 = this.f54782a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new q0(new c(bArr, null, null));
        }
        Matcher matcher = f54781c.matcher(str);
        String str3 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c10 = ga.c(group);
                c10.getClass();
                if (!c10.equals("streamurl")) {
                    if (c10.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new q0(new c(bArr, str2, str3));
    }
}
