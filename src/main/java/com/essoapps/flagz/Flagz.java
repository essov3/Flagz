package com.essoapps.flagz;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.DisplayMetrics;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Flagz {

    public static final String SPRITE_SHEET_IMAGE = "flags_sprites.png";

    private  Bitmap spriteSheet;

    private final int SPRITE_SIZE = 64;
    public Flagz(Context context) {


        spriteSheet = loadBitmapFromAssets(context.getAssets(), SPRITE_SHEET_IMAGE);

    }





    private Bitmap getSpriteByCoordinates(int x, int y) {


        // Calculate the coordinates of the sprite within the sprite sheet
        int left = x ;
        int top = y ;
        int right = left + SPRITE_SIZE;
        int bottom = top + SPRITE_SIZE;

        // Create a Rect to define the area of the sprite in the sprite sheet
        Rect spriteRect = new Rect(left, top, right, bottom);

        // Create a new Bitmap for the sprite
        Bitmap sprite = Bitmap.createBitmap(spriteSheet, spriteRect.left, spriteRect.top, spriteRect.width(), spriteRect.height());



        return sprite;
    }

    public Bitmap getFlag(String countryCode){

        FlagSpritePos pos = getFlagCoordinates().get(countryCode.toLowerCase());

        if(pos==null){
            return null;
        }

        return getSpriteByCoordinates(pos.getX(),pos.getY());
    }



    public static Bitmap loadBitmapFromAssets(AssetManager assetManager, String fileName) {
        try {
            // Open an InputStream for the asset file
            InputStream inputStream = assetManager.open(fileName);

            // Decode the InputStream into a Bitmap
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

            // Close the InputStream
            inputStream.close();

            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception or log an error
            return null;
        }
    }


    private  Map<String, FlagSpritePos> getFlagCoordinates() {

        Map<String, FlagSpritePos> map = new HashMap<>();

        map.put("pr",new FlagSpritePos(64,704));
        map.put("ps",new FlagSpritePos(128,704));
        map.put("pt",new FlagSpritePos(192,704));
        map.put("pw",new FlagSpritePos(256,704));
        map.put("py",new FlagSpritePos(320,704));
        map.put("qa",new FlagSpritePos(384,704));
        map.put("ad",new FlagSpritePos(0,0));
        map.put("ae",new FlagSpritePos(64,0));
        map.put("af",new FlagSpritePos(128,0));
        map.put("ag",new FlagSpritePos(192,0));
        map.put("ai",new FlagSpritePos(256,0));
        map.put("al",new FlagSpritePos(320,0));
        map.put("am",new FlagSpritePos(384,0));
        map.put("an",new FlagSpritePos(448,0));
        map.put("ao",new FlagSpritePos(512,0));
        map.put("aq",new FlagSpritePos(576,0));
        map.put("ar",new FlagSpritePos(640,0));
        map.put("as",new FlagSpritePos(704,0));
        map.put("at",new FlagSpritePos(768,0));
        map.put("au",new FlagSpritePos(832,0));
        map.put("aw",new FlagSpritePos(896,0));
        map.put("ax",new FlagSpritePos(960,0));
        map.put("az",new FlagSpritePos(0,64));
        map.put("ro",new FlagSpritePos(448,704));
        map.put("ba",new FlagSpritePos(64,64));
        map.put("bb",new FlagSpritePos(128,64));
        map.put("rs",new FlagSpritePos(512,704));
        map.put("bd",new FlagSpritePos(192,64));
        map.put("be",new FlagSpritePos(256,64));
        map.put("ru",new FlagSpritePos(576,704));
        map.put("bf",new FlagSpritePos(320,64));
        map.put("bg",new FlagSpritePos(384,64));
        map.put("rw",new FlagSpritePos(640,704));
        map.put("bh",new FlagSpritePos(448,64));
        map.put("bi",new FlagSpritePos(512,64));
        map.put("bj",new FlagSpritePos(576,64));
        map.put("bl",new FlagSpritePos(640,64));
        map.put("bm",new FlagSpritePos(704,64));
        map.put("bn",new FlagSpritePos(768,64));
        map.put("bo",new FlagSpritePos(832,64));
        map.put("sa",new FlagSpritePos(704,704));
        map.put("sb",new FlagSpritePos(768,704));
        map.put("br",new FlagSpritePos(896,64));
        map.put("sc",new FlagSpritePos(832,704));
        map.put("bs",new FlagSpritePos(960,64));
        map.put("sd",new FlagSpritePos(896,704));
        map.put("bt",new FlagSpritePos(0,128));
        map.put("se",new FlagSpritePos(960,704));
        map.put("sg",new FlagSpritePos(0,768));
        map.put("bw",new FlagSpritePos(64,128));
        map.put("sh",new FlagSpritePos(64,768));
        map.put("si",new FlagSpritePos(128,768));
        map.put("by",new FlagSpritePos(128,128));
        map.put("bz",new FlagSpritePos(192,128));
        map.put("sk",new FlagSpritePos(192,768));
        map.put("sl",new FlagSpritePos(256,768));
        map.put("sm",new FlagSpritePos(320,768));
        map.put("sn",new FlagSpritePos(384,768));
        map.put("so",new FlagSpritePos(448,768));
        map.put("ca",new FlagSpritePos(256,128));
        map.put("sr",new FlagSpritePos(512,768));
        map.put("cc",new FlagSpritePos(320,128));
        map.put("ss",new FlagSpritePos(576,768));
        map.put("cd",new FlagSpritePos(384,128));
        map.put("st",new FlagSpritePos(640,768));
        map.put("cf",new FlagSpritePos(448,128));
        map.put("sv",new FlagSpritePos(704,768));
        map.put("cg",new FlagSpritePos(512,128));
        map.put("ch",new FlagSpritePos(576,128));
        map.put("ci",new FlagSpritePos(640,128));
        map.put("sy",new FlagSpritePos(768,768));
        map.put("sz",new FlagSpritePos(832,768));
        map.put("ck",new FlagSpritePos(704,128));
        map.put("cl",new FlagSpritePos(768,128));
        map.put("cm",new FlagSpritePos(832,128));
        map.put("cn",new FlagSpritePos(896,128));
        map.put("co",new FlagSpritePos(960,128));
        map.put("cr",new FlagSpritePos(0,192));
        map.put("tc",new FlagSpritePos(896,768));
        map.put("td",new FlagSpritePos(960,768));
        map.put("cu",new FlagSpritePos(64,192));
        map.put("tf",new FlagSpritePos(0,832));
        map.put("cv",new FlagSpritePos(128,192));
        map.put("tg",new FlagSpritePos(64,832));
        map.put("cw",new FlagSpritePos(192,192));
        map.put("th",new FlagSpritePos(128,832));
        map.put("cx",new FlagSpritePos(256,192));
        map.put("cy",new FlagSpritePos(320,192));
        map.put("tj",new FlagSpritePos(192,832));
        map.put("cz",new FlagSpritePos(384,192));
        map.put("tk",new FlagSpritePos(256,832));
        map.put("tl",new FlagSpritePos(320,832));
        map.put("tm",new FlagSpritePos(384,832));
        map.put("tn",new FlagSpritePos(448,832));
        map.put("to",new FlagSpritePos(512,832));
        map.put("tr",new FlagSpritePos(576,832));
        map.put("tt",new FlagSpritePos(640,832));
        map.put("de",new FlagSpritePos(448,192));
        map.put("tv",new FlagSpritePos(704,832));
        map.put("tw",new FlagSpritePos(768,832));
        map.put("dj",new FlagSpritePos(512,192));
        map.put("tz",new FlagSpritePos(832,832));
        map.put("dk",new FlagSpritePos(576,192));
        map.put("dm",new FlagSpritePos(640,192));
        map.put("do",new FlagSpritePos(704,192));
        map.put("ua",new FlagSpritePos(896,832));
        map.put("ug",new FlagSpritePos(960,832));
        map.put("dz",new FlagSpritePos(768,192));
        map.put("ec",new FlagSpritePos(832,192));
        map.put("us",new FlagSpritePos(0,896));
        map.put("ee",new FlagSpritePos(896,192));
        map.put("eg",new FlagSpritePos(960,192));
        map.put("eh",new FlagSpritePos(0,256));
        map.put("uy",new FlagSpritePos(64,896));
        map.put("uz",new FlagSpritePos(128,896));
        map.put("va",new FlagSpritePos(192,896));
        map.put("er",new FlagSpritePos(64,256));
        map.put("vc",new FlagSpritePos(256,896));
        map.put("es",new FlagSpritePos(128,256));
        map.put("et",new FlagSpritePos(192,256));
        map.put("ve",new FlagSpritePos(320,896));
        map.put("eu",new FlagSpritePos(256,256));
        map.put("vg",new FlagSpritePos(384,896));
        map.put("vi",new FlagSpritePos(448,896));
        map.put("vn",new FlagSpritePos(512,896));
        map.put("vu",new FlagSpritePos(576,896));
        map.put("fi",new FlagSpritePos(320,256));
        map.put("fj",new FlagSpritePos(384,256));
        map.put("fk",new FlagSpritePos(448,256));
        map.put("fm",new FlagSpritePos(512,256));
        map.put("fo",new FlagSpritePos(576,256));
        map.put("fr",new FlagSpritePos(640,256));
        map.put("wf",new FlagSpritePos(640,896));
        map.put("ga",new FlagSpritePos(704,256));
        map.put("gb",new FlagSpritePos(768,256));
        map.put("ws",new FlagSpritePos(704,896));
        map.put("gd",new FlagSpritePos(832,256));
        map.put("ge",new FlagSpritePos(896,256));
        map.put("gg",new FlagSpritePos(960,256));
        map.put("gh",new FlagSpritePos(0,320));
        map.put("gi",new FlagSpritePos(64,320));
        map.put("gl",new FlagSpritePos(128,320));
        map.put("gm",new FlagSpritePos(192,320));
        map.put("gn",new FlagSpritePos(256,320));
        map.put("gq",new FlagSpritePos(320,320));
        map.put("gr",new FlagSpritePos(384,320));
        map.put("gs",new FlagSpritePos(448,320));
        map.put("gt",new FlagSpritePos(512,320));
        map.put("gu",new FlagSpritePos(576,320));
        map.put("gw",new FlagSpritePos(640,320));
        map.put("gy",new FlagSpritePos(704,320));
        map.put("hk",new FlagSpritePos(768,320));
        map.put("hn",new FlagSpritePos(832,320));
        map.put("hr",new FlagSpritePos(896,320));
        map.put("ht",new FlagSpritePos(960,320));
        map.put("ye",new FlagSpritePos(768,896));
        map.put("hu",new FlagSpritePos(0,384));
        map.put("ic",new FlagSpritePos(64,384));
        map.put("id",new FlagSpritePos(128,384));
        map.put("yt",new FlagSpritePos(832,896));
        map.put("ie",new FlagSpritePos(192,384));
        map.put("im",new FlagSpritePos(320,384));
        map.put("in",new FlagSpritePos(384,384));
        map.put("za",new FlagSpritePos(896,896));
        map.put("iq",new FlagSpritePos(448,384));
        map.put("ir",new FlagSpritePos(512,384));
        map.put("is",new FlagSpritePos(576,384));
        map.put("it",new FlagSpritePos(640,384));
        map.put("zm",new FlagSpritePos(960,896));
        map.put("je",new FlagSpritePos(704,384));
        map.put("zw",new FlagSpritePos(0,960));
        map.put("jm",new FlagSpritePos(768,384));
        map.put("jo",new FlagSpritePos(832,384));
        map.put("jp",new FlagSpritePos(896,384));
        map.put("ke",new FlagSpritePos(960,384));
        map.put("kg",new FlagSpritePos(0,448));
        map.put("kh",new FlagSpritePos(64,448));
        map.put("ki",new FlagSpritePos(128,448));
        map.put("km",new FlagSpritePos(192,448));
        map.put("kn",new FlagSpritePos(256,448));
        map.put("kp",new FlagSpritePos(320,448));
        map.put("kr",new FlagSpritePos(384,448));
        map.put("kw",new FlagSpritePos(448,448));
        map.put("ky",new FlagSpritePos(512,448));
        map.put("kz",new FlagSpritePos(576,448));
        map.put("la",new FlagSpritePos(640,448));
        map.put("lb",new FlagSpritePos(704,448));
        map.put("lc",new FlagSpritePos(768,448));
        map.put("li",new FlagSpritePos(832,448));
        map.put("lk",new FlagSpritePos(896,448));
        map.put("lr",new FlagSpritePos(960,448));
        map.put("ls",new FlagSpritePos(0,512));
        map.put("lt",new FlagSpritePos(64,512));
        map.put("lu",new FlagSpritePos(128,512));
        map.put("lv",new FlagSpritePos(192,512));
        map.put("ly",new FlagSpritePos(256,512));
        map.put("ma",new FlagSpritePos(320,512));
        map.put("mc",new FlagSpritePos(384,512));
        map.put("md",new FlagSpritePos(448,512));
        map.put("me",new FlagSpritePos(512,512));
        map.put("mf",new FlagSpritePos(576,512));
        map.put("mg",new FlagSpritePos(640,512));
        map.put("mh",new FlagSpritePos(704,512));
        map.put("mk",new FlagSpritePos(768,512));
        map.put("ml",new FlagSpritePos(832,512));
        map.put("mm",new FlagSpritePos(896,512));
        map.put("mn",new FlagSpritePos(960,512));
        map.put("mo",new FlagSpritePos(0,576));
        map.put("mp",new FlagSpritePos(64,576));
        map.put("mq",new FlagSpritePos(128,576));
        map.put("mr",new FlagSpritePos(192,576));
        map.put("ms",new FlagSpritePos(256,576));
        map.put("mt",new FlagSpritePos(320,576));
        map.put("mu",new FlagSpritePos(384,576));
        map.put("mv",new FlagSpritePos(448,576));
        map.put("mw",new FlagSpritePos(512,576));
        map.put("mx",new FlagSpritePos(576,576));
        map.put("my",new FlagSpritePos(640,576));
        map.put("mz",new FlagSpritePos(704,576));
        map.put("na",new FlagSpritePos(768,576));
        map.put("nc",new FlagSpritePos(832,576));
        map.put("ne",new FlagSpritePos(896,576));
        map.put("nf",new FlagSpritePos(960,576));
        map.put("ng",new FlagSpritePos(0,640));
        map.put("ni",new FlagSpritePos(64,640));
        map.put("nl",new FlagSpritePos(128,640));
        map.put("no",new FlagSpritePos(192,640));
        map.put("np",new FlagSpritePos(256,640));
        map.put("nr",new FlagSpritePos(320,640));
        map.put("nu",new FlagSpritePos(384,640));
        map.put("nz",new FlagSpritePos(448,640));
        map.put("om",new FlagSpritePos(512,640));
        map.put("pa",new FlagSpritePos(576,640));
        map.put("pe",new FlagSpritePos(640,640));
        map.put("pf",new FlagSpritePos(704,640));
        map.put("pg",new FlagSpritePos(768,640));
        map.put("ph",new FlagSpritePos(832,640));
        map.put("pk",new FlagSpritePos(896,640));
        map.put("pl",new FlagSpritePos(960,640));
        map.put("pn",new FlagSpritePos(0,704));
        return map;
    }
}
